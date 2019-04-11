package gr.gcc.hellIsland.Domain;

import java.util.*;

public class Room{

    private  String name;
    private final Map<Direction, Room> possibleDirections = new HashMap<>();
    private List<Door> list = new ArrayList<>();

    //Something like inventory here




    public Room(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Room putRightOf(Room sideRoom, Door door){
        sideRoom.possibleDirections.put(Direction.right,this);
        list.add(door);
        return this;
    }

    public Room putLeftOf(Room sideRoom, Door door){
        sideRoom.possibleDirections.put(Direction.left,this);
        list.add(door);
        return this;
    }

    public Room putUpOf(Room sideRoom, Door door){
        sideRoom.possibleDirections.put(Direction.up,this);
        list.add(door);
        return this;
    }

    public Room putDownOf(Room sideRoom, Door door){
        sideRoom.possibleDirections.put(Direction.down,this);
        list.add(door);
        return this;
    }

    public Collection<Direction> possibleDirections(){
        return Collections.unmodifiableCollection(possibleDirections.keySet());
    }

    public Room roomTo(Direction direction){
        return possibleDirections.get(direction);
    }



}
