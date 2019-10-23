import java.util.Scanner;

public class PrintGrade {
    public static void main(String [] args){

        Scanner key = new Scanner(System.in);
        System.out.println("Enter an exam score: ");
        int grade = key.nextInt();

        String answer = "Y";
        while (answer.equalsIgnoreCase("Y") ){
        if(grade > 96 || grade == 100 ) {
            System.out.println("Good job. Your grade is A+");
        }
        else if (grade > 93 || grade == 96 ) {
            System.out.println("Good job. Your grade is A");
        }
        else if (grade > 89 || grade == 93) {
            System.out.println("Good job. Your grade is A-");
        }
        else if (grade > 86 || grade == 89){
            System.out.println("Good job. Your grade is B+");
        }
        else if (grade > 83 || grade == 86){
            System.out.println("Good job. Your grade is B-");
        }
        else if (grade > 76 || grade == 79){
            System.out.println("Good job. Your grade is C+");
        }
        else if (grade > 74 || grade == 76){
            System.out.println("Good job. Your grade is C");
        }
        else if (grade > 70 || grade == 73){
            System.out.println("Good job. Your grade is C-");
        }
        else if (grade > 60 || grade == 69){
            System.out.println("Good job. Your grade is D");
        }
        else if (grade < 60){
            System.out.println("Go back to school");
        }

            System.out.println("Do you want to enter another score (Y/N)?");
            answer = key.next();
            if(answer.equalsIgnoreCase("Y")) {
                System.out.println("Enter an exam score: ");
                grade = key.nextInt();
            }

        }

    }
}

