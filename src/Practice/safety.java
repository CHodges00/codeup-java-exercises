//import java.util.ArrayList;
//import java.util.Arrays;
//
//
//public class Assessment {
//
//
//    public static double average(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / array.length;
//    }
//
//
//    public static int square(int x) {
//        return x * x;
//    }
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static double sum(double a, double b) {
//        return a + b;
//    }
//
//
//
//    public static void namesToLeet(ArrayList<User> users){
//        for (User user : users){
//            String first = user.getFirstName();
//            String last = user.getLastName();
//
//            for (int i = 0; i < users.size(); i++){
//                first = first.replace("L", "1");
//                first = first.replace("E", "3");
//                first = first.replace("T", "7");
//                first = first.replace("l", "1");
//                first = first.replace("e", "3");
//                first = first.replace("t", "7");
//                last = last.replace("L", "1");
//                last = last.replace("E", "3");
//                last = last.replace("T", "7");
//                last = last.replace("l", "1");
//                last = last.replace("e", "3");
//                last = last.replace("t", "7");
//            }
//            System.out.println(first + " " + last);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println("square(2) = " + square(2));
//        System.out.println("sum(1,2) = " + sum(1, 2));
//        System.out.println("sum(10.1, 10.2) = " + sum(10.11, 10.20));
//        int[] nums = {1, 2};
//        System.out.println("average(array) = " + average(nums));
//
//
//        User tim = new User("let", "Sawyer", false);
//        User doug = new User("Doug", "LETmore", true);
//        ArrayList<User> users = new ArrayList<>();
//        users.add(tim);
//        users.add(doug);
//        namesToLeet(users);
//
//
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class Person implements Greeter {
//
//    protected String firstName;
//    protected String lastName;
//
//
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//
//        if (firstName == null || lastName == null) {
//            throw new IllegalArgumentException("Not a string entered");
//        }
//
//    }
//
//    public String getFirstName(){
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//
//
//
//    public String sayHello() {
//        return "Hello from " + this.firstName + " " + this.lastName;
//    }
//
//
//
//    public static void main(String[] args) {
//        Person person1 = new Person("Doug", "Dimmadome");
////        Person person1 = new Person(null, "Dimmadome");
//        System.out.println("person1.firstName = " + person1.firstName);
//        System.out.println("person1.lastName = " + person1.lastName);
//        System.out.println("person1.sayHello() = " + person1.sayHello());
//        System.out.println("person1.getFirstName() = " + person1.getFirstName());
//        System.out.println("person1.getLastName() = " + person1.getLastName());
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class User extends Person{
//
//    protected boolean admin;
//
//    public User(String firstName, String lastName, boolean admin) {
//        super(firstName, lastName);
//        this.admin = admin;
//    }
//
//    public boolean isAdmin(){
//        return admin;
//    }
//
//
//
//
//    public static void main(String[] args) {
//        User user1 = new User("Tim", "Toolman", true);
////        User user1 = new User("Tim", "Toolman", false);
//        System.out.println("user1.getFirstName() = " + user1.getFirstName());
//        System.out.println("user1.getLastName() = " + user1.getLastName());
//        System.out.println("user1.sayHello() = " + user1.sayHello());
//        System.out.println("user1.getFirstName() = " + user1.getFirstName());
//        System.out.println("user1.getLastName() = " + user1.getLastName());
//        System.out.println("user1.isAdmin() = " + user1.isAdmin());
//    }
//
//
//
//
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public interface Greeter {
//
//
//    String sayHello();
//
//
//}




