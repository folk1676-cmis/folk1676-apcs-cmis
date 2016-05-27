import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlowUpAndDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowUpAndDown extends Enemy
{
    public void act()
    {      
        move(2);
        turnAtWall();
        die();
    } 

    public SlowUpAndDown()
    {
        setRotation(90);
    }
}
