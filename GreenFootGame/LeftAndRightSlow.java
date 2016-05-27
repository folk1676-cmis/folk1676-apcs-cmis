import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftAndRightSlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftAndRightSlow extends Enemy
{
    public void act()
    {      
        move(2);
        turnAtWall();
        die();
    } 
}
