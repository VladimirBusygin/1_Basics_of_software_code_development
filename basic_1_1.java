// 1 задание Линейные программы (1.Basic of software code development)
import java.util.Scanner;
public class basic_1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a = ");
        int a = in.nextInt();
        System.out.print("Введите b = ");
        int b = in.nextInt();
        System.out.print("Введите c = ");
        int c = in.nextInt();
        int z;
        z = ((a - 3)*b / 2) + c;
        System.out.println("Значение z = " + z);
    }
}
