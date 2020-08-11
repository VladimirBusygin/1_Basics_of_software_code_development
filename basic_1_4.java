// 4 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число R = ");
        double R = in.nextDouble();
        int a =(int) R ;
        int b =(int) ((R - a)*1000);
        double result = b + (double)a/1000;
        System.out.println(result);

    }
}
