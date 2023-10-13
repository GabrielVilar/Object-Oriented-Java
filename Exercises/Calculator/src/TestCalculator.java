import javax.swing.JOptionPane;
public class TestCalculator {
    public static void main(String[] args) throws Exception {
        boolean loop = true;
        int op;

        Calculator cal = new Calculator();

        while (loop) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "Input the operation:\n(1) Sum\n(2) Sub\n(3) Division\n" +
                "(To exit press 'calcel' os the 'X' button)"));
            switch (op) {
                case 1:
                    cal.receive_data();
                    cal.addition();
                    cal.show_result_add();
                    break;
                case 2:
                    cal.receive_data();
                    if(cal.number01 < 0 && cal.number02 < 0){
                        JOptionPane.showMessageDialog(null,"Negative values aren't allowed! Try again!");
                    }else{
                        cal.subtraction();
                        cal.show_result_sub();
                    }
                    break;
                case 3:
                    cal.receive_data();
                    if((cal.number01 == 0 || cal.number02 == 0) || (cal.number01 == 0 && cal.number02 == 0)){
                        JOptionPane.showMessageDialog(null,"We can not divide by 0 or divide 0.\n" + 
                        "Try again with different numbers!");
                    }else{
                        cal.division();
                        cal.show_result_division();
                    }                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"This option does not exist, Try again!");
                    break;
            }
        }       
    }
}