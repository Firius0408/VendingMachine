import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MoneyAmount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyAmount extends Actor
{
    private GreenfootImage image;
    private VendingMachineWorld world;
    /**
     * Act - do whatever the MoneyAmount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setDisplay();        
    }    
    
    public MoneyAmount() {     
        image = new GreenfootImage(400, 200);
        image.setColor(Color.WHITE);
        image.fill(); // sets background white
        image.setFont(new Font(Font.DIALOG, Font.PLAIN, 100));
        image.setColor(Color.BLACK);
        setImage(image);
    }
    
    protected void addedToWorld(World world) {
        this.world = (VendingMachineWorld) world;
    }
    
    public void setDisplay() { // refreshes the money display
        image.clear();
        image.setColor(Color.WHITE);
        image.fill();
        image.setColor(Color.BLACK);
        image.drawString("$" + world.getMoneyObj().getMoneyString(), 20, 100);
    }
    
}
