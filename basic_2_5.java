//5 задание Ветвления (1.Basic of software code development)
import java.util.Scanner;
public class basic_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение х = ");
        double x = in.nextDouble();
        double result;
        if(x<=3){
            result = Math.pow(x,2) - 3*x +9;
        }else{
            result = Math.pow((Math.pow(x,3) + 6) ,-1);
        }
        System.out.println("F(x) = " + result);
    }
}
