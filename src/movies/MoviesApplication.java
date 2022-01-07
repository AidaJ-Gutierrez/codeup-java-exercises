package movies;
import util.Input;
public class MoviesApplication {

    //PROMPT USER FOR CHOICE - int is use because numeric choice
    private static int userChoice(){
        Input userInput = new Input();
        int choice = userInput.getInt(0, 5);
        return choice;
    }


        //DISPLAYED OPTIONS TO CHOOSE  METHOD
        private static String optionMenu(){
            String menu = "What would you like to see? \n\n" +
                    "0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category \n" +
                    "3 - view movies in the drama category \n " +
                    "4 - view movies in the horror category \n" +
                    "5 - view movies in the scifi category \n";
            return menu;
        }


    //DISPLAY MOVIES WITH SELECTED CATEGORY
    private static void displayMovies(String category){
            for (Movie movie : MoviesArray.findAll()){
                if(movie.getCategory().contains(category)){
                   System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
            }
    }

        //EXECUTE USER CHOICE
    private static boolean userChoiceSelec(int userChoice){
            boolean movieOp = true;
        switch(userChoice) {
            case 0:
                System.out.println("Goodbye!");
                movieOp = false;
                break;
            case 1:
                System.out.println("\n");
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                }
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\n");
                displayMovies("animated");
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\n");
                displayMovies("drama");
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\n");
                displayMovies("horror");
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\n");
                displayMovies("scifi");
                System.out.println("\n");
                break;
        }
        return movieOp;
    }



    public static void main(String[] args) {
            // CONTINUE METHOD

            boolean continueRunning = true;
            while(continueRunning){
                System.out.println(optionMenu());
                continueRunning = userChoiceSelec(userChoice());
            }

    }

}
