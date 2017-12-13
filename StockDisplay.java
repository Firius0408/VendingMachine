import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class StockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockDisplay extends Actor
{
    private GreenfootImage image;
    private VendingMachineWorld world;
    /**
     * Act - do whatever the StockDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public StockDisplay() {
        image = new GreenfootImage(300, 400);
        image.setColor(Color.WHITE);
        image.fill();
        image.setFont(new Font(Font.DIALOG, Font.PLAIN, 100));
        image.setColor(Color.BLACK);
        setImage(image);
    }
    
    protected void addedToWorld(World world) {
        this.world = (VendingMachineWorld) world;
    }
    
    public void setDisplay() {
        image.clear();
        image.setColor(Color.WHITE);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString(world.inStock(), 100, 300);
    }
}