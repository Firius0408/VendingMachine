import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Doritos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doritos extends Item
{
    private static GreenfootImage image = new GreenfootImage("doritos.jpg");
    private static double price = 3.98;
    /**
     * Act - do whatever the Doritos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
    public void act() 
    {
        // Add your action code here.
    }    
    */
    
    public Doritos() {
        super(price);
        image.scale(190, 250);
        image.drawString(Double.toString(price), 85, 20);
        setImage(image);
    }
    
    public void falling() {
        GreenfootImage tempImage = new GreenfootImage("doritos.jpg");
        tempImage.scale(190, 250);
        getWorld().addObject(new FallingItem(tempImage), getX(), getY());
    }
}
