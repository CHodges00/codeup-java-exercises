package movies;

import util.Input;

public class MoviesApplication {
    public static Input input = new Input();
    public static void main(String[] args) {
        movieSelection();

    }


    private static void movieSelection(){
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
                    viewByCategory("musical");
                    break;
                case 2:
                    viewByCategory("scifi");
                break;
                case 3:
                   viewByCategory("horror");
                break;
                case 4:
                    viewByCategory("drama");
                    break;
                case 5:
                    viewByCategory("animated");
                    break;
                case 6:
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
        System.out.println("0 - view all movies");
        System.out.println("1 - view movies in the musicals category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("2 - view movies in the animated category");
        System.out.println("6 - exit");
        System.out.println("=============================");

    }

    public static void viewByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()){
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s = %s\n", movie.getName(), movie.getCategory());
            }
        }

    }

    public static int userChoice() {
        return input.getInt("What movies would you like to display ?");
    }

}

