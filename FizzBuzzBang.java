public class FizzyPrinter {
    private boolean uppercase;

    public FizzyPrinter(boolean uppercase) {
        this.uppercase = uppercase;
    }

    public String printFizzy(int n) {
        String result = "";

        if (n % 3 == 0) {
            result += "Fizz";
        }
        if (n % 5 == 0) {
            result += "Buzz";
        }
        if (n % 7 == 0) {
            result += "Bang";
        }
        
        if (result.equals("")) {
            result = "Boom";
        }
        
        if (uppercase) {
            result = result.toUpperCase();
        }

        return result;
    }



    public static void main(String[] args) {
        FizzyPrinter printer = new FizzyPrinter(false);
        System.out.println(printer.printFizzy(3));   // Fizz
        System.out.println(printer.printFizzy(5));   // Buzz
        System.out.println(printer.printFizzy(105)); // FizzBuzzBang
    }
}
