import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

    ArrayList<Integer> listFibonacci = new ArrayList<>();

    private void addNumber(int number) {
        this.listFibonacci.add(number);
    }

    private void generator(int value) {
        int f1, f2 = 0, f3;
        for (f3 = 1; f2 <= value; f3 = f1 + f2) {
            this.addNumber(f2);
            f1 = f2;
            f2 = f3;
        }
        this.addNumber(f2);
    }

    public List<Integer> getNumbers(int value) {
        generator(value);
        return this.listFibonacci;
    }

    public static List<Integer> fibonacci() {
        DesafioApplication fibonacci = new DesafioApplication();
        return fibonacci.getNumbers(350);
    }

    public static Boolean isFibonacci(Integer a) {
        DesafioApplication fibonacci = new DesafioApplication();
        for (Integer number : fibonacci.getNumbers(a)) {
            if (a.equals(number)) {
                return true;
            }
        }
        return false;
    }

}