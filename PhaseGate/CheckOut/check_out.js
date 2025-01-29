const prompt = require("prompt-sync")();

cart = [];


const addItemToCart = (cart) => {
    let itemName = prompt("What did user buy? ");
    let itemQuantity = prompt("How many pieces: ");
    let itemPrice = prompt("How much per item: ");
    cart.push({
        itemName:itemName,
        itemQuantity:itemQuantity,
        itemPrice:itemPrice,
        total:itemPrice*itemQuantity
    });
    return `Item ${itemName} added to cart.`
};


const checkoutInvoice = (customer, cashier, discount, cart) => {
    let subtotal = 0;
    cart.forEach(item => {
        subtotal += item.total;
    });
    const vat = subtotal * 0.075;
    const billing = subtotal + vat - discount;

    const invoiceLines = cart.map(item =>
        `${item.itemName}\t ${item.itemQuantity}\t ₦${item.itemPrice}\t ₦${item.total}`
    ).join("\n\t");

    return [`
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
    TEL: 080123456789
    Date: ${new Date().toLocaleString()}
    Cashier: ${cashier}
    Customer Name: ${customer}
    =====================================================
        ITEM    QTY     PRICE     TOTAL(NGN)
    -----------------------------------------------------
    ${invoiceLines}
    -----------------------------------------------------
                                Sub Total: ₦${subtotal}
                                Discount: ₦${discount}
                                VAT: ₦${vat}
    =====================================================
                                Billing Total: ₦${billing}
    =====================================================
    THIS IS NOT A RECEIPT KINDLY PAY ₦${billing}
    =====================================================
    `, billing];
};


const processCustomerTransaction = (customerName) => {
    while (true) {
        addItemToCart(cart);
        const moreItemOption = prompt("Do you want to add more items? (y/n): ");

        if (['y', 'yes', 'ok'].includes(moreItemOption.toLowerCase())) {
            continue;
        }

        const cashier = prompt("What is your name? ");
        const discount = parseFloat(prompt("How much discount would the customer get? "));
        const [invoice, billing] = checkoutInvoice(customerName, cashier, discount, cart);

        console.log(invoice);

        while (true) {
            const customerPaid = parseFloat(prompt("How much did customer pay? "));
            if (customerPaid === billing) {
                console.log(`${customerName} paid ₦${customerPaid} successfully!`);
                break;
            } else if (customerPaid > billing) {
                console.log(`${customerName} has paid but would be balanced with ₦${customerPaid - billing}`);
                break;
            } else if (customerPaid < billing) {
                let newBill = billing;
                newBill -= customerPaid;
                console.log(`${customerName}'s payment is incomplete, remaining ₦${newBill} to complete payment.`);
                continue;
            }
        }

        console.log("Closing transaction for next customer");
        break;
    }
};


while (true) {
    const option = prompt("Enter 'start' to process customer transaction or (end/exit) to close:");
    if (['exit', 'close', 'end'].includes(option.toLowerCase())) {
        cart.splice(0, cart.length);
        break;
    } else if (option.toLowerCase() === 'start') {
        const customerName = prompt("What is the name of the customer: ");
        processCustomerTransaction(customerName);
    } else {
        console.log("Invalid option, enter (start or end/exit) to close transaction");
        continue;
    }
}
