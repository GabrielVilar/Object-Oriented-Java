import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Calculator {
    float number01, number02, add, sub, div, mult;

    DecimalFormat df = new DecimalFormat();
    
    public void receive_data(){
        number01 = Float.parseFloat(JOptionPane.showInputDialog("Input the first number: "));
        number02 = Float.parseFloat(JOptionPane.showInputDialog("Input the second number: "));
    }

    public void addition(){
        add = (number01 + number02);
    }

    public void subtraction(){
        sub = (number01 - number02);
    }

    public void division(){
        div = ((number01) / (number02));
    }

    public void multiplication(){
        mult = ((number01) * (number02));
    }

    public void show_result_add(){
        df.applyPattern("#,##0.00");
        JOptionPane.showMessageDialog(null,
        "First number: "+df.format(number01)+"\nSecond number: "+df.format(number02)+
        "\nSum ("+df.format(number01)+") + ("+df.format(number02)+") = "+df.format(add), "Calculator", 1);
    }

    public void show_result_sub(){
        df.applyPattern("#,##0.00");
        JOptionPane.showMessageDialog(null,
        "First number: "+df.format(number01)+"\nSecond number: "+df.format(number02)+
        "\nSub ("+df.format(number01)+") - ("+df.format(number02)+") = "+df.format(sub), "Calculator", 1);
    }

    public void show_result_division(){
        df.applyPattern("#,##0.00");
        JOptionPane.showMessageDialog(null,
        "First number: "+df.format(number01)+"\nSecond number: "+df.format(number02)+
        "\nDivision ("+df.format(number01)+") / ("+df.format(number02)+") = "+df.format(div), "Calculator", 1);
    }

    public void show_result_mult(){
        df.applyPattern("#,##0.00");
        JOptionPane.showMessageDialog(null, "First number: "+df.format(number01)
        +"\nSecond number: "+df.format(number02)+"\nMult ("+df.format(number01)+") * ("+df.format(number02)+") = "+df.format(mult), "Calculator", 1);
    }

}