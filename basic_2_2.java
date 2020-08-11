//2 задание Ветвления (1.Basic of software code development)
import java.util.Scanner;
public class basic_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения : ");
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("c = ");
        int c = in.nextInt();
        System.out.print("d = ");
        int d = in.nextInt();
        int result;
        if(a <= b){
            if(c <= d){
                if(c >= a){
                    result = c;
                }else{
                    result = a;
                }
            }else{
                if(d >= a){
                    result = d;
                }else{
                    result = a;
                }
            }
        }else{
            if(c <= d){
                if(c >= b){
                    result = c;
                }else{
                    result = b;
                }
            }else{
                if(d >= b){
                    result = d;
                }else{
                    result = b;
                }
            }
        }
        System.out.println("max{min(a,b),min(c,d)} = " + result);
    }
}
