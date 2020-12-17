import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication  {

    public static void main(String[] args) {

        HashMap <String,Student>students =new HashMap();
        Student s3= new Student("alpha");
        s3.addGrade(80);
        s3.addGrade(89);
        s3.addGrade(99);
        Student s4= new Student("beta");
        s4.addGrade(75);
        s4.addGrade(45);
        s4.addGrade(99);
        Student s5= new Student("gama");
        s5.addGrade(79);
        s5.addGrade(89);
        s5.addGrade(99);
//inserts key value pairs to hash map (string & object)
        students.put("Mrinal",s3);
        students.put("beta",s4);
        students.put("gamma",s3);
        System.out.println(students);

        ArrayList<String> userNames= new ArrayList<>(students.keySet());
        System.out.println(userNames);
    }

}

//student.get getsvalue from key