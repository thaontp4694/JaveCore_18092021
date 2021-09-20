public class BMI {
    double height, weight, BMI;

    public static void calculateBMI(double weight, double height) {
        double bmi = 0;
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println("Chỉ số BMI của bạn: " + bmi + " - Thiếu cân");
        else if (bmi < 25.0)
            System.out.println("Chỉ số BMI của bạn: " + bmi + " - Bình thường");
        else if (bmi < 30.0)
            System.out.println("Chỉ số BMI của bạn: " + bmi + " - Thừa cân");
        else
            System.out.println("Chỉ số BMI của bạn: " + bmi + " - Béo phì");
    }
}