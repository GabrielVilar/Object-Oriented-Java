package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculator.Calculator;

public class CalculatorView extends JFrame {

    private JTextField numberField1;
    private JTextField numberField2;
    private JButton addButton;
    private JButton subButton;
    private JButton divButton;
    private JButton multButton;

    private Calculator calculator;

    public CalculatorView() {

        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        numberField1 = new JTextField();
        numberField2 = new JTextField();

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multButton = new JButton("*");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('/');
            }
        });

        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });

        add(new JLabel("Number 1: "));
        add(numberField1);
        add(new JLabel("Number 2: "));
        add(numberField2);
        add(addButton);
        add(subButton);
        add(divButton);
        add(multButton);

        calculator = new Calculator(0, 0, 0, 0, 0, 0);

        setVisible(true);
    }

    private void performOperation(char operation) {
        try {
            float num1 = Float.parseFloat(numberField1.getText());
            float num2 = Float.parseFloat(numberField2.getText());

            calculator.setNumber01(num1);
            calculator.setNumber02(num2);

            float result = 0;
            switch (operation) {
                case '+':
                    result = calculator.addition(num1, num2);
                    break;
                case '-':
                    result = calculator.subtraction(num1, num2);
                    break;
                case '/':
                    result = calculator.division(num1, num2);
                    break;
                case '*':
                    result = calculator.multiplication(num1, num2);
                    break;
            }

            JOptionPane.showMessageDialog(this, "Result: " + result, "Calculation Result",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "Error in calculation. Division by zero is not allowed.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}