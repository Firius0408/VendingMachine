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
    private double money;
    private static DecimalFormat format = new DecimalFormat("###,###,#00.00");
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
        if(Greenfoot.getRandomNumber(10) < 9) {
            money++;
        }
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
}
