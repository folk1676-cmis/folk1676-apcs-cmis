import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DestinationOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestinationOne extends Destination
{
    /**
     * Act - do whatever the destination wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        finish();  
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
            Greenfoot.setWorld(new WorldTwo());
        }
    }
}