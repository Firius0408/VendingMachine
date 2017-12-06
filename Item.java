import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    private double price;
    private int stock;
    private VendingMachineWorld world;
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        // Add your action code here.
        clicky();
        checky();
    }    

    public Item(double price) {
        this.price = price;
        stock = Greenfoot.getRandomNumber(10);
    }

    protected void addedToWorld(World world) {
        this.world = (VendingMachineWorld) world;
    }

    public void choose() {
        if(world.getMoney() >= price) {
            world.getMoneyObj().removeMoney(price);
            stock--;
        }

    }

    public void clicky() {
        if(Greenfoot.mouseClicked(this)) {
            choose();
        }
    }

    public void checky() {
        if (stock <= 0) {
            getWorld().removeObject(this);
        }

    }
}
