import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] personArray,Person person ) {
        Person[] newPersonArray = Arrays.copyOf(personArray, personArray.length);
        for (int i = 0; i < newPersonArray.length; i++) {
            System.out.println((newPersonArray[i]));
        } return newPersonArray;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

//prints address in memory
        Person[] personsArray= new Person[3];

        Person person3=new Person("Mrinal");
        Person person4=new Person("Jaya");
        Person person5=new Person("Sai");


        personsArray[0]=person3;
        personsArray[1]=person4;
        personsArray[2]=person5;

        for ( Person persons:personsArray){
            System.out.println(persons.getName());
        }

        System.out.println(Arrays.toString(ArraysExercises.addPerson(personsArray, person3)));



    }


}
