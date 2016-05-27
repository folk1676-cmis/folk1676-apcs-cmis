import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Circular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CMPunk extends Enemy
{
    public void act() 
    {
        move(4);
        followHuman();
        turnAtWall();
        die();
    }

    public void followHuman()
    {
        int dist = 400;
        Actor kill = null;
        if(!getObjectsInRange(dist, Player.class).isEmpty())
        {
            for (Object obj : getObjectsInRange(dist, Player.class))
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