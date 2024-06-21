package main;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            // Print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }

    }
}
