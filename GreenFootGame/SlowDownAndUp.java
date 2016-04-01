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
