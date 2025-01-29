public class CreditCardInfo {
    private String cardCvv;
    private int expirationYear;
    private int expirationMonth;
    private String cardNumber;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInfo(String cardCvv, int expirationYear, int expirationMonth, String cardNumber, String nameOnCard, CardType  cardType) {
        this.cardCvv = cardCvv;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}