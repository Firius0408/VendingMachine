import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gatorade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gatorade extends Item
{
    private static GreenfootImage image = new GreenfootImage("gatorade1.jpg");
    private static double price = 1.59;
    private static String name = "Gatorade";
    /**
     * Act - do whatever the Gatorade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

    public void act() 
    {
    // Add your action code here.
    }   
     */

    public Gatorade() {
        super(price, name);
        image.scale(120, 285);
        image.drawString(Double.toString(price), 50, 20);
        setImage(image);
    }

    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("gatorade1.jpg");
        tempImage.scale(120, 285);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
}
