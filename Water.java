import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Item
{
    private static GreenfootImage image = new GreenfootImage("water.jpg");
    private static double price = 0.99;
    private static String name = "Water";
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.

    public void act() 
    {
    // Add your action code here.
    }   
     */

    public Water() {
        super(price, name);
        image.scale(120, 285);
        image.drawString(Double.toString(price), 50, 20);
        setImage(image);
    }

    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("water.jpg");
        tempImage.scale(120, 285);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
    
    public void restore() {
        setImage(image);
    }  
}
