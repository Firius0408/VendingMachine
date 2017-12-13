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
        super(880, 780, 1, true);
        stock = new ArrayList<Item>();
        setBackground("vendingmachine.jpg");
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
    }
    
    public Money getMoneyObj() {
        return money;
    }
    
    public void removeStock(Item item) {
        stock.remove(item);
    }
    
    public String inStock() {
        String s = "";
        for (Item i : stock) {
            s += i.getName() + ": stock(" + i.getStock() + ") price (" + i.getPrice() + ")\n";
        }
        return s;
    }
}
