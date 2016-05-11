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

    public void turnAtWall()
    {
        if ( isTouching(Wall.class) )
        {
            turn(180);
        }    
    }

    public void die()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Player.class);
        if(crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.setWorld(new GameOver());
        }
    }
}
