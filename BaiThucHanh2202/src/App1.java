import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so thu nhat:");
            num1 = sc.nextInt();
        }while(num1 <= 0 );
        do{
            System.out.print("Nhap so thu hai:");
            num2 = sc.nextInt();
        }while(num2 <= 0 );
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("Uoc chung lon nhat la: %d", num2);
    }
}