import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DestinationThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DestinationThree extends Destination implements FinishLine
{
    /**
     * Act - do whatever the DestinationThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        turnAtWall();
        finish();
    }    

    public void turnAtWall()
    {
        if ( isTouching(Wall.class) )
        {
            turn(180);
        }    
    }

    public void finish()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Player.class);
        if(crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.setWorld(new WorldFour());
        }
    }

    public void teleport()
    {

    }
}
