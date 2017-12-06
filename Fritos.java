import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fritos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fritos extends Item
{
    private static GreenfootImage image = new GreenfootImage("fritos.png");
    private static double price = 4.93;
    /**
     * Act - do whatever the Lays wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

    public void act() 
    {
    // Add your action code here.
    }   
     */

    public Fritos() {
        super(price);
        image.scale(190, 250);
        image.drawString(Double.toString(price), 85, 20);
        setImage(image);
    }

    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("fritos.png");
        tempImage.scale(190, 250);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
}
