package gr.gcc.hellIsland.Domain;

import gr.gcc.hellIsland.Command.Command;

import java.util.Collection;

public class Player implements Command{
    private  Room currentRoom;
    private Door door;

    @Override
    public String move(Direction direction) {
        Room next = currentRoom.roomTo(direction);
        try {
            if (next != null) {
                currentRoom = next;
                return "You move " + direction + '.';
            }
            else {
                return "There is a door with Id: " + door.getDoorId() + "that blocks you";
            }
        } catch (NullPointerException e) {
            return "There is nothing there";
        }
    }


public void setStartingRoom(Room room){
        currentRoom = room;
}

//    public Player(Room startingRoom) {
//        this.currentRoom = startingRoom;
//    }
    public String nameOfCurrentRoom(){
        return currentRoom.getName();
    }

    public int doorIdOfCurrentRoom(){
        return door.getDoorId();
    }


    public Collection<Direction> possibleDirections(){
        return currentRoom.possibleDirections(); //method from Class Room
    }



}
