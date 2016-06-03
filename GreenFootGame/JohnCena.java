import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JohnCena extends Player implements Character
{
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
