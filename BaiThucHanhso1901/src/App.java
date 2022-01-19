/* import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Khai bao bien
        double heSoA, heSoB, nghiemX;
        // Can thong bao cho nguoi dung nhap vao he so
        System.out.println("Nhap he so A: ");
        // Doc gia tri nguoi dung nhap vao tu ban phim => gan vao bien
        // Khai bao doi tuong Scanner de doc du lieu tu nguoi dung vao
        Scanner sc = new Scanner(System.in);
        // Gan gia tri nguoi dung nhap vao tu ban phim cho bien so heSoA
        heSoA = sc.nextDouble();
        // Can thong bao cho nguoi dung vao he so
        System.out.println("Nhap he so B: ");
        heSoB = sc.nextDouble();
        nghiemX = -heSoB / heSoA;
    }
}
 */

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap he so bac 2, a = ");
        float a = App.scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = App.scanner.nextFloat();
        System.out.print("Nhap hang so tu do, c = ");
        float c = scanner.nextFloat();
        App.giaiPTBac2(a, b, c);
    }

    /**
     * Giai phuong trinh bac 2: ax2 + bx + c = 0
     * 
     * @param a: he so bac 2
     * @param b: he so bac 1
     * @param c: so hang tu do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        // kiem tra cac he so
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tinh delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tinh nghiem
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
} 