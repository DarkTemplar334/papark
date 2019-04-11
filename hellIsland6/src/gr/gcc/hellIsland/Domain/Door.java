package gr.gcc.hellIsland.Domain;

public class Door {
    private int doorId;
    private boolean locked = true;


    public Door(int doorId) {
        this.doorId = doorId;
    }

    public int getDoorId() {
        return doorId;
    }

    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked1) {
        this.locked = locked1;
    }

}
