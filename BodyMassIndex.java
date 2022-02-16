import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double height, weight, BMI;

        System.out.print("Please enter your height:(m) ");
        height = scanner.nextDouble();

        System.out.print("Please enter your weight:(kg) ");
        weight = scanner.nextDouble();
        scanner.close();

        BMI = weight/(height*height);

        System.out.println("Your Body Mass Index: " + BMI);
    }
}
