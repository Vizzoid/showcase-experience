package org.vizzoid.showcase;

public class OpenInfo {
    
    private final Info info;
    
    public static final OpenInfo EMPTY = new OpenInfo(null) {
        public void start() {
        }
        public void end() {
        }
    };
    
    public OpenInfo(Info info) {
        this.info = info;
    }
    
    public void start() {
        
    }
    
    public void end() {
        
    }
    
}
