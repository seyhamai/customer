import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mina extends JFrame implements ActionListener {
    private JTextField idField, lastNameField, firstNameField, phoneField;
    private JButton submitButton;

    public Mina() {
        setTitle("Customer Information");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // ID field
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        add(idLabel);
        add(idField);

        // Last Name field
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        add(lastNameLabel);
        add(lastNameField);

        // First Name field
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        add(firstNameLabel);
        add(firstNameField);

        // Phone field
        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField();
        add(phoneLabel);
        add(phoneField);

        // Submit button
        submitButton = new JButton("Previous");
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String id = idField.getText();
            String lastName = lastNameField.getText();
            String firstName = firstNameField.getText();
            String phone = phoneField.getText();

            // Display customer information
            JOptionPane.showMessageDialog(this,
                    "Customer Information:\n" +
                            "ID: " + id + "\n" +
                            "Last Name: " + lastName + "\n" +
                            "First Name: " + firstName + "\n" +
                            "Phone: " + phone,
                    "Customer Information",
                    JOptionPane.INFORMATION_MESSAGE);

            // Clear fields after submission
            idField.setText("");
            lastNameField.setText("");
            firstNameField.setText("");
            phoneField.setText("");
        }
    }

    public static void main(String[] args) {
        new Mina();
    }
}
