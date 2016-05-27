import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightAndLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RNG extends Enemy
{
    public void act()
    {      
        movement();
        turnAtWall();
        die();
    } 

    public void movement()
    {
        move(4);
        if(Greenfoot.getRandomNumber(50) <= 25)
        {
            turn(Greenfoot.getRandomNumber(180));
        }
        if(this.isAtEdge() == true)
        {
            turn(180);
        }
    }
}
