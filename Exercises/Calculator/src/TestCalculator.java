import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) throws Exception {
        boolean loop = true;

        try (Scanner sc = new Scanner(System.in)) {
            Calculator cal = new Calculator();

            while (loop) {
                System.out.println("\nInput the operation:\n(1) Sum (2) Sub (3) Square root sum");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        cal.receive_data();
                        cal.addition();
                        cal.show_result_add();
                        break;
                    case 2:
                        cal.receive_data();
                        cal.subtraction();
                        break;
                    case 3:
                        cal.receive_data();
                        cal.square_root_sum();
                        break;
                    default:
                        System.out.println("This option does not exist! Try again");
                        break;
                }
            }
        }        
    }
}