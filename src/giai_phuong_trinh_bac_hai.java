import java.sql.SQLOutput;
import java.util.Scanner;
public class giai_phuong_trinh_bac_hai {
    public static void main(String[] args){
        float a,b,c;
        double delta,x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Đây là chương trình giải phương trình bậc 2, hãy nhập vào các giá trị a,b,c của phương trình");
        System.out.print("Nhập vào giá trị a: ");
        a = sc.nextFloat();
        System.out.print("Nhập vào giá trị b: ");
        b = sc.nextFloat();
        System.out.print("Nhập vào giá trị c: ");
        c = sc.nextFloat();
        if (a == 0){
           x1 = -c/b;
           System.out.println("Phương trình có a = 0, trở thành phương trình bậc 1 có nghiệm x = " + x1);
        }
        else{
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.print("Phương trình vô nghiệm");
            }
            else if (delta == 0){
                x1 = -b/(2*a);
                System.out.println("Phương trình có 2 nghiệm trùng nhau là: x1 = x2 = " +x1);
            }
            else{
                x1 = (-b - Math.sqrt(delta))/(2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có nghiệm thứ 1 là " + x1);
                System.out.println("Phương trình có nghiệm thứ 2 là " + x2);
            }
        }
    }
}
