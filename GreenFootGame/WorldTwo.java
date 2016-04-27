import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldTwo extends World
{

    /**
     * Constructor for objects of class WorldTwo.
     * 
     */
    public WorldTwo()
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
        WallHorizonWhite wallhorizonwhite = new WallHorizonWhite();
        addObject(wallhorizonwhite,454,596);
        wallhorizonwhite.setLocation(451,595);
        WallVerticalWhite wallverticalwhite = new WallVerticalWhite();
        addObject(wallverticalwhite,14,325);
        wallverticalwhite.setLocation(5,299);
        WallHorizonWhite wallhorizonwhite2 = new WallHorizonWhite();
        addObject(wallhorizonwhite2,455,17);
        wallhorizonwhite2.setLocation(459,5);
        WallVerticalWhite wallverticalwhite2 = new WallVerticalWhite();
        addObject(wallverticalwhite2,897,308);
        wallverticalwhite2.setLocation(895,310);
        WallOneWhite wallonewhite = new WallOneWhite();
        addObject(wallonewhite,787,344);
        wallonewhite.setLocation(786,340);
        WallOneWhite wallonewhite2 = new WallOneWhite();
        addObject(wallonewhite2,119,289);
        wallonewhite2.setLocation(114,259);
        RightAndLeft rightandleft = new RightAndLeft();
        addObject(rightandleft,740,122);
        rightandleft.setLocation(740,122);
        RightAndLeft rightandleft2 = new RightAndLeft();
        addObject(rightandleft2,740,122);
        rightandleft.setLocation(740,247);
    }
}
