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
    private ArrayList<Item> stock;
    private Money money;
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
        MoneyAmount moneyAmount = new MoneyAmount();
        addObject(moneyAmount, 200, 700);
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
    }

    public double getMoney() {
        return money.getMoney();
    }
    
    public Money getMoneyObj() {
        return money;
    }
}
