package Practice;

public class LectureEnvironment {

    public static void main(String[] args) {

////  NEW PERSON INSTANCE FROM PERSON CLASS
//        Person thisPerson = new Person();
//        thisPerson.first = "Sam";
//        thisPerson.last = "Clemens";
//        System.out.println(thisPerson.sayHello());
//
//
////  STATIC TALK TO ARITHMETIC CLASS
//        System.out.println("Arithmetic.pi = " + Arithmetic.pi);
//        System.out.println("Arithmetic.add(10, 20) = " + Arithmetic.add(10, 20));


//    CONSTRUCTOR OVERLOAD EXAMPLE
//    ONLY 2 PIECES OF INFO ENTERED
//        Person newUser = new Person();
//        newUser.first = "First";

        Person newUser = new Person("Tom", "Hanks");
        System.out.println(newUser.sayHello());
        System.out.println("newUser.relationship = " + newUser.relationship);
        System.out.println("newUser.age = " + newUser.age);


        Person newestUser = new Person("Jim", "Bob", 32, "Single");
        System.out.println();
        System.out.printf("Your new users' name is %s %s, they are %s y/o, and their relationship status is %s", newestUser.first, newestUser.last, newestUser.age, newestUser.relationship);







    }

}