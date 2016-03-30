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
        LeftAndRight leftandright = new LeftAndRight();
        addObject(leftandright,527,418);
        removeObject(leftandright);
        WallOne wallone2 = new WallOne();
        addObject(wallone2,808,348);
        wallone2.setLocation(808,340);
        WallOne wallone3 = new WallOne();
        addObject(wallone3,96,270);
        wallone3.setLocation(92,256);
        Player player = new Player();
        addObject(player,49,43);
        wallone3.setLocation(96,257);
        wallone2.setLocation(803,332);
        Player player2 = new Player();
        addObject(player2,862,566);
        player2.setLocation(857,561);
        wallone2.setLocation(810,341);
        removeObject(player2);
        WallTwo walltwo = new WallTwo();
        addObject(walltwo,573,83);
        walltwo.setLocation(573,78);
        WallTwo walltwo2 = new WallTwo();
        addObject(walltwo2,420,82);
        walltwo2.setLocation(427,78);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,43);
        player.setLocation(49,39);
        walltwo2.setLocation(495,77);
        WallTwo walltwo3 = new WallTwo();
        addObject(walltwo3,361,170);
        walltwo2.setLocation(500,78);
        walltwo3.setLocation(359,156);
        walltwo3.setLocation(359,161);
        WallTwo walltwo4 = new WallTwo();
        addObject(walltwo4,465,165);
        walltwo4.setLocation(423,161);
        RightAndLeft rightandleft = new RightAndLeft();
        addObject(rightandleft,759,127);
        rightandleft.setLocation(754,121);
        walltwo4.setLocation(423,327);
        removeObject(walltwo4);
        walltwo2.setLocation(526,316);
        removeObject(walltwo2);
        RightAndLeft rightandleft2 = new RightAndLeft();
        addObject(rightandleft2,154,214);
        removeObject(rightandleft2);
        LeftAndRight leftandright2 = new LeftAndRight();
        addObject(leftandright2,161,212);
        leftandright2.setLocation(160,205);
        WallTwo walltwo5 = new WallTwo();
        addObject(walltwo5,364,254);
        walltwo5.setLocation(356,244);
        WallTwo walltwo6 = new WallTwo();
        addObject(walltwo6,578,244);
        walltwo6.setLocation(549,244);
        removeObject(walltwo5);
        WallTwo walltwo7 = new WallTwo();
        addObject(walltwo7,364,320);
        walltwo7.setLocation(357,326);
    WallTwo walltwo8 = new WallTwo();
addObject(walltwo8,557,409);
walltwo8.setLocation(548,409);
WallTwo walltwo9 = new WallTwo();
addObject(walltwo9,377,496);
walltwo9.setLocation(358,494);
RightAndLeft rightandleft3 = new RightAndLeft();
addObject(rightandleft3,156,372);
rightandleft3.setLocation(755,456);
LeftAndRight leftandright3 = new LeftAndRight();
addObject(leftandright3,153,372);
leftandright3.setLocation(159,373);
removeObject(leftandright2);
UpAndDown upanddown = new UpAndDown();
addObject(upanddown,148,214);
removeObject(upanddown);
UpAndDown upanddown2 = new UpAndDown();
addObject(upanddown2,174,210);
upanddown2.setLocation(208,211);
DownAndUp downandup = new DownAndUp();
addObject(downandup,271,268);
downandup.setLocation(249,276);
upanddown2.setLocation(167,210);
removeObject(downandup);
upanddown2.setLocation(264,211);
DownAndUp downandup2 = new DownAndUp();
addObject(downandup2,166,285);
downandup2.setLocation(151,275);
Destination destination = new Destination();
addObject(destination,863,560);
destination.setLocation(859,554);
removeObject(destination);
}
}
