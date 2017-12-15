import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingItem extends Actor // Created when an item is clicked and it starts falling
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
        setRotation(90); // sets the image sideways
    }

    public void falling() {
        move(6); // moves it down
    }

    public void checkBottom() { // checks to see if the item is at the bottom
        if(isAtEdge()) {
            getWorld().removeObject(this); // if it is it gets removed
        }
        else {
            falling(); // else move down some more
        }
    }
}
