import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WWE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{

    /**
     * Constructor for objects of class WWE.
     * 
     */
    public Finish()
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
        JohnCena johncena = new JohnCena();
        addObject(johncena,94,87);
        WallHorizon wallhorizon = new WallHorizon();
        addObject(wallhorizon,450,5);
        WallHorizon wallhorizon2 = new WallHorizon();
        addObject(wallhorizon2,450,595);
        WallVertical wallvertical = new WallVertical();
        addObject(wallvertical,5,300);
        WallVertical wallvertical2 = new WallVertical();
        addObject(wallvertical2,895,300);
        CMPunk cmpunk = new CMPunk();
        addObject(cmpunk,727,100);
        FinnBalor finnbalor = new FinnBalor();
        addObject(finnbalor,361,521);
    }
}