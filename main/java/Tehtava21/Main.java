package Tehtava21;

public class Main {
    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        // Chuck Norris joke
        try {
            String joke = facade.getAttributeValueFromJson(
                    "https://api.chucknorris.io/jokes/random", "value");
            System.out.println("Chuck Norris joke:");
            System.out.println(joke);
        } catch (Exception e) {
            System.err.println("Error fetching joke: " + e.getMessage());
        }

        // Exchange rate EUR to USD
        try {
            String eurRate = facade.getAttributeValueFromJson(
                    "https://api.fxratesapi.com/latest", "rates.EUR");
            System.out.println("\nUSD to EUR exchange rate:");
            System.out.println(eurRate);
        } catch (Exception e) {
            System.err.println("Error fetching exchange rate: " + e.getMessage());
        }

    }
}
