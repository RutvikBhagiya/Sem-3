// Create array of object of class Student_Detail with attributes Enrollment_No, 
// Name, Semester, CPI for 5 students, scan their information and print it.
import java.util.*;

class Student_Detail{
    String Enrollment_No;
    String Name;
    int Semester;
    double CPI;

    public void readStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EnrollmentNo of Student:");
        Enrollment_No = sc.next();
        System.out.println("Enter Name of Student:");
        Name = sc.next();
        System.out.println("Enter Semester of Student:");
        Semester = sc.nextInt();
        System.out.println("Enter CPI of Student:");
        CPI = sc.nextDouble();
    }
    public void writeStu(){
        System.out.println("EnrollmentNo of Student is : "+Enrollment_No);
        System.out.println("Name of Student is : "+Name);
        System.out.println("Semester of Student is : "+Semester);
        System.out.println("CPI of Student is : "+CPI);
    }
}

class Student{
    public static void main(String[] args){
        Student_Detail[] stu = new Student_Detail[5];
        for(int i=0;i<5;i++){
            stu[i] = new Student_Detail();
        }
        for(int i=0;i<5;i++){
            System.out.println("For Student no : "+(i+1));
            stu[i].readStu();
        }
         for(int i=0;i<5;i++){
            System.out.println("Student no : "+(i+1));
            stu[i].writeStu();
        }
    }
}