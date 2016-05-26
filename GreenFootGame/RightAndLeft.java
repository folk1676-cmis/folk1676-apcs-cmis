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
        die();
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
        else
        {
            turn(360);
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
