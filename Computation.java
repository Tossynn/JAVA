
package pkgclass;


public class Computation extends CgpaMethods{
    //
    static int totalpoint = 0;
    static int totalunit = 0;
    static double CGPA;
    public static void getCgpa(){
        int point=0;
        int n = getnumberOfSemester();
        //
        for (int i = 1; i<=n; i++){
            int x = getnumberOfCourses(i);
        for (int j = 1; j<=x; j++){
            int unit = getUnit(i,j);
            String g = getGrade(i,j);
            //
            if(g.equalsIgnoreCase("A")){
                point = 5*unit;
            }
            else if(g.equalsIgnoreCase("B")){
                point = 4*unit;
            }
            else if(g.equalsIgnoreCase("C")){
                point = 3*unit;
            }
            else if(g.equalsIgnoreCase("D")){
                point = 2*unit;
            }
            else if(g.equalsIgnoreCase("E")){
                point = 1*unit;
            }
            else if(g.equalsIgnoreCase("F")){
                point = 0*unit;
            }
            else{
                System.out.println("You entered a wrong grade for course "+j+" in semester "+i+" please start all over");
                System.exit(0);
          }
            totalpoint+=point;
            totalunit+=unit;
        }
        }
        CGPA = totalpoint/totalunit;
       if(n == 1){
           System.out.println("Your Grade point is: "+CGPA);
       }
       else if(n>1){
           System.out.println("Your Cummulative Grade point for"+n+ " is: "+CGPA);
       }
       else{
           System.out.println("You entered wrong number of semester");
           System.exit(0);
       }
       
    }
}


