import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpAndDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpAndDown extends Enemy
{
    /**
     * Act - do whatever the UpAndDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() - 5 )
        {
            turn(180);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() - 5 )
        {
            turn(180);
        }

        if (isTouching(Wall.class))
        {
            setLocation(getX() + 4, getY());
        }
        if (isTouching(Wall.class))
        {
            setLocation(getX() - 4, getY());
        }
        if (isTouching(Wall.class))
        {
            setLocation(getX(), getY() + 4);
        }
        if (isTouching(Wall.class))
        {
            setLocation(getX(), getY() - 4);
        }
    }    
}
