
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            Student student = new Student("Student No " + i);
            for (int j = 0; j < 15; j++) {
                float quizScore = 0 + random.nextFloat() * 100;
                student.addQuizGrades(quizScore);
            }
            session.addStudent(student);
        }

        for (int i = 11; i <= 20; i++) {
            PartTimeStudent partTimeStudent = new PartTimeStudent("Part-Time Student # " + i);
            session.addStudent(partTimeStudent);
        }

        for (int i = 1; i <= 10; i++) {
            FullTimeStudent fullTimeStudent = new FullTimeStudent("Full-Time Student #" + i, 0.0f, 0.0f);
            float examGrade1 = random.nextFloat() * 100.0f;
            float examGrade2 = random.nextFloat() * 100.0f;
            fullTimeStudent.setExamGrades(examGrade1, examGrade2);
            session.addStudent(fullTimeStudent);
        }

        float averageQuizScore = session.calculateAverageQuizGrades();
        System.out.println("Average Quiz Score for the Whole Session: " + averageQuizScore);
        session.printPartTimeStudentNamesAndQuizGrades();
        session.printFullTimeStudentExamScoresAndquizScores();
    }
}
