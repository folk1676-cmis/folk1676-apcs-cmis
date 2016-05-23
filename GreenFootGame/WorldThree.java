import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldThree extends World
{

    /**
     * Constructor for objects of class WorldThree.
     * 
     */
    public WorldThree()
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
        ActualPlayer actualplayer = new ActualPlayer();
        addObject(actualplayer,65,55);
        WallHorizonWhite wallhorizonwhite = new WallHorizonWhite();
        addObject(wallhorizonwhite,450,5);
        WallHorizonWhite wallhorizonwhite2 = new WallHorizonWhite();
        addObject(wallhorizonwhite2,450,595);
        WallVerticalWhite wallverticalwhite = new WallVerticalWhite();
        addObject(wallverticalwhite,5,300);
        WallVerticalWhite wallverticalwhite2 = new WallVerticalWhite();
        addObject(wallverticalwhite2,895,300);
        WallTwoWhite walltwowhite = new WallTwoWhite();
        addObject(walltwowhite,260,125);
        WallTwoWhite walltwowhite2 = new WallTwoWhite();
        addObject(walltwowhite2,640,475);;
        Random random = new Random();
        addObject(random,250,360);
        Random random2 = new Random();
        addObject(random2,600,250);
        Random random3 = new Random();
        addObject(random3,500,400);
        RandomReverse randomreverse = new RandomReverse();
        addObject(randomreverse,650,360);
        RandomReverse randomreverse2 = new RandomReverse();
        addObject(randomreverse2,700,225);
        RandomReverse randomreverse3 = new RandomReverse();
        addObject(randomreverse3,300,230);
        RandomReverse randomreverse4 = new RandomReverse();
        addObject(randomreverse4,700,225);
        DownAndUp downandup = new DownAndUp();
        addObject(downandup,450,400);
        UpAndDown upanddown = new UpAndDown();
        addObject(upanddown,450,200);
        LeftAndRight leftandright = new LeftAndRight();
        addObject(leftandright,65,545);
        LeftAndRightSlow leftandrightslow = new LeftAndRightSlow();
        addObject(leftandrightslow,65,545);
        DestinationThree destinationthree = new DestinationThree();
        addObject(destinationthree,835,545);
    }
}
