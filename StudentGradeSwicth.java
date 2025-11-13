import java.util.Scanner;

public class StudentGradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's final average (0-100): ");
        int grade = sc.nextInt();
        char remark;

        switch (grade / 10) { // divide by 10 to get range (90→9, 80→8, etc.)
            case 10:
            case 9:
                remark = 'A';
                break;
            case 8:
                remark = 'B';
                break;
            case 7:
                remark = 'C';
                break;
            case 6:
                remark = 'D';
                break;
            default:
                remark = 'F';

                
        }


        

        System.out.println("Equivalent Letter Grade: " + remark);

        switch (remark) {
            case 'A':
                System.out.println("Remarks: Excellent!");
                break;
            case 'B':
                System.out.println("Remarks: Very Good!");
                break;
            case 'C':
                System.out.println("Remarks: Satisfactory");
                break;
            case 'D':
                System.out.println("Remarks: Needs Improvement");
                break;
            case 'F':
                System.out.println("Remarks: Failed");
                break;
        }
    }
}
