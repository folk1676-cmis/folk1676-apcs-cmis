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
        WallOne wallone = new WallOne();
        addObject(wallone,580,224);
        WallVertical wallvertical = new WallVertical();
        addObject(wallvertical,501,245);
        removeObject(wallvertical);
        removeObject(wallone);
        WallVertical wallvertical2 = new WallVertical();
        addObject(wallvertical2,47,303);
        WallVertical wallvertical3 = new WallVertical();
        addObject(wallvertical3,501,311);
        WallHorizon wallhorizon = new WallHorizon();
        addObject(wallhorizon,736,300);
        WallHorizon wallhorizon2 = new WallHorizon();
        addObject(wallhorizon2,725,395);
        wallvertical2.setLocation(4,300);
        wallvertical3.setLocation(895,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(736,300);
        wallhorizon.setLocation(459,4);
        wallhorizon2.setLocation(460,595);
    wallhorizon2.setLocation(455,595);
}
}
