package me.XdDanda;

public class Messaging {

    //help messages

    public static void hello(){
        System.out.println(" ");
        System.out.println(ConsoleColorUtils.WHITE + "Vítej v programu(1) - Nalezení řetězce");
        System.out.println(" ");
    }

    public static void inputSentenceHelp(){
        System.out.println(" ");
        System.out.println(ConsoleColorUtils.WHITE + "Napiš větu, ve které budeme chtít hledat slovní spojení!");
        System.out.println(" ");
    }

    public static void inputPhraseHelp(){
        System.out.println(" ");
        System.out.println(ConsoleColorUtils.WHITE + "Napiš spojení, které budeme ve větě hledat");
        System.out.println(" ");
    }

    //help messages


    //util messages

    public static void printSentence(String sentece) {

        System.out.println(" ");
        System.out.println(ConsoleColorUtils.WHITE + "Úspěšně byla věta: " + ConsoleColorUtils.YELLOW + sentece + (ConsoleColorUtils.WHITE + " zaznamenána!"));
        System.out.println(" ");

    }

    public static void printPhrase(String phrase){

        System.out.println(" ");
        System.out.println(ConsoleColorUtils.WHITE + "Spojení: " + ConsoleColorUtils.YELLOW + phrase + (ConsoleColorUtils.WHITE + " bylo úspěšně zaznamenáno!"));
        System.out.println(" ");
    }

    //util messages
}
