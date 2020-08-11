////7 задание Циклы (1.Basic of software code development)
import java.util.Scanner;
public class basic_3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите промежуток от m до n :");
        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        for(int i = m ;i <= n;i++){
            System.out.println("Делители числа - " + i +" :");
            boolean flag = false;
            for(int k = 2; k < i;k++){
                if(i%k == 0){
                    System.out.print(k + " ");
                    flag = true;
                }
            }
            if(flag!=true){
                System.out.print("Число простое...");
            }
            System.out.println();
        }
    }
}
