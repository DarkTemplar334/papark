package gr.gcc.hellIsland.UI;

import gr.gcc.hellIsland.Domain.Player;

public class DisplayMenu {




    public void showOption(){
        System.out.print("\nOption: ");
    }

    public void newGameStarting(){
        System.out.println("New Game Starting!");
    }

    public static void showStory(){
        String words ="||\tWhile returning home from your business trip by airplane,\t\t\t ||" +
                "\n||\ta terrible storm formed on your way and a thunderbolt hit your plane.||" +
                "\n||\tleaving you alone on a island.                                       ||" +
                "\n||                Can you escape your fate?                              ||";
        int i=0;
        System.out.println("\n\n===========================================================================");
        for(i=0;i<words.length();i++){
            System.out.print(words.charAt(i));
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
        System.out.println("\n===========================================================================");
        System.out.println("\n====To get to main commands at any point just leave it blank====");
        System.out.println("\n====Type the commands after :====");
    }

    public void showWrongOption(){
        System.out.println("Wrong Option, chose again!");
    }

    public void showHelp(){
        System.out.println("\n====To see a list with available commands type: help====");
    }

    public static void showAavailableCmds(){
        System.out.println("\n Available Commands:\n======================================");
        System.out.println("|| Move: ");// + map.possibleDirections());
        System.out.println("|| Info: " + "[location,tasks,menu]");
        System.out.println("|| Actions: "+ "[use,inventory,pickup,search]");
        System.out.println("|| Player Stats: "+"[stats]");
        System.out.println("======================================");
        System.out.println("\n====To get to main commands at any point just leave it blank====");
        System.out.println("\n====Type the commands after :====\n");

    }

    public void showGameMenu() {
        System.out.println("\n Action Commands:\n==============");
        System.out.println("|| Save Game ||");
        System.out.println("|| Load Game||");
        System.out.println("||   Exit   ||");
        System.out.println("==============");
    }

    public void showMovement(String direction){
        System.out.println(direction);
    }



    public void showCurrentLocation(Player player){
        System.out.println("\n###################################");
        System.out.println("You are at: " + player.nameOfCurrentRoom());
        System.out.println("###################################");
    }


}
