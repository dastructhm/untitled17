package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JPanel MainPanel;
    private JPanel TopPanel;
    private JPanel bottomPanel;
    private JTextField num1Field;
    private JButton addButton;
    private JButton modButton;
    private JButton clearButton;
    private JTextField num2Field;
    private JTextField resultField;

    public SimpleCalculator() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = num1Field.getText();
                String num2 = num2Field.getText();
                double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                resultField.setText(result + " ");
            }
        });
    } // end constructor

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleCalculator");
        frame.setContentPane(new SimpleCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
} // end simpleCalculator, control + shift + F10
