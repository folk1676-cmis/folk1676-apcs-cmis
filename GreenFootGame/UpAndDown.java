import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpAndDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpAndDown extends Enemy
{
    public void act()
    {      
        move(4);
        turnAtWall();
        die();
    } 

    public UpAndDown()
    {
        setRotation(90);
    }
}
