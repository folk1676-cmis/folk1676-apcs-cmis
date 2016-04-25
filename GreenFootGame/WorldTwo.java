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
        UpAndDown upanddown = new UpAndDown();
        addObject(upanddown,243,40);
        upanddown.setLocation(230,47);
        UpAndDown upanddown2 = new UpAndDown();
        addObject(upanddown2,380,41);
        upanddown2.setLocation(375,46);
        UpAndDown upanddown3 = new UpAndDown();
        addObject(upanddown3,516,46);
        upanddown3.setLocation(530,44);
        UpAndDown upanddown4 = new UpAndDown();
        addObject(upanddown4,713,48);
        upanddown4.setLocation(702,44);
        DownAndUp downandup = new DownAndUp();
        addObject(downandup,258,558);
        downandup.setLocation(276,556);
        downandup.setLocation(301,552);
        DownAndUp downandup2 = new DownAndUp();
        addObject(downandup2,177,567);
        downandup2.setLocation(158,555);
        DownAndUp downandup3 = new DownAndUp();
        addObject(downandup3,432,567);
        downandup3.setLocation(454,555);
        DownAndUp downandup4 = new DownAndUp();
        addObject(downandup4,605,559);
        downandup4.setLocation(629,556);
        Player player = new Player();
        addObject(player,846,558);
        player.setLocation(840,552);
        LeftAndRight leftandright = new LeftAndRight();
        addObject(leftandright,172,50);
        leftandright.setLocation(168,48);
        leftandright.setLocation(167,489);
        RightAndLeft rightandleft = new RightAndLeft();
        addObject(rightandleft,173,369);
        rightandleft.setLocation(737,424);
        LeftAndRight leftandright2 = new LeftAndRight();
        addObject(leftandright2,177,361);
        leftandright2.setLocation(168,352);
        RightAndLeft rightandleft2 = new RightAndLeft();
        addObject(rightandleft2,739,295);
        rightandleft2.setLocation(737,291);
        LeftAndRight leftandright3 = new LeftAndRight();
        addObject(leftandright3,173,234);
        leftandright3.setLocation(169,221);
        RightAndLeft rightandleft3 = new RightAndLeft();
        addObject(rightandleft3,741,147);
        rightandleft3.setLocation(735,143);
        Destination destination = new Destination();
        addObject(destination,57,63);
        destination.setLocation(57,54);
        removeObject(destination);
        DestinationTwo destinationtwo = new DestinationTwo();
        addObject(destinationtwo,58,57);
    }
}
