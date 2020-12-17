import java.util.ArrayList;
import java.util.Arrays;

//
public class Student {

    private String name;
    private ArrayList<Double>grades;

    public Student(String name){
        this.name=name;
        this.grades= new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum =0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum/grades.size();
    }


    public static void main(String[] args){
        Student s1 =new Student("j");
        System.out.println(s1.getName());
        s1.addGrade(90);
        s1.addGrade(180);
        System.out.println(s1.getGradeAverage());

    }
}
