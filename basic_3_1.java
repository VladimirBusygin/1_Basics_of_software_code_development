//1 задание Циклы (1.Basic of software code development)
import java.util.Scanner;
public class basic_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число х = ");
        int x = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= x; i++){
            sum+=i;
        }
        System.out.print("Сумма = " + sum);
    }
}
