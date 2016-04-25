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
    Player player = new Player();
    addObject(player,48,46);
    player.setLocation(49,42);
}
}
