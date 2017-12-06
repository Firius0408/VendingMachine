import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        //image = new GreenfootImage("0.0", 100, Color.BLACK, Color.WHITE);        
        image = new GreenfootImage(400, 200);
        image.setColor(Color.WHITE);
        image.fill();
        image.setFont(new Font(100));
        image.setColor(Color.BLACK);
        //image.drawString(Double.toString(getWorldOfType(VendingMachineWorld.class).getMoney().getMoney()), 10, 10);
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
        image.drawString(world.getMoneyObj().getMoneyString(), 20, 100);
        //image = new GreenfootImage(Double.toString(getWorldOfType(VendingMachineWorld.class).getMoney().getMoney()), 100, Color.BLACK, Color.WHITE);
    }
    
}
