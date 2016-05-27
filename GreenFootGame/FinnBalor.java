import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinnBalor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinnBalor extends Ally
{
    /**
     * Act - do whatever the FinnBalor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        followNPC();
        turnAtWall();
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
        crab = getOneObjectAtOffset(0, 0, Enemy.class);
        if(crab != null)
        {
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.setWorld(new RealWin());
        }
    }

    public void followNPC()
    {
        int dist = 400;
        Actor kill = null;
        if(!getObjectsInRange(dist, Enemy.class).isEmpty())
        {
            for (Object obj : getObjectsInRange(dist, Enemy.class))
            {
                Actor guy = (Actor) obj;
                int guyDist = (int) Math.hypot(guy.getX() - getX(), guy.getY() - getY());
                if (kill == null || guyDist< dist)
                {
                    kill = guy;
                    dist = guyDist;
                }
            }
            turnTowards(kill.getX(),kill.getY());
        }   
    }
}
