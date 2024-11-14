/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

public class BMICalculatorApp {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan berat badan (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double height = scanner.nextDouble();
    
        double bmi = calculateBMI(weight, height);
        
        String category = getBMICategory(bmi);
        
        System.out.printf("BMI Anda adalah: %.2f\n", bmi);
        System.out.println("Kategori: " + category);
        
        scanner.close();
    }
}
