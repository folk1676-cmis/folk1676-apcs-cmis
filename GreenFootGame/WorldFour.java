import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WWE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFour extends World
{

    /**
     * Constructor for objects of class WWE.
     * 
     */
    public WorldFour()
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
        WallTwo walltwo = new WallTwo();
        addObject(walltwo,260,125);
        WallTwo walltwo2 = new WallTwo();
        addObject(walltwo2,520,125);
        WallTwo walltwo3 = new WallTwo();
        addObject(walltwo3,640,475);
        WallTwo walltwo4 = new WallTwo();
        addObject(walltwo4,380,475);
        ActualPlayer actualplayer = new ActualPlayer();
        addObject(actualplayer,830,540);
        DownAndUp downandup = new DownAndUp();
        addObject(downandup,155,430);
        DownAndUp downandup2 = new DownAndUp();
        addObject(downandup2,280,430);
        UpAndDown upanddown = new UpAndDown();
        addObject(upanddown,218,170);
        UpAndDown upanddown2 = new UpAndDown();
        addObject(upanddown2,343,170);
        DownAndUp downandup3 = new DownAndUp();
        addObject(downandup3,745,430);
        DownAndUp downandup4 = new DownAndUp();
        addObject(downandup4,620,430);
        UpAndDown upanddown3 = new UpAndDown();
        addObject(upanddown3,682,170);
        UpAndDown upanddown4 = new UpAndDown();
        addObject(upanddown4,557,170);
        RandomReverse randomreverse = new RandomReverse();
        addObject(randomreverse,405,430);
        RandomReverse randomreverse2 = new RandomReverse();
        addObject(randomreverse2,530,430);
        Random random = new Random();
        addObject(random,468,170);
        Random random2 = new Random();
        addObject(random2,593,170);
        DestinationFour destinationfour = new DestinationFour();
        addObject(destinationfour,50,60);
    }
}
