package gradethresholdchecker;

public class GradeThresholdChecker {

    public static void main(String[] args) {
        
        double average = 50;
        int absences = 2;
        
        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);
                
        System.out.println("Grade Threshold Checker");
        System.out.println("Average Grade: " + average);
        System.out.println("Number of Abscenes: " + absences);
        
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
        
        System.out.print("Reasoning: ");
        if (average >= 90) {
            System.out.println("Excelent");
        } else if (average >= 75 && absences <= 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
    
}
