package Package;

public class FullTimeEmployee extends Employee {
  public int overtimeHours;
  public static int basicSalary = 2000000;
  public void addOvertimeHours(){
    System.out.println("Overtime Hours");
    overtimeHours = sc.nextInt();
  }
  public int Salary(){
    return overtimeHours*20000 + basicSalary;
  }
  public void typeOfEmployee(){
    System.out.println("Type of employee: Full-time employee");
  }
}