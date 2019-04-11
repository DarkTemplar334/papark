package gr.gcc.hellIsland;

        import gr.gcc.hellIsland.Command.UserInput;
        import gr.gcc.hellIsland.Domain.Door;
        import gr.gcc.hellIsland.Domain.Player;
        import gr.gcc.hellIsland.Domain.Room;
        import gr.gcc.hellIsland.Parser.Parser;
        import gr.gcc.hellIsland.UI.DisplayMenu;
        import gr.gcc.hellIsland.UI.MainMenu;

public class Main {


    private static MainMenu mainMenu = new MainMenu();
    private static String decision;
    private static boolean gameOver = true;
    private static DisplayMenu displayMenu = new DisplayMenu();
    private static UserInput input = new UserInput();

    public static void main(String[] args) {


        //Room-Door Creation
        Parser parser = new Parser();
        Room room1 = new Room("Mainland");
        Room room2 = new Room("Plane");
        Room room3 = new Room("Sea");
        Room room4 = new Room("Forrest");
        Room room5 = new Room("Cave");

        Door door1 = new Door(1);
        Door door2 = new Door(2);
        Door door3 = new Door(3);
        Door door4 = new Door(4);



        //Room Connections
        room1.putLeftOf(room2,door1);
        room2.putRightOf(room1,door1);
        room1.putUpOf(room3,door2);
        room3.putDownOf(room1,door2);
        room1.putDownOf(room4,door3);
        room4.putUpOf(room1,door3);
        room5.putLeftOf(room4,door4);
        room4.putRightOf(room5,door4);

        mainMenu.gameMenu();
        displayMenu.showOption();
        decision = input.getInput();

        while(gameOver){
            if(decision.equals("New Game")){
                gameOver=false;
                displayMenu.newGameStarting();
                displayMenu.showStory();

            }
            else if(decision.equals("Load Game")){
                gameOver=false;
                mainMenu.loadGame();
            }
            else if(decision.equals("Exit")){
                mainMenu.exitGame();
            }
            else{
                displayMenu.showWrongOption();
                mainMenu.gameMenu();
            }
        }

        //Player Creation
        Player player = new Player();
        player.setStartingRoom(room2);
        parser.setPlayer(player);
        //displayMenu.setPlayer(player);


        //Game Loop
        while(!gameOver){
            displayMenu.showHelp();
            displayMenu.showOption();
            System.out.println(player.possibleDirections());
            displayMenu.showCurrentLocation(player);
            //System.out.println(player.nameOfCurrentRoom());
           decision=input.getInput();
           try {
               parser.parser(decision);
           }
           catch (IllegalArgumentException e){
               displayMenu.showWrongOption();
           }

            //input.input();

        }

        // write your code here
    }
}
