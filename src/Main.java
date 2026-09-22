import java.util.*;
public class Main{

    public static void main(String[] args){
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        name = sc.nextLine();

        System.out.println("Enter Your Age:");
        age = sc.nextInt();

        System.out.println("Enter Your GPA:");
        gpa = sc.nextDouble();

        System.out.println("Enter Your status :");
        isEnrolled=sc.nextBoolean();


        System.out.println("Enter Your Marks:");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
            //System.out.println(marks[i]);
        }
        System.out.println("Name:"+ name);
        System.out.println("Age:"+age);
        System.out.println("GPA:"+gpa);
        System.out.println("Enrolled:" +isEnrolled);
        System.out.println("Marks:"+Arrays.toString(marks));
        }
        static int calculateTotal(int[] marks){
            int total=0;
            for(int i=0;i<marks.length;i++){
                total+=marks[i];
            }
            System.out.println("total:"+total);
            return total;
        }


}