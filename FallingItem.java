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
    boolean flag;
    /**
     * Act - do whatever the FallingItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        falling();
        checkBottom();
    }    

    public FallingItem(GreenfootImage image) {
        this.image = image;
        setImage(image);
        setRotation(90);
        flag = true;
    }

    public void falling() {
        move(6);
    }

    public void checkBottom() {
        if(isAtEdge() && flag) {
            if (Greenfoot.getRandomNumber(10) < 9) {
                getWorld().removeObject(this);
            }
            else {
                flag = false;
            }
        }
    }
}

