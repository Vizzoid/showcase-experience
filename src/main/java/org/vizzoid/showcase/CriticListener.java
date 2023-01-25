package org.vizzoid.showcase;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Manages and controls a critic's data through key presses and mouse clicks
 */
public class CriticListener implements KeyListener {

    private final Critic critic;
    public MovementKey
            xKey = new MovementKey(KeyEvent.VK_W, KeyEvent.VK_S),
            yKey = new MovementKey(KeyEvent.VK_SPACE, KeyEvent.VK_CONTROL),
            zKey = new MovementKey(KeyEvent.VK_D, KeyEvent.VK_A);

    public CriticListener(Critic critic) {
        this.critic = critic;
    }

    public void tick() {
        critic.getPosition().move(
                xKey.move(),
                yKey.move(),
                zKey.move()
        );
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        xKey.tryPress(keyCode);
        yKey.tryPress(keyCode);
        zKey.tryPress(keyCode);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        xKey.tryRelease(keyCode);
        yKey.tryRelease(keyCode);
        zKey.tryRelease(keyCode);
    }
}
