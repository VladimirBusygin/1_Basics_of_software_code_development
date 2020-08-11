// 2 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение а = ");
        double a = in.nextDouble();
        System.out.print("Введите значение b = ");
        double b = in.nextDouble();
        System.out.print("Введите значение с = ");
        double c = in.nextDouble();
        double result;
        result = (((Math.sqrt(Math.pow(b,2) + 4*a*c) + b) / (2*a)) - Math.pow(a,3)*c + Math.pow(b, -2));
        System.out.print("Знвчение выражения = " + result);
    }
}
