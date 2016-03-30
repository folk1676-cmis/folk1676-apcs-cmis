import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightAndLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightAndLeft extends Enemy
{
    public void act()
    {      
        move(4);
        turnAtWall();
    } 

    public RightAndLeft()
    {
        setRotation(180);
    }
    
    public void turnAtWall()
    {
        if ( isTouching(Wall.class) )
        {
            turn(180);
        }    
    }
}
