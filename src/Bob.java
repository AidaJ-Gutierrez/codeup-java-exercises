import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        //Write the Java code necessary so that a user of your command line application
        // can have a conversation with Bob.
        System.out.println("This is Bob...do you what to talk to him? (Y/N)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")){
            boolean talk = true;
            while (talk){
                String input = scanner.nextLine();
                if (input.isEmpty()){
                    System.out.println("Fine. Be that way!");
                }else if (input.endsWith("?")){
                    System.out.println("Sure");
                }else if(input.endsWith("!")){
                    System.out.println("Whoa, chill out!");
                }else{
                    System.out.println("Whatever.");
                }
                System.out.println("Do you want to keep talking?(y/n)");
                String keepChat = scanner.nextLine();
                if (!keepChat.equalsIgnoreCase("y")){
                    System.out.println("Ok... Bye.");
                }

            }
        }else if (answer.equalsIgnoreCase("n")){
            System.out.println("Then, go away!");
        }else{
            System.out.println("I don't can understand you, Bye.");
        }





    }
}
