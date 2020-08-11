// 3 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение х = ");
        double x = in.nextDouble();
        System.out.print("Введите значение y = ");
        double y = in.nextDouble();
        double result = ((Math.sin(x) + Math.cos(y)) * Math.tan(x*y)) / (Math.cos(x) - Math.sin(y));
        System.out.print("Значение выражения = " + result);
    }
}
