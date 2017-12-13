import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lays extends Item
{
    private static GreenfootImage image = new GreenfootImage("lays.jpg");
    private static double price = 3.28;
    private static String name = "Lays";
    /**
     * Act - do whatever the Lays wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

    public void act() 
    {
    // Add your action code here.
    }   
     */

    public Lays() {
        super(price, name);
        image.scale(190, 250);
        image.drawString(Double.toString(price), 85, 20);
        setImage(image);
    }

    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("lays.jpg");
        tempImage.scale(190, 250);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
}
