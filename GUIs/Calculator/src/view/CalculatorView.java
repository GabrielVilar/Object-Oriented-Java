package view;

import javax.swing.*;

import calculator.Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        calculator = new Calculator(0, 0, 0, 0, 0, 0);

        numberField1 = new JTextField();
        numberField2 = new JTextField();

        // Set preferred size for text fields
        Dimension textFieldSize = new Dimension(150, 30);
        numberField1.setPreferredSize(textFieldSize);
        numberField2.setPreferredSize(textFieldSize);

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multButton = new JButton("*");

         // Set layout to GridBagLayout
         setLayout(new GridBagLayout());
         GridBagConstraints gbc = new GridBagConstraints();
 
         // Center the frame on the screen
         setLocationRelativeTo(null);
 
         // Add components to the frame with proper layout constraints
         gbc.insets = new Insets(2, 2, 2, 2);
         gbc.gridx = 0;
         gbc.gridy = 0;
         add(new JLabel("Number 1:"), gbc);

         gbc.gridx = 1;
         gbc.gridy = 0;
         add(numberField1, gbc);
         
         gbc.insets = new Insets(2, 2, 2, 2);
         gbc.gridx = 0;
         gbc.gridy = 1;
         add(new JLabel("Number 2:"), gbc);
 
         gbc.gridx = 1;
         gbc.gridy = 1;
         add(numberField2, gbc);
 
         gbc.gridx = 0;
         gbc.gridy = 2;
         add(addButton, gbc);
 
         gbc.gridx = 1;
         gbc.gridy = 2;
         add(subButton, gbc);
 
         gbc.gridx = 0;
         gbc.gridy = 3;
         add(divButton, gbc);
 
         gbc.gridx = 1;
         gbc.gridy = 3;
         add(multButton, gbc);

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