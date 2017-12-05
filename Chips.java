import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chips here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chips extends Item
{
    /**
     * Act - do whatever the Chips wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public Chips(double price, GreenfootImage image) {
        super(price);
        image.scale(190, 250);
        setImage(image);
    }
}
