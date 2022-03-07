package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public String getGrades() {
        String scores = "";
        for (Integer grade : grades) {
            scores += grade + " ";
        }
        return scores;
    }

    public double getGradeAverage(){
        double average = 0.0;
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        average = (double) sum / grades.size();
        return average;
    }


    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }




}

