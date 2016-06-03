import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Actor
{
    int obito = 0;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        die();
    }

    public void die()
    {
        {
            Actor crab;
            crab = getOneObjectAtOffset(0, 0, Eat.class);
            if(crab != null)
            {
                World world;
                world = getWorld();
                world.removeObject(crab);
            }
        }
    }
}
