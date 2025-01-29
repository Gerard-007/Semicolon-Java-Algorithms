public class Billing {
    private String receiverPhoneNumber;
    private String receiverName;
    private Address deliveryAddress;
    private CreditCardInfo creditCardInfo;

    public Billing(String receiverPhoneNumber, String receiverName, Address deliveryAddress, CreditCardInfo creditCardInfo) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInfo = creditCardInfo;
    }
}