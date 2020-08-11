//3 задание Ветвления (1.Basic of software code development)
import java.util.Scanner;
public class basic_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //через любые две точки можно провести прямую, через уравнение прямой можно найти в каком соотношение находятся
        //координаты любой точки принадлежащей этой прямой, достаточно проверить удовлетворяют ли координаты 3-ей точки
        //этому соотношению
        System.out.println("Введите координаты точек A(x1,y1), B(x2,y2) и C(x3, y3) : ");
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("y1 = ");
        int y1 = in.nextInt();
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("y2 = ");
        int y2 = in.nextInt();
        System.out.print("x3 = ");
        int x3 = in.nextInt();
        System.out.print("y3 = ");
        int y3 = in.nextInt();
        //из уравнения прямой проходящей через 2 тчоки
        if( (x3 - x1)*(y2 - y1) == (x2 - x1)*(y3 - y1) ){
            System.out.println("Точки расположены на одной прямой!");
        }else{
            System.out.println("Точки НЕ расположены на одной прямой!");
        }
    }
}
