import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpAndDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowDownAndUp extends Enemy
{
    public void act()
    {      
        move(2);
        turnAtWall();
        die();
    } 

    public SlowDownAndUp()
    {
        setRotation(-90);
    }
}
