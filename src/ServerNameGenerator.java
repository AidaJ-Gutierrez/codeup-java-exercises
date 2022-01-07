public class ServerNameGenerator {
    public static String [] adjectives = {"ambitious", "beautiful", "colossal","dazzling", "eager","fierce","glamorous", "happy", "immense", "jolly" };
    public static String [] nouns = {"adult", "boy", "company", "dad", "employer", "family", "girl", "husband", "imagination", "job"};

    public static void getRandom( String [] adjectives, String[] nouns) {
        int randomAdjective = (int) Math.floor(Math.random() * adjectives.length);
        int randomNoun = (int) Math.floor(Math.random() * nouns.length);

        System.out.println(adjectives[randomAdjective] + " - " + nouns[randomNoun]);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        getRandom(adjectives, nouns);
    }


}
