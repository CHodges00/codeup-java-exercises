package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();


        Student student1 = new Student("Cody");
        Student student2 = new Student("Jon");
        Student student3 = new Student("Nelson");
        Student student4 = new Student("Charles");

        students.put("mav", student1);
        students.put("ice", student2);
        students.put("cena", student3);
        students.put("doug", student4);

        student1.addGrade(80);
        student1.addGrade(91);
        student1.addGrade(97);

        student2.addGrade(92);
        student2.addGrade(100);
        student2.addGrade(90);

        student3.addGrade(90);
        student3.addGrade(99);
        student3.addGrade(67);

        student4.addGrade(59);
        student4.addGrade(98);
        student4.addGrade(100);


        System.out.println("Make a selection");
        System.out.println();
        System.out.println("0 = Exit");
        System.out.println("1 = Usernames");
        System.out.println("2 = All student grades");
        System.out.println("3 = All student averages");
        System.out.println("4 = Show name, username, ");


        int menuChoice = 0;
        boolean cont = true;

        while (cont) {
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 0:
                    cont = false;
                    System.out.println("K Bye !");
                case 1:
                    System.out.println("Usernames == ");
                    System.out.println();
                    for (String key : students.keySet()) {
                        System.out.printf("|%s|", key);
                    }
                    System.out.println();
                    System.out.println("\nPick a student");
                    String choice = scan.nextLine();
                    Student userChoice = students.get(choice);
                    try {
                        System.out.printf("Username = %s%n" + "name = %s%n" + "grades = %s%n" + "average = %.1f%n ", choice, userChoice.getName(), userChoice.getGrades(), userChoice.getGradeAverage()
                        );
                    } catch (Exception e) {
                        System.out.println("That is not a student");
                    }
                    break;
                case 2:
                    for (String student : students.keySet()){
                        System.out.printf("name = %s%n grades = %s%n", students.get(student).getName(), students.get(student).getGrades());
                    }
                    break;
                case 3:
                    double classAvg = 0.0;
                    for (String student : students.keySet()){
                        classAvg += students.get(student).getGradeAverage();
                    }
                    classAvg /= students.size();
                    System.out.printf("Average for all students = %.2f%n", classAvg);
                    break;
                case 4:
                    System.out.println("name - username - average");
                    for (String student : students.keySet()) {
                        System.out.printf("%s,%s,%.2f%n", students.get(student).getName(), student, students.get(student).getGradeAverage());
                    }
                    break;
            }
        }
    }
}
