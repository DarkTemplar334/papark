package gr.gcc.hellIsland.Command;

import gr.gcc.hellIsland.Domain.Direction;

public interface Command {

    String move(Direction direction);

}
