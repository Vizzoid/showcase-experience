package org.vizzoid.showcase;

/**
 * Represents player
 */
public class Critic {

    private final MovingPosition position;
    private OpenInfo info = OpenInfo.EMPTY;

    public Critic() {
        position = new MovingPosition();
    }

    public MovingPosition getPosition() {
        return position;
    }
    
    public OpenInfo getInfo() {
        return info;
    }
    
    public void setInfo(OpenInfo info) {
        this.info = info;
    }
    
}
