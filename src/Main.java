import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        float height = 1.7F;
        int weight = 60;
        float bmi = service.calculate(height, weight);

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        System.out.println(decimalFormat.format(bmi));
    }
}
