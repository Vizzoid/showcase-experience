/**
 * Represents an object that can be clicked for info (voice memo, video, text)
 */
public class InteractiveObject {
    
    private final Info info;
    private final Image[] images;
    
    public InteractiveObject(Info info, Image... images) {
        this.info = info;
        this.images = images;
    }
    
    public void interact(Critic critic) {
        critic.setInfo(new OpenInfo(info));
    }
    
}
