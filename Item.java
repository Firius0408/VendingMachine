import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Item extends Actor // abstract class for each item
{
    private double price; // stores price of item
    private int stock; // stores number of items in stock
    private VendingMachineWorld world;
    private String name; // name of item
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        // Add your action code here.
        checky();
    }    

    public Item(double price, String name) { // constructor
        this.price = price;
        this.name = name;
        stock = Greenfoot.getRandomNumber(10); //randomly sets stock between 0 - 10
    }

    protected void addedToWorld(World world) {
        this.world = (VendingMachineWorld) world;
    }

    abstract void falling(); // abstract method defined in each subclass of Item

    public void checky() { // checks if item is still in stock and if a specific item is clicked
        if (stock <= 0) {
            setImage(new GreenfootImage(1, 1));
        }
        
        else if(Greenfoot.mouseClicked(this) && world.getMoneyObj().getMoney() >= price) { // ensures money is greater than the price when clicked
            world.getMoneyObj().removeMoney(price); // removes money 
            stock--; // removes one stock
            falling(); // creates a new FallingItem object
        }
    }
    
    abstract void restore(); // abstract method defined in each subclass of Item

    public double getPrice() {
        return price;
    }
    
    public int getStock() {
        return stock;
    }
    
    public String getName() {
        return name;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
}
