
package pkgclass;

import java.util.Scanner;


public class CgpaMethods {
    public static Scanner in = new Scanner(System.in);
    public static int getUnit(int i, int j){
            System.out.println("Enter the unit of course "+i+" in Semester "+j);
            int unit = in.nextInt();
        return unit;
    }
    public static String getGrade (int i, int j){
            System.out.println("Enter the grade of course "+i+" in semester "+j);
            String grade = in.next();
        return grade;
    }
     public static int getnumberOfCourses (int j){
            System.out.println("Enter the number of courses registered in Semester "+j);
            int num = in.nextInt();
        return num;
    }
     public static int getnumberOfSemester (){
            System.out.println("Enter the number of semester CGPA you want to calculate: ");
            int num = in.nextInt();
        return num;
    }
     
     
}
