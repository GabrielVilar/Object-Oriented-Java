package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIExample {
    public static void main(String[] args) {
        // Create a JFrame (window) and set its properties
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel (container) to hold components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Set the layout manager (how components are arranged)
        panel.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        // Create a text field
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Create a button
        JButton button = new JButton("Submit");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the text field when the button is clicked
                String name = textField.getText();

                // Check if the name is empty
                if (name.isEmpty()) {
                    // Display an error message if the name is empty
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                } else {
                    // Display a message dialog with the entered name
                    JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                }
            }
        });

        frame.setVisible(true);
    }
}

// import javax.swing.*;
// import java.awt.*;

// public class SimpleGUIExample extends JFrame {

//     public SimpleGUIExample(String title) throws HeadlessException {
//         super(title);
//         initializeElements();
//     }

//     private void initializeElements() {
//         setSize(300, 250);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Create a custom JPanel for drawing
//         CustomPanel customPanel = new CustomPanel();
//         // Add the custom panel to the content pane
//         getContentPane().add(customPanel);

//         setVisible(true);
//     }

//     // Custom JPanel for drawing
//     private static class CustomPanel extends JPanel {
//         @Override
//         protected void paintComponent(Graphics g) {
//             // Call the superclass method to ensure proper initialization
//             super.paintComponent(g);

//             // Custom painting code here
//             g.fillOval(40, 40, 60, 50);

//             // Set background color
//             setBackground(new Color(70, 80, 70));
//         }
//     }

//     public static void main(String[] args) {
//         // Run GUI code on the Event Dispatch Thread (EDT)
//         SwingUtilities.invokeLater(() -> {
//             new SimpleGUIExample("Custom Drawing Example");
//         });
//     }
// }
