import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftAndRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftAndRight extends Enemy
{
    /**
     * Act - do whatever the LeftAndRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int direction = 4;
    public void act() 
    {
        if (!isTouching(Wall.class))
        {
            if (isTouching(Wall.class))
            {
                direction *= -1;
            }    
            setLocation(getX()+direction,getY());
        }
    }
}
