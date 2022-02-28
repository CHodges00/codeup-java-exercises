import java.sql.Array;
import java.util.Arrays;

public class ArraysExercises {



    public static void main(String[] args) {

//        TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//         Iterate through the array and print out the name of each person in the array.


        Person[] People = {new Person("Tim"), new Person("Tom"), new Person("Doug")};

        for (Person n : People){
            System.out.println(n.getName());
        }

        System.out.println("==================");
        
        Person person4 = new Person("Gerald");
        People = addPerson(People, person4);
        for (int i = 0; i < People.length; i++){
            System.out.println(People[i].getName());
        }

    }


    public static Person[] addPerson(Person[] People, Person person){
        Person[] People2 = new Person[People.length + 1];
        for (int i = 0; i < People.length; i++){
            People2[i] = People[i];
        }
        People2[People2.length -1] = person;
        return People2;
        }
    }



