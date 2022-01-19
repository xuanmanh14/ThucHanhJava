import java.util.Scanner;
public class App {
  public static void main(String[] args) throws Exception {
    double heSoA1,heSoB1,heSoC1,heSoA2,heSoB2,heSoC2,dd,dx,dy;
    System.out.println("Nhap A1");
    Scanner sc = new Scanner(System.in);
    heSoA1 = sc.nextDouble();
    System.out.println("Nhap B1");
    heSoB1 = sc.nextDouble();
    System.out.println("Nhap C1");
    heSoC1 = sc.nextDouble();
    System.out.println("Nhap A2");
    heSoA2 = sc.nextDouble();
    System.out.println("Nhap B2");
    heSoB2 = sc.nextDouble();
    System.out.println("Nhap C2");
    heSoC2 = sc.nextDouble();
    dd=heSoA1*heSoB2-heSoB1*heSoA2; dx=heSoC1*heSoB2-heSoB1*heSoC2; dy=heSoA1*heSoC2-heSoA2*heSoC1;
    if(dd==0)
      if(dx==0 && dy==0){
        System.out.println("He vo so nghiem");
      }
      else System.out.println("He vo nghiem");
    else
      System.out.println("He co nghiem duy nhat" + " x=" + (dx/dd) + " va y= " +(dy/dd));
  }
}

