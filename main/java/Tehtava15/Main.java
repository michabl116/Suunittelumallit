package Tehtava15;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        // Set initial date
        date.setYear(2025);
        date.setMonth(10); // October
        date.setDay(9);

        System.out.println("Initial Date: " + date);

        // Advance by 5 days
        date.advanceDays(5);
        System.out.println("After advancing 5 days: " + date);

        // Advance by 30 more days
        date.advanceDays(30);
        System.out.println("After advancing 30 more days: " + date);
    }
}
