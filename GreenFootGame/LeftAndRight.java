import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftAndRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftAndRight extends Enemy
{
    public void act()
    {      
        move(4);
        turnAtWall();
    } 

    public void turnAtWall()
    {
        if ( isTouching(Wall.class) )
        {
            turn(180);
        }    
    }
}