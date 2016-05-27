import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftAndRightSlowSlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftAndRightSlowSlow extends Enemy
{
    public void act()
    {      
        move(1);
        turnAtWall();
        die();
    } 
}
