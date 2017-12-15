import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class VendingMachineWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineWorld extends World
{
    private ArrayList<Item> stock; //holds each Item in an ArrayList
    private Money money; //the money object for this world
    private boolean flag = true; //flag for keypress
    private boolean flag1 = true; //second flag for keypress
    /**
     * Constructor for objects of class VendingMachineWorld.
     * 
     */
    public VendingMachineWorld()
    {    
        super(880, 780, 1, true); //creates a new World()
        stock = new ArrayList<Item>(); // the ArrayList holding the items in the vending machine
        setBackground("vendingmachine.jpg"); //the background 
        money = new Money();
        addObject(money, 800, 700);
        MoneyAmount moneyAmount = new MoneyAmount();
        addObject(moneyAmount, 200, 700);
        StockDisplay stockDisplay = new StockDisplay();
        addObject(stockDisplay, 560, 700);
        Lays lays = new Lays();
        stock.add(lays);
        addObject(lays, 110, 125);
        Doritos doritos = new Doritos();
        stock.add(doritos);
        addObject(doritos, 330, 125);
        Fritos fritos = new Fritos();
        stock.add(fritos);
        addObject(fritos, 550, 125);
        Takis takis = new Takis();
        stock.add(takis);
        addObject(takis, 770, 125);
        Gatorade gatorade = new Gatorade();
        stock.add(gatorade);
        addObject(gatorade, 110, 400);
        Water water = new Water();
        stock.add(water);
        addObject(water, 330, 400);
    }
    
    public void act() {
        checky(); // checks things every cycle
    }

    public Money getMoneyObj() { // returns the Money object used in this world
        return money;
    }

    public void addStock(String name, int stockCount) { // increases the stock of the specified item in the ArrayList stock
        for (int i = 0; i < stock.size(); i++) {
            if(stock.get(i).getName().equals(name)) {
                stock.get(i).setStock(stock.get(i).getStock() + stockCount); // I would've used a for-each loop so it wouldn't be so messy but requirements say I need a for loop so...
                break;
            }
        }
    }
    
    public void checky() { //checks for certain keypresses that allow the user to increase stock or increase money by 100
        if (Greenfoot.isKeyDown("space") && flag) {
            String choice = stock.get(Greenfoot.getRandomNumber(stock.size())).getName();
            for (Item i : stock) {
                if (i.getStock() <= 0) {
                    choice = i.getName();
                    i.restore();
                    break;
                }
            }
            addStock(choice, 1);
            flag = false; // flag variable used to check when key is released so that action is only performed once per keypress
        }
        else if (!Greenfoot.isKeyDown("space")) {
            flag = true; // resets flag variable
        }
        
        if(Greenfoot.isKeyDown("F5") && flag1) {
            int i = 0;
            while(i < 100) {
                money.addMoney();
                i++;
            }
            flag1 = false; // flag variable used to check when key is released so that action is only performed once per keypress
        }        
        else if(!Greenfoot.isKeyDown("F5")) {
            flag1 = true; // resets flag variable
        }
    }

    public String inStock() { // traverses the ArraryList of items and returns a String containing important information in a user friendly format. Used in StockDisplay
        String s = "";
        for (Item i : stock) {  
            if(i.getStock() > 0) {
                s += i.getName() + ": stock (" + i.getStock() + ") price (" + i.getPrice() + ")\n";
            }
            else {
                s += i.getName() + " is currently out\n";
            }
        }
        return s;
    }
}
