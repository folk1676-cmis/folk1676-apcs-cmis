import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpAndDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DownAndUp extends Enemy
{
    public void act()
    {      
        move(4);
        turnAtWall();
    } 

    public DownAndUp()
    {
        setRotation(-90);
    }

    public void turnAtWall()
    {
        if ( isTouching(Wall.class) )
        {
            turn(180);
        }    
    }
}
