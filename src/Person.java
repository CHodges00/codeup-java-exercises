public class Person {

    private String name;

    public Person(String nameInput) {
        this.name = nameInput;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        name = getName();
        System.out.println("name = " + name);
    }


    public static void main(String[] args) {
        Person myPerson = new Person("Tim");
        myPerson.sayHello();
        myPerson.setName("Doug");
        myPerson.sayHello();
        System.out.println(myPerson.getName());
        System.out.println("------------------------------------");

//
//        Person person1 = new Person("John");
//        System.out.println("person1 = " + person1);
//        Person person2 = new Person("John");
//        System.out.println("person2 = " + person2);
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        System.out.println("------------------------------------");


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println("------------------------------------");


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        System.out.println("------------------------------------");
    }


}
