package gr.gcc.hellIsland.Parser;

import gr.gcc.hellIsland.Command.UserInput;
import gr.gcc.hellIsland.Domain.Direction;
import gr.gcc.hellIsland.Domain.Player;


public class Parser {

    private Player player;


    public void parser(String cmd){
        player.move(Direction.valueOf(cmd));

    }

    public void setPlayer(Player player){
        this.player = player;
    }



}
