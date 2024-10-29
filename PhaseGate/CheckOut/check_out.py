import datetime

cart = []

def add_item_to_cart(cart: list) -> str:
    item_name = input("What did user buy? ")
    item_quantity = int(input("How many pieces: "))
    item_price = float(input("How much per item: "))
    cart.append(dict(
        item_name=item_name,
        item_quantity=item_quantity,
        item_price=item_price,
        total=item_price * item_quantity
    ))
    return f"Item {item_name} added to cart."


def checkout_invoice(customer: str, cashier: str, discount: float, cart: list) -> str:
    subtotal = sum(item['total'] for item in cart)
    vat = subtotal * 0.075
    billing = subtotal + vat - discount
    invoice = "\n".join(
        f"{item['item_name']}\t {item['item_quantity']}\t ₦{item['item_price']:.2f}\t ₦{item['total']:.2f}"
        for item in cart
    )
    return (f"""
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
    TEL: 080123456789
    Date: {datetime.datetime.now().strftime("%a' %d %b %Y %H:%M:%S")}
    Cashier: {cashier}
    Customer Name: {customer}
    =====================================================
    ITEM    QTY     PRICE     TOTAL(NGN)
    -----------------------------------------------------
    {invoice}
    -----------------------------------------------------
                                Sub Total: ₦{subtotal:.2f}
                                Discount: ₦{discount:.2f}
                                VAT: ₦{vat:.2f}
    =====================================================
                                Billing Total: ₦{billing:.2f}
    =====================================================
    THIS IS NOT A RECEIPT KINDLY PAY ₦{billing:.2f}
    =====================================================
    """, billing)


customer_name = input("What is the name of the customer: ")


def process_customer_transaction():
    while True:
        add_item_to_cart(cart)
        more_item_option = input("Do you want to add more items? (y/n): ")
        if more_item_option.lower() in ["y", "yes", "ok"]:
            continue
        cashier = input("What is your name? ")
        discount = float(input("How much discount would the customer get? "))
        invoice = checkout_invoice(customer_name, cashier, discount, cart)[0]
        billing = checkout_invoice(customer_name, cashier, discount, cart)[1]
        print(invoice)
        while True:
            customer_paid = float(input("How much did customer pay? "))
            if customer_paid == billing:
                print(f"{customer_name} paid ₦{customer_paid:.2f} successfully!")
                break
            elif customer_paid > billing:
                print(f"{customer_name} has paid but would be balanced with ₦{customer_paid-billing:.2f}")
                break
            elif customer_paid < billing:
                print(f"{customer_name}'s payment is incomplete remaining ₦{billing - customer_paid:.2f} to complete payment.")
                continue
        print("Closing transaction for next customer")
        break


while True:
    option = input("Enter 'start' to process customer transaction or (end/exit) to close:")
    if option.lower() in ["exit", "close", "end"]:
        break
    elif option.lower() == "start":
        process_customer_transaction()
    else:
        print("Invalid option enter (start or end/exit) to close transaction")
        continue
