import java.util.ArrayList;
import java.util.Random;


public class Student {
    private String name;
    private ArrayList<Float> quizGrades= new ArrayList<>();

public Student(String name) {
    this.name = name;
    }

public void addQuizGrades(Float grade) {
    quizGrades.add(grade);
    }

public ArrayList<Float> getQuizGrades() {
        return quizGrades;
    }
public String getName() {
        return name;
    }
}
class FullTimeStudent extends Student{
    private float examGrade1;
    private float examGrade2;



public FullTimeStudent(String name, float examGrade1, float examGrade2) {
    super(name);
    Random random = new Random();
        for (int i = 0; i < 15; i++) {
            float quizScore = random.nextFloat() * 100.0f;
            addQuizGrades(quizScore);
        }
    this.examGrade1 = examGrade1;
    this.examGrade2 = examGrade2;
}
 public void setExamGrades(float examGrade1, float examGrade2) {
        this.examGrade1 = examGrade1;
        this.examGrade2 = examGrade2;
    }

public float getExamGrade1() {
        return examGrade1;
    }

public float getExamGrade2() {
        return examGrade2;
    }
    

}

class PartTimeStudent extends Student {
    public PartTimeStudent(String name) {
        super(name);
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            float quizScore = random.nextFloat() * 100.0f;
            addQuizGrades(quizScore);
        }
    }
}