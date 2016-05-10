import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    public void act() 
    {
        moveAndTurn();
        eat();
    }

    public void moveAndTurn()
    {
        move(3);

        if(Greenfoot.isKeyDown("a"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            turn(5);
        }
    }

    public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Crab.class);
        if(crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.wav");
        }
    }
}
