package head;

import java.util.Scanner;

public class Brain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mouth mouth = new Mouth();

        mouth.say("Кто я?");
        String iam = scanner.nextLine();
        mouth.say("Как меня зовут?");
        String name =scanner.nextLine();
        mouth.say("Сколко мне лет?");
        int age = scanner.nextInt();
        mouth.say("Я " + iam + " " + name + " мне " + age + " лет!");
    }
}
