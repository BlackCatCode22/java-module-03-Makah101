package mystuff;

public class Driver {
    public static void main(String[] args) {
        MyStuff creditCard = new MyStuff();
        creditCard.fullName = "Marco Jimenez";
        creditCard.cardNumber = "1234-5678-9101-1121";
        creditCard.cvcNumber = 123;
        creditCard.expirationMonth = 11;
        creditCard.expirationYear = 2025;
        creditCard.areaCode = 93704;

        System.out.println(creditCard.cardNumber);
    }
}
