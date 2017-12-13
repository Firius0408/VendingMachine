import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingItem extends Actor
{
    GreenfootImage image;
    /**
     * Act - do whatever the FallingItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkBottom();
    }    

    public FallingItem(GreenfootImage image) {
        this.image = image;
        setImage(image);
        setRotation(90);
    }

    public void falling() {
        move(6);
    }

    public void checkBottom() {
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
        else {
            falling();
        }
    }
}
