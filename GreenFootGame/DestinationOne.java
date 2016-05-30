import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DestinationOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestinationOne extends Destination implements FinishLine
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
        while (crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            crab = getOneObjectAtOffset(0, 0, Player.class);
            destination();
        }

    }

    public void destination()
    {
        Greenfoot.setWorld(new WorldTwo());
    }
    
    public void teleport()
    {
        
    }
}