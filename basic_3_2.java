//2 задание Циклы (1.Basic of software code development)
import java.util.Scanner;
public class basic_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите концы отрезка от a до b с шагом h :");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("h = ");
        double h = in.nextDouble();
        System.out.println("Значения функции на отрезке от "+a+" до "+b+" с шагом "+h);
        for(double i = a; i<=b; i+= h){
            if(i <= 2){
                System.out.print(-i+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
