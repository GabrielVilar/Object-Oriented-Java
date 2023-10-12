import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Calculator {
    int number01, number02, add, sub, sqr_root_sm;

    DecimalFormat df = new DecimalFormat();
    

    public void receive_data(){
        number01 = Integer.parseInt(JOptionPane.showInputDialog("Input the first number: "));
        number02 = Integer.parseInt(JOptionPane.showInputDialog("Input the second number:"));

        if(number01 < 0 && number02 < 0){
            JOptionPane.showMessageDialog(null,"Negative values aren't allowed! Try again!");
        }
    }

    public void addition(){
        add = (number01 + number02);
    }

    public void subtraction(){
        sub = (number01 - number02);
    }

    public void square_root_sum(){
        sqr_root_sm = (int)(Math.sqrt(number01) + Math.sqrt(number02));
    }

    public void show_result_add(){
        df.applyPattern("#,##0.00");
        System.out.println("-----------------\nCalculator history\nNumber 01: "+df.format(number01)+
        "\nNumber 02: "+ df.format(number02)+"\nSum: "+ df.format(add)+"\n-----------------");
    }

}