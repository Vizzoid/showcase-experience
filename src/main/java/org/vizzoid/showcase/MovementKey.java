package org.vizzoid.showcase;

/**
 * Simple helper, represents a single key that can modify a position if its respective key is down
 */
public class MovementKey {

    private boolean moving;
    private boolean counterMoving;
    private final int key;
    private final int counterKey;

    public MovementKey(int key, int counterKey) {
        this.key = key;
        this.counterKey = counterKey;
    }

    public double move() {
        boolean canMove = moving ^ counterMoving;
        if (!canMove) return 0;

        return moving ? 1 : -1;
    }

    public void pressForward() {
        moving = true;
    }

    public void releaseForward() {
        moving = false;
    }

    public void pressBackwards() {
        counterMoving = true;
    }

    public void releaseBackwards() {
        counterMoving = false;
    }

    public void tryPress(int key) {
        if (this.key == key) pressForward();
        if (this.counterKey == key) pressBackwards();
    }

    public void tryRelease(int key) {
        if (this.key != key) releaseForward();
        if (this.counterKey != key) releaseBackwards();
    }

}
