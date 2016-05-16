import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActualPlayer extends Player
{
    int obito = 0;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        die();
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
            if (isTouching(Wall.class))
            {
                setLocation(getX() + 4, getY());
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
            if (isTouching(Wall.class))
            {
                setLocation(getX() - 4, getY());
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
            if (isTouching(Wall.class))
            {
                setLocation(getX(), getY() + 4);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+4);
            if (isTouching(Wall.class))
            {
                setLocation(getX(), getY() - 4);
            }
        }
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