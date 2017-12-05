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
    ArrayList<Item> stock;
    Money money;
    /**
     * Constructor for objects of class VendingMachineWorld.
     * 
     */
    public VendingMachineWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(880, 780, 1, true);
        stock = new ArrayList<Item>();
        setBackground("vendingmachine.jpg");
        money = new Money();
        addObject(money, 800, 700);
        Lays lays = new Lays();
        stock.add(lays);
        addObject(lays, 110, 125);
        Doritos doritos = new Doritos();
        stock.add(doritos);
        addObject(doritos, 330, 125);
    }
    
    public void act() {
        for (Item i : stock) {
            if(Greenfoot.mouseClicked(i)) {
                i.choose();
                break;
            }
        }
        
        if(Greenfoot.mouseClicked(money)) {
            money.addMoney();
        }
    }
}
