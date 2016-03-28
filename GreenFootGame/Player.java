import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
}
