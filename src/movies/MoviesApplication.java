package movies;

import util.Input;

public class MoviesApplication {
    public static Input input = new Input();

    public static void main(String[] args) {
        movieSelection();

    }


    private static void movieSelection() {
        Movie[] moviesArray = MoviesArray.findAll();
        boolean cont = true;
        int choice = 0;
        while (cont) {
            menu();
            choice = userChoice();
            switch (choice) {
                case 0:
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 1:
                    viewCategory("musical");
                    break;
                case 2:
                    viewCategory("scifi");
                    break;
                case 3:
                    viewCategory("horror");
                    break;
                case 4:
                    viewCategory("drama");
                    break;
                case 5:
                    viewCategory("animated");
                    break;
                case 6:
                    addMovie();
                case 7:
                    cont = false;
                    System.out.println("Come back soon !");
                    break;
            }
        }
    }

    public static void menu() {
        Input input = new Input();
        System.out.println("============================");
        System.out.println("What would you like to do?");
        System.out.println("============================");
        System.out.println("0 - see [all]");
        System.out.println("1 - see [musicals]");
        System.out.println("2 - see [scifi]");
        System.out.println("3 - see [horror]");
        System.out.println("4 - see [drama]");
        System.out.println("5 - see [animated]");
        System.out.println("6 = Add movie");
        System.out.println("7 - exit");
        System.out.println("=============================");

    }

    public static void viewCategory(String category) {
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s = %s\n", movie.getName(), movie.getCategory());
            }
        }

    }

    public static int userChoice() {
        return input.getInt("What movies would you like to display ?");
    }

    public static Movie addMovie() {
        System.out.println("Enter name - ");
        String name = input.getString();
        System.out.println("Enter category - ");
        String category = input.getString();
        return new Movie(name, category);
    }



}

