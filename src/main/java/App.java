import java.util.Scanner;

public class App {
    public static void main(String[] args) throws CheckException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập cân nặng(kg): ");
            double weight = scanner.nextDouble();
            if (weight <= 0) throw new CheckException("Cân nặng không hợp lệ");
            System.out.print("Nhập chiều cao(m): ");
            double height = scanner.nextDouble();
            if (height <= 0) throw new CheckException("Chiều cao không hợp lệ");
            BMI.calculateBMI(weight, height);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}