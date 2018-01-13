package head;

public class Brain {
    public static void main(String[] args) {
        String default_word = "Maksim";

        if(args.length > 0){
            default_word = args[0];
        }

        Mouth mouth = new Mouth();
        mouth.say("Privet " + default_word + "!");
    }
}
