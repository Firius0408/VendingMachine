import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class takis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Takis extends Item
{
    private static GreenfootImage image = new GreenfootImage("takis.png");
    private static double price = 2.59;
    private static String name = "Takis";
    /**
     * Act - do whatever the Lays wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

    public void act() 
    {
    // Add your action code here.
    }   
     */

    public Takis() {
        super(price, name);
        image.scale(220, 250);
        image.drawString(Double.toString(price), 85, 20);
        setImage(image);
    }

    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("takis.png");
        tempImage.scale(220, 250);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
    
    public void restore() {
        setImage(image);
    }
}
