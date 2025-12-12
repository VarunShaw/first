public class CODES2 {
}
public static void main(String[] args) {

    int marks = 92;
    char grade;

    if (marks >= 90) {
        grade = 'O';
    } else if (marks >= 80) {
        grade = 'E';
    } else if (marks >= 70) {
        grade = 'A';
    } else if (marks >= 60) {
        grade = 'B';
    } else {
        grade = 'C';
    }

    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + grade);
}