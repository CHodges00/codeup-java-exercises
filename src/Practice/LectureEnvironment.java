package Practice;

public class LectureEnvironment{

    public static void main(String[] args) {

//  NEW PERSON INSTANCE FROM PERSON CLASS
        Person thisPerson = new Person();
        thisPerson.first = "Sam";
        thisPerson.last = "Clemens";
        System.out.println(thisPerson.sayHello());


//  STATIC TALK TO ARITHMETIC CLASS
        System.out.println("Arithmetic.pi = " + Arithmetic.pi);
        System.out.println("Arithmetic.add(10, 20) = " + Arithmetic.add(10, 20));





    }

}