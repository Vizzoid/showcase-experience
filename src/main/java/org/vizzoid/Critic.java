package org.vizzoid;

/**
 * Represents player
 */
public class Critic {

    private final MovingPosition position;

    public Critic() {
        position = new MovingPosition();
    }

    public MovingPosition getPosition() {
        return position;
    }
}
