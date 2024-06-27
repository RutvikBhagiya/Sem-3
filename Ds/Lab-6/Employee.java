//. Create class Employee_Detail with attributes Employee_ID, Name, Designation, 
// and Salary. Write a program to read the detail from user and print it.
import java.util.*;
class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;

    public void readEmp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        Employee_ID = sc.nextInt();
        System.out.println("Enter Employee name : ");
        Name = sc.next();
        System.out.println("Enter Employee Designation : ");
        Designation = sc.next();
        System.out.println("Enter Employee Salary : ");
        Salary = sc.nextInt();
    }
    public void writeEmp(){
        System.out.println("Employee's Id is : "+Employee_ID );
      
        System.out.println("Employee Name is : "+ Name);
       
        System.out.println("Employee Designation is : "+Designation);
         
        System.out.println("Employee Salary is : "+Salary);
    }
}

class Employee{
    public static void main(String[] args){
        Employee_Detail Emp = new Employee_Detail();
        Emp.readEmp();
        Emp.writeEmp();
    }
}