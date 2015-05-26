package Logic;

public class Card {
    private final String titularName;
    private final String titularLastName;
    private final String cardType;
    private final String cardNumber;
    private final String securityCode;
    private final int expirationMonth;
    private final int expirationYear;

    public Card(String titularName, String titularLastName, String cardType, 
    String cardNumber, String securityCode, int expirationMonth, int expirationYear) {
        this.titularName = titularName;
        this.titularLastName = titularLastName;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }

    public String getTitularName() {
        return titularName;
    }

    public String getTitularLastName() {
        return titularLastName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }
}
