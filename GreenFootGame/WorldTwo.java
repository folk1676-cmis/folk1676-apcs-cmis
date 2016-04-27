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
        RightAndLeft rightandleft3 = new RightAndLeft();
        addObject(rightandleft3,740,372);
        RightAndLeft rightandleft4 = new RightAndLeft();
        addObject(rightandleft4,740,497);
        LeftAndRight leftandright = new LeftAndRight();
        addObject(leftandright,743,190);
        leftandright.setLocation(164,176);
        removeObject(leftandright);
        LeftAndRight leftandright2 = new LeftAndRight();
        addObject(leftandright2,743,190);
        leftandright2.setLocation(627,181);
        removeObject(leftandright2);
        LeftAndRight leftandright3 = new LeftAndRight();
        addObject(leftandright3,165,184);
        LeftAndRight leftandright4 = new LeftAndRight();
        addObject(leftandright4,165,309);
        LeftAndRight leftandright5 = new LeftAndRight();
        addObject(leftandright5,165,434);
        UpAndDown upanddown = new UpAndDown();
        addObject(upanddown,165,47);
        UpAndDown upanddown2 = new UpAndDown();
        addObject(upanddown2,290,47);
        UpAndDown upanddown3 = new UpAndDown();
        addObject(upanddown3,415,47);
        UpAndDown upanddown4 = new UpAndDown();
        addObject(upanddown4,540,47);
        UpAndDown upanddown5 = new UpAndDown();
        addObject(upanddown5,665,47);
        DownAndUp downandup = new DownAndUp();
        addObject(downandup,228,553);
        DownAndUp downandup2 = new DownAndUp();
        addObject(downandup2,353,553);
        DownAndUp downandup3 = new DownAndUp();
        addObject(downandup3,478,553);
        DownAndUp downandup4 = new DownAndUp();
        addObject(downandup4,603,553);
        Player player = new Player();
        addObject(player,850,551);
        player.setLocation(843,547);
        DestinationTwo destinationtwo = new DestinationTwo();
        addObject(destinationtwo,61,52);
        destinationtwo.setLocation(55,48);
    }
}
