package Practice;

//CLASS
public class Person {


// FIELDS AS VARIABLES

    public String first;
    public String last;
    private int age;
    public String relationship;

    //FIELDS AS METHODS
    public String sayHello() {
        return String.format("Hello from %s %s", first, last);
    }

    //    PRINT MESSAGE EACH TIME A PERSON OBJECT IS CREATED
//    CONSTRUCTOR
//    public Person(){
//        System.out.println("A Person has been INSTANTIATED");
//    }

    //    USER PROVIDES FIRST,LAST AND NOT AGE,RELATIONSHIP YET
    public Person(String firstInput, String lastInput) {
        first = firstInput;
        last = lastInput;
        age = 0;
        relationship = "Undefined";
    }

    public Person() {
//        DEFAULT
    }


    public static void main(String[] args) {
//        INSTANCE OF PERSON
        Person Tom = new Person();
//        FILLED PERSON PROPERTIES WITH VARIABLES
        Tom.first = "Tom";
        Tom.last = "Tommy";
        Tom.age = 32;
        Tom.relationship = "Taken";

//        RESULTS FROM OBJECT WITH VALUES FROM PROPERTIES
        System.out.println("Tom.first = " + Tom.first);
        System.out.println("Tom.last = " + Tom.last);
        System.out.println("Tom.age = " + Tom.age);
        System.out.println("Tom.relationship = " + Tom.relationship);
        System.out.println(Tom.sayHello());
        System.out.println("--------------------------------------------------");

        Person Cody = new Person();
        Cody.first = "Cody";
        Cody.last = "Hastings";

        System.out.println("Cody.first = " + Cody.first);
        System.out.println("Cody.last = " + Cody.last);
        System.out.println(Cody.sayHello());
    }


}
