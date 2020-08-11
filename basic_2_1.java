//1 задание Ветвления (1.Basic of software code development)
import java.util.Scanner;
public class basic_2_1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите углы в градусах");
       System.out.print("first angle = ");
       int firstAngle = in.nextInt();
       System.out.print("second angle = ");
       int secondAngle = in.nextInt();
       if(firstAngle + secondAngle > 180){
           System.out.println("Такого треугольника не существует!");
       }else{
           if( (firstAngle == 90) || (secondAngle == 90) || ((180 - firstAngle - secondAngle) == 90)){
               System.out.println("Треугольник существует");
               System.out.println("Треуголник - прямоугольный!");
           }else{
               System.out.println("Треугольник существует");
               System.out.println("Треугольник - НЕ прямоугольный!");
           }
       }
    }
}
