import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class FizzyPrinter {
    private boolean uppercase;


    public FizzyPrinter(boolean uppercase) {
        this.uppercase = uppercase;
    }


    public String printFizzy(int n) {
        StringBuilder result = new StringBuilder();

        if (n % 3 == 0) {
            result.append("Fizz");
        }
        if (n % 5 == 0) {
            result.append("Buzz");
        }
        if (n % 7 == 0) {
            result.append("Bang");
        }
        
        if (result.length() == 0) {
            result.append("Boom");
        }
        
        if (uppercase) {
            return result.toString().toUpperCase();
        }

        return result.toString();
    }
}




public class FizzyPrinterTest {

    @Test
    public void testFizz() {
        FizzyPrinter printer = new FizzyPrinter(false);
        assertEquals("Fizz", printer.printFizzy(3));
    }

    @Test
    public void testBuzz() {
        FizzyPrinter printer = new FizzyPrinter(false);
        assertEquals("Buzz", printer.printFizzy(5));
    }

    @Test
    public void testFizzBuzzBang() {
        FizzyPrinter printer = new FizzyPrinter(false);
        assertEquals("FizzBuzzBang", printer.printFizzy(105));
    }

    @Test
    public void testBoom() {
        FizzyPrinter printer = new FizzyPrinter(false);
        assertEquals("Boom", printer.printFizzy(8));
    }

    @Test
    public void testUpperCase() {
        FizzyPrinter printer = new FizzyPrinter(true);
        assertEquals("FIZZBUZZBANG", printer.printFizzy(105));
    }
}
