package gr.gcc.hellIsland.Command;


import java.util.Scanner;

public class UserInput {

    private String input;

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }













//    private Parser parser;
//
//    private String cmd;
//
//    public String returnInput(){
//        Scanner scanner = new Scanner(System.in);
//        cmd = scanner.nextLine();
//        return cmd;
//    }
//
////    public void input(){
////        Scanner scanner = new Scanner(System.in);
////        cmd = scanner.nextLine();
////
////    }

}
