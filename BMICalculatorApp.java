/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator BMI");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel weightLabel = new JLabel("Berat (kg):");
        weightLabel.setBounds(20, 30, 100, 30);
        frame.add(weightLabel);

        JTextField weightField = new JTextField();
        weightField.setBounds(120, 30, 150, 30);
        frame.add(weightField);

        JLabel heightLabel = new JLabel("Tinggi (m):");
        heightLabel.setBounds(20, 70, 100, 30);
        frame.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(120, 70, 150, 30);
        frame.add(heightField);

        JButton calculateButton = new JButton("Hitung BMI");
        calculateButton.setBounds(20, 110, 250, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Hasil: ");
        resultLabel.setBounds(20, 150, 250, 30);
        frame.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    double bmi = BMICalculator.calculateBMI(weight, height);
                    String category = BMICalculator.getBMICategory(bmi);
                    resultLabel.setText(String.format("BMI: %.2f - %s", bmi, category));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Silakan masukkan angka yang valid.");
                }
            }
        });

        frame.setVisible(true);
    }
}

