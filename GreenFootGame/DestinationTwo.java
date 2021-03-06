import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DestinationTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestinationTwo extends Destination implements FinishLine
{
    /**
     * Act - do whatever the DestinationTwo wants to do. This method is called whenever
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
        Greenfoot.setWorld(new WorldThree());
    }

    public void teleport()
    {

    }
}
