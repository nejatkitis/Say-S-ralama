import java.sql.SQLOutput;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        a = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        b = input.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz : ");
        c = input.nextInt();
        System.out.println("Sayıların küçükten büyüğe doğru sıralı hali : ");
        if ((a<b)&&(a<c)&&(b<c)){
            System.out.println(a+","+b+","+c);
        } else if ((a<b)&&(a<c)&&(c<b)) {
            System.out.println(a+","+c+","+b);
        } else if ((b<a)&&(b<c)&&(a<c)){
            System.out.println(b+","+a+","+c);
        } else if ((b<a)&&(b<c)&&(c<a)) {
            System.out.println(b+","+c+","+a);
        } else if ((c<a)&&(c<b)&&(b<a)) {
            System.out.println(c+","+b+","+a);
        }  else  {
            System.out.println(c+","+a+","+b);
        }
    }
}
