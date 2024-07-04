import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentGradeCalculator{
public static void main(String[] args) {
    System.out.println("Welcome to our grade calculator program! Please enter number of subjects: ");
    Scanner sc = new Scanner(System.in);
    int number = getIntInput(sc);
    Subjects[] array = new Subjects[number];
    System.out.println("Please enter the your grade for each subject (out of 100): ");
    double total = 0;
    int totalCredits = 0;
    double totalPts = 0;
    for (int i = 0 ; i< number ; i++){
        System.out.println("Enter mark and credit hours for subject "+(i+1));
        double mark = getNumberInput(sc);
        int credits = getIntInput(sc);
        array[i] = new Subjects(mark, credits);
        total += array[i].getMark();
        totalCredits += array[i].getCreditHrs();
        totalPts += array[i].getPoints();
    }
    double percentage = (total / (number * 100))*100;
    System.out.println("Your percentage is: " + percentage + " %");
    System.out.println("and your overall grade is: " + getGradePercentage(percentage));
    System.out.println("with GPA: "+(double) totalPts/totalCredits);

    System.out.println("Your grades respectively are: ");
    for (int i = 0 ; i< number ; i++){
        System.out.print(array[i].getGrade() + " ");
    }
}
   public static String getGradePercentage(double gradePer){
    if (gradePer>=90 && gradePer <=100)
        return "A";
    if (gradePer>=85 && gradePer<90)
        return "A-";
    if (gradePer>=80 && gradePer <85)
        return "B+";
    if (gradePer >=75 && gradePer <80)
        return "B" ;  
    if (gradePer >=70 && gradePer <75)
        return "B-";
    if (gradePer >=65 && gradePer <70)
        return "C+";
    if (gradePer >=60 && gradePer <65)
        return "C";
     if (gradePer >=56 && gradePer <60)
        return "C-";
    if (gradePer >=53 && gradePer <56)
        return "D+";
    if (gradePer >=50 && gradePer <53)
        return "D";
    if (gradePer>= 0 && gradePer<50) 
        return "F";
    return null; 
   }
 public static int getIntInput(Scanner sc){
            int input = 0;
            boolean valid = false;
            while(!valid){
                try{
                    input = sc.nextInt();
                    if (input>0){
                    valid = true;
                    }
                    else
                    System.out.println("Please enter a number above 0");
                }
                catch(InputMismatchException ime){
                    System.out.println("Invalid input. Please enter a valid number: ");
                    sc.nextLine();
                }
            }
            return input;
        }
        public static double getNumberInput(Scanner sc){
            double input = 0;
            boolean valid = false;
            while(!valid){
                try{
                    input = sc.nextDouble();
                    valid = true;
                }
                catch(InputMismatchException ime){
                    System.out.println("Invalid input. Please enter a valid number: ");
                    sc.nextLine();
                }
            }
            return input;
        }
}