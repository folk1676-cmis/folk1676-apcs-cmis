import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,142,256);
        Worm worm = new Worm();
        addObject(worm,346,141);
        Worm worm2 = new Worm();
        addObject(worm2,383,286);
        Worm worm3 = new Worm();
        addObject(worm3,473,190);
        Worm worm4 = new Worm();
        addObject(worm4,432,383);
        Worm worm5 = new Worm();
        addObject(worm5,191,436);
        Worm worm6 = new Worm();
        addObject(worm6,268,252);
        Worm worm7 = new Worm();
        addObject(worm7,150,110);
        Worm worm8 = new Worm();
        addObject(worm8,38,362);
        Worm worm9 = new Worm();
        addObject(worm9,311,459);
        Worm worm10 = new Worm();
        addObject(worm10,513,495);
        Worm worm11 = new Worm();
        addObject(worm11,152,514);
        Worm worm12 = new Worm();
        addObject(worm12,290,358);
        Worm worm13 = new Worm();
        addObject(worm13,77,176);
        Worm worm14 = new Worm();
        addObject(worm14,131,58);
        Worm worm15 = new Worm();
        addObject(worm15,305,62);
        Worm worm16 = new Worm();
        addObject(worm16,473,67);
        Worm worm17 = new Worm();
        addObject(worm17,254,159);
    }
}
