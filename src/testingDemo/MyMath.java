package testingDemo;

public class MyMath{
    public static int add (int number1, int number2){
        return number1 + number2;
    }
    public static double power (double base, double exponent){
        double answer = 1;
        if (exponent < 0){
            for (int i = 0; i < -exponent; i++){
                answer *= 1.0 / base;
            }
        }
        else if (exponent > 0){
            for (int i = 0; i < exponent; i++){
                answer *= base;
            }
        }
        return answer;
    }
}