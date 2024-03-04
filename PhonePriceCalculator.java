import java.util.Scanner;

public class PhonePriceCalculator {
    private Scanner scanner;
    private double totalPhonePrice;
    private double subtotalPhonePrice;
    private double taxRate;
    private double phoneModelPrice;
    private double phoneScreenPrice;
    private double phoneStoragePrice;
    private double phone6GPrice;
    private String phoneModel;

    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to the Phone Price Calculator!");
        System.out.println("--------------------------------------");

        PhonePriceCalculator calculator = new PhonePriceCalculator(); 
        calculator.start();
    }

    public void start() {
        scanner = new Scanner(System.in);
        getPhoneModel();
        getScreenSize();
        getStorageSize();
        get6GUpgrade();
        getEnd();
        scanner.close();
    }
    
    // Phone Model Method
    // User selects their new phone here.
    public void getPhoneModel() {
        char phoneModelOptions[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        String phoneModels[] = {"Apple iPhone", "Apple iPhone Pro", "Samsung Galaxy", "Samsung Galaxy Ultra", "Google Pixel", "Google Pixel Pro",};
        char userChoice;
        
        System.out.println("Please select a phone model to purchase.");
            for (int i = 0; i < phoneModels.length; i++) {
            System.out.println("(" + phoneModelOptions[i] + ") " + phoneModels[i]);
            }

        System.out.println("Please enter your choice below (A-F): ");
            userChoice = scanner.next().charAt(0);
            userChoice = Character.toUpperCase(userChoice);
        System.out.println("Your choice was: " + userChoice);

            if (userChoice == 'A') {
                phoneModelPrice = 799.00;
                phoneModel = "iphone";
            } else if (userChoice == 'B') {
                phoneModelPrice = 999.00;
                phoneModel = "iphone Pro";
            } else if (userChoice == 'C') {
                phoneModelPrice = 799.00;
                phoneModel = "Samsung Galaxy";
            } else if (userChoice == 'D') {
                phoneModelPrice = 1200.00;
                phoneModel = "Samsung Galaxy Ultra";
            } else if (userChoice == 'E') {
                phoneModelPrice = 599.00;
                phoneModel = "Google Pixel";
            } else if (userChoice == 'F') {
                phoneModelPrice = 899.00;
                phoneModel = "Google Pixel Pro";
            } else {
                phoneModelPrice = 0.0;
                System.out.println("Error! Phone model was not selected. Sorry, please try again.");
            }

        subtotalPhonePrice = phoneModelPrice;
        System.out.println("Subtotal phone price = $" + subtotalPhonePrice);
    }

    // Screen Size Method
    // User selects the screen size of their new phone here.
    public void getScreenSize() {
        char screenSizeOptions[] = {'A', 'B', 'C'};
        String screenSizes[] = {"5.5 inches", "6.2 inches", "6.9 inches"};
        char userChoice;

        System.out.println("Please select a screen size for your new " + phoneModel + ".");
            for (int i = 0; i < screenSizes.length; i++) {
                System.out.println("(" + screenSizeOptions[i] + ") " + screenSizes[i]);
            }
        
        System.out.println("Please enter your choice below (A-C): ");
            userChoice = scanner.next().charAt(0);
            userChoice = Character.toUpperCase(userChoice);
        System.out.println("Your choice was: " + userChoice);

            if (userChoice == 'A') {
                phoneScreenPrice = 0.00;
            } else if (userChoice == 'B') {
                phoneScreenPrice = 199.00;
            } else if (userChoice == 'C') {
                phoneScreenPrice = 299.00;
            } else {
                phoneScreenPrice = 0.00;
                System.err.println("Error! Screen size was not selected. Sorry, please try again");
            }

        subtotalPhonePrice = phoneScreenPrice + phoneModelPrice;
        System.out.println("Subtotal phone price = $" + subtotalPhonePrice);

    }

    // Storage Method
    // User selects the storage size of their new phone here.
    public void getStorageSize() {
        char storageSizeOptions[] = {'A', 'B', 'C', 'D'};
        String storageSizes[] = {"128 GB", "256 GB", "512 GB", "1 TB"};
        char userChoice;

        System.out.println("Please select a storage size for your new " + phoneModel + ".");
            for(int i = 0; i < storageSizes.length; i++) {
                System.out.println("(" + storageSizeOptions[i] + ") " + storageSizes[i]);
            }
        
        System.out.println("Please enter your choice below (A-D): ");
            userChoice = scanner.next().charAt(0);
            userChoice = Character.toUpperCase(userChoice);
        System.out.println("Your choice was: " + userChoice);

            if (userChoice == 'A') {
                phoneStoragePrice = 0.00;
            } else if (userChoice == 'B') {
                phoneStoragePrice = 99.00;
            } else if (userChoice == 'C') {
                phoneStoragePrice = 199.00;
            } else if (userChoice == 'D') {
                phoneStoragePrice = 399.00;
            } else {
                phoneStoragePrice = 0.00;
                System.err.println("Error! Storage size was not selected. Sorry, please try again.");
            }

        subtotalPhonePrice = phoneStoragePrice + phoneScreenPrice + phoneModelPrice;
        System.out.println("Subtotal phone price = $" + subtotalPhonePrice);
    }

    // 6G Upgrade Method
    // User will have the option to upgrade their new phone with a 6G cellular modem.
    public void get6GUpgrade() {
        char sixGOptions[] = {'Y', 'N'};
        String sixG[] = {"Yes", "No"};
        char userChoice;

        System.out.println("Would you like the optional 6G upgrade for your " + phoneModel + "?");
            for(int i = 0; i < sixG.length; i++) {
                System.out.println("(" + sixGOptions[i] + ") " + sixG[i]);
            }

        System.out.println("Please enter your choice below (Y or N): ");
            userChoice = scanner.next().charAt(0);
            userChoice = Character.toUpperCase(userChoice);
        System.out.println("Your choice was: " + userChoice);

            if (userChoice == 'Y') {
                phone6GPrice = 99.00;
            } else if ( userChoice == 'N') {
                phone6GPrice = 0.00;
            } else {
                phone6GPrice = 0.00;
                System.err.println("Error! 6G upgrade option was not selected. Sorry, please try again.");
            }

        subtotalPhonePrice = phone6GPrice + phoneStoragePrice + phoneScreenPrice + phoneModelPrice;
        System.out.println("--------------------------------------");
        System.out.println("Subtotal phone price = $" + subtotalPhonePrice);
    }
    // End Method
    // User has the sales tax calculated on their new phone 
    public void getEnd() {
        taxRate = subtotalPhonePrice * 0.085;
        totalPhonePrice = subtotalPhonePrice + taxRate;

    System.out.println("Sales Tax = 8.5%");
    System.out.println("Total phone price = $" + totalPhonePrice);
    System.out.println("--------------------------------------");
    System.out.println("Thank you for shopping with us today! We hope you enjoy your new " + phoneModel + ".");

    }
}
