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
    private GreenfootImage image; // transparent image
    private VendingMachineWorld world;
    /**
     * Act - do whatever the StockDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setDisplay();
    }    
    
    public StockDisplay() {
        image = new GreenfootImage(300, 300);
        image.setColor(Color.WHITE);
        image.fill(); // makes image background white
        image.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
        image.setColor(Color.BLACK);
        setImage(image); 
    }
    
    protected void addedToWorld(World world) { // called when StockDisplay is added to the world. Used to set VendingMachineWorld world equal to the current world
        this.world = (VendingMachineWorld) world; //casts the world to type VendingMachineWorld so that VendingMachineWorld specific methods can be used
    }
    
    public void setDisplay() { // refreshes the stock display
        image.clear();
        image.setColor(Color.WHITE);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString(world.inStock(), 10, 30);
    }
}
