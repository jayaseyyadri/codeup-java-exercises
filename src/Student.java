import java.util.ArrayList;
import java.util.Arrays;

//
public class Student {

    private String name;
    private ArrayList<Integer>grade;

    public Student(String name, ArrayList<Integer> grade){
        this.name=name;
        this.grade=grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Integer> grade) {
        this.grade = grade;
    }

    public void addGrade(int grade){
        this.grade.add(33);
        System.out.println(grade);
    }

//    public double getGradeAverage(int grades) {
//    }
    public static void main(String[] srgs){
        ArrayList a =new ArrayList();
        Student s1 =new Student("j",a);
        s1.getGrade().add(0,22);
        System.out.println(s1.grade);
    }
}
