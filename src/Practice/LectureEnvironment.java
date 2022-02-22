package Practice;

import Practice.Person;

public class LectureEnvironment{

    public static void main(String[] args) {

        Person thisPerson = new Person();

        thisPerson.first = "Sam";
        thisPerson.last = "Clemens";

        System.out.println(thisPerson.sayHello());

        System.out.println("Arithimetic.pi = " + Arithimetic.pi);
        System.out.println("Arithimetic.add(10, 20) = " + Arithimetic.add(10, 20));
        
    }

}