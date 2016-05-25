import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class DestinationFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestinationFour extends Destination
{
    private int port;
    private int x = (int)Math.random()*10;
    /**
     * Act - do whatever the DestinationFour wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        finish();
        teleport();
    }    

    public void finish()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Player.class);
        if(crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.setWorld(new Finish());
        }
    }

    public void teleport()
    {
        ArrayList<Integer> tp = new ArrayList<Integer>(); 
        tp.add(50);
        tp.add(100);
        tp.add(150);
        tp.add(200);
        tp.add(250);
        tp.add(300);
        tp.add(350);
        tp.add(400);
        tp.add(450);
        tp.add(500);
        tp.add(550);
        tp.add(600);
        tp.add(650);
        tp.add(700);
        tp.add(750);
        tp.add(850);
        int i = (int)(Math.random()*16);
        if (port > 10)
        {
            port = 0;
            setLocation( tp.get(i),60 );
        }
        port++;
    }
}
