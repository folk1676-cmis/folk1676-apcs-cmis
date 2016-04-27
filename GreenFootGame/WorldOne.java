import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOne extends World
{

    /**
     * Constructor for objects of class WorldOne.
     * 
     */
    public WorldOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallHorizon wallhorizon = new WallHorizon();
        addObject(wallhorizon,450,5);
        WallHorizon wallhorizon2 = new WallHorizon();
        addObject(wallhorizon2,450,595);
        WallVertical wallvertical = new WallVertical();
        addObject(wallvertical,5,300);
        WallVertical wallvertical2 = new WallVertical();
        addObject(wallvertical2,895,300);
        WallOne wallone = new WallOne();
        addObject(wallone,130,260);
        WallOne wallone2 = new WallOne();
        addObject(wallone2,770,340);
        WallTwo walltwo = new WallTwo();
        addObject(walltwo,390,497);
        Player player = new Player();
        addObject(player,67,40);
    }
}
