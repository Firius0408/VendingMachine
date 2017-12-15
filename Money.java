import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DecimalFormat;
import java.awt.*;
/**
 * Write a description of class Money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Money extends Actor
{
    private double money; // the amount of money the user has
    private static DecimalFormat format = new DecimalFormat("###,###,#00.00"); // used for rounding
    /**
     * Act - do whatever the Money wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        clicky();
    }    

    public Money() {
        GreenfootImage image = new GreenfootImage("coinslot.jpg");
        image.scale(90, 150);
        setImage(image);
    }

    public void addMoney() {
            money++;
    }

    public void removeMoney(double price) {
        money -= price;
    }

    public double getMoney() {
        return money;
    }

    public String getMoneyString() {
        return format.format(money);
    }

    public void clicky() {
        if(Greenfoot.mouseClicked(this)) {
            addMoney();
        }
    }
    /** When I was using the lastest greenfoot I could prompt the user to enter a specific dollar amount to add and used this method to check that the input supplied was an integer. Unfortantely the old Greenfoot cannot ask the user
     * so I commented this out and just had it add one dollar every time the coinslot was clicked.
    public boolean isInteger(String str) { // checks user input to ensure it's an integer
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if ((c < '0' || c > '9') && c != '.') {
                return false;
            }
        }
        return true;
    }
    */
}
