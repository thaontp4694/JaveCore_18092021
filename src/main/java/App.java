import java.util.Scanner;

public class App {
    public static void main(String[] args) throws CheckException {
        Scanner scanner = new Scanner(System.in);
        double w, h;
        try {
            System.out.print("Nhập cân nặng(kg): ");
            String weight = scanner.nextLine();
            if (isDouble(weight)) {
                w = Double.parseDouble(weight);
            } else {
                throw new NumberFormatException("Cân nặng nhập vào không đúng định dạng");
            }
            if (w <= 0) {
                throw new CheckException("Cân nặng không hợp lệ");
            }
            System.out.print("Nhập chiều cao(m): ");
            String height = scanner.nextLine();
            if (isDouble(height)) {
                h = Double.parseDouble(height);
            } else {
                throw new NumberFormatException("Chiều cao nhập vào không đúng định dạng");
            }
            if (h <= 0) {
                throw new CheckException("Chiều cao không hợp lệ");
            }
            BMI.calculateBMI(w, h);
        } catch(Exception e){
                e.printStackTrace();
            }
        }
    private static boolean isDouble(String x) { //check số kiểu double
        if (x == null)
            return false;
        try {
            double a = Double.parseDouble(x);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}