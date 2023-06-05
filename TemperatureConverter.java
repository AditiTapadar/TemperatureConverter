import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("---------------------");
        
        while (true) {
            System.out.println("Enter the temperature value: ");
            double temperature = scanner.nextDouble();
            
            System.out.println("Choose the temperature scale:");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thank you for using the Temperature Converter. Goodbye!");
                break;
            }
            
            double convertedTemperature = 0.0;
            String scaleFrom = "";
            String scaleTo = "";
            
            switch (choice) {
                case 1:
                    convertedTemperature = convertCelsius(temperature);
                    scaleFrom = "Celsius";
                    scaleTo = "Fahrenheit";
                    break;
                case 2:
                    convertedTemperature = convertFahrenheit(temperature);
                    scaleFrom = "Fahrenheit";
                    scaleTo = "Celsius";
                    break;
                case 3:
                    convertedTemperature = convertKelvin(temperature);
                    scaleFrom = "Kelvin";
                    scaleTo = "Celsius";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            System.out.println(temperature + " " + scaleFrom + " is equal to " + convertedTemperature + " " + scaleTo + ".");
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static double convertCelsius(double temperature) {
        return (temperature * 9/5) + 32;
    }
    
    public static double convertFahrenheit(double temperature) {
        return (temperature - 32) * 5/9;
    }
    
    public static double convertKelvin(double temperature) {
        return temperature - 273.15;
    }
}
