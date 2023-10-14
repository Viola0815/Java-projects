
import java.util.ArrayList;


public class Session {
    private ArrayList<Student> students= new ArrayList<>();

public void addStudent(Student student) {
        students.add(student);
    }
public float calculateAverageQuizGrades() {
        double totalQuizGrades = 0;
        int totalQuizzes = 0;
        for (Student student : students) {
        ArrayList<Float> quizGrades = student.getQuizGrades();
        for (Float grade : quizGrades) {
            totalQuizGrades += grade;
            totalQuizzes++;
            }
        }
         if (totalQuizzes == 0) {
            return 0; 
        }
        return (float)(totalQuizGrades / totalQuizzes);
    }
    public void printPartTimeStudentNamesAndQuizGrades() {
        System.out.println("Part-Time Student Names and Quiz Grades:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                PartTimeStudent partTimeStudent = (PartTimeStudent) student;
                System.out.println(partTimeStudent.getName() + ":");
                ArrayList<Float> quizGrades = partTimeStudent.getQuizGrades();
                for (int i = 0; i < quizGrades.size(); i++) {
                    System.out.println("Quiz " + (i + 1) + ": " + quizGrades.get(i));
                }
            }
        }
    }
public void printFullTimeStudentExamScoresAndquizScores() {
        System.out.println("Full-Time Student Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.getName() + ": Exam1 - " + fullTimeStudent.getExamGrade1() + ", Exam2 - " + fullTimeStudent.getExamGrade2()+", quiz grades "+fullTimeStudent.getQuizGrades());
            }
        }
    }


}