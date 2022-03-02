import java.util.Scanner;
public class App11 {
    public static void main(String[] args) throws Exception {
      Scanner scanner= new Scanner(System.in);
      System.out.print("Nhập số phần tử của mảng: ");
      int n = scanner.nextInt();
      int [] arr = new int [n];
      System.out.print("Nhập các phần tử của mảng: \n");
      for (int i = 0; i < n; i++) {
          System.out.printf("a[%d] = ", i);
          arr[i] = scanner.nextInt();
      }
      System.out.println("Dãy số trước sắp xếp tăng dần: ");
      show(arr);
      System.out.println();
      sortASC(arr);
      System.out.println("Dãy số được sắp xếp tăng dần: ");
      show(arr);
    }
    public static void sortASC(int [] arr) {
      int temp = arr[0];
      for (int i = 0 ; i < arr.length - 1; i++) {
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[i] > arr[j]) {
                  temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
              }
          }
      }
  }
    public static void show(int [] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
    }
}
}