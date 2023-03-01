package org.vizzoid.showcase;

import java.awt.*;

/**
 * Represents an object that can be clicked for info (voice memo, video, text)
 */
public class InteractiveObject {
    
    private final Info info;
    private final Image display;
    
    public InteractiveObject(Info info, Image display) {
        this.info = info;
        this.display = display;
    }
    
    public void interact(Critic critic) {
        critic.setInfo(new OpenInfo(info));
    }
    
}
