import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class worldOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class worldOne extends World
{

    /**
     * Constructor for objects of class worldOne.
     * 
     */
    public worldOne()
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
        WallVertical Wallvertical = new WallVertical();
        addObject(Wallvertical,3,307);
        Wallvertical.setLocation(3,299);
        WallHorizon Wallhorizon = new WallHorizon();
        addObject(Wallhorizon,458,13);
        Wallhorizon.setLocation(453,3);
        WallHorizon Wallhorizon2 = new WallHorizon();
        WallHorizon Wallhorizon3 = new WallHorizon();
        addObject(Wallhorizon3,452,583);
        Wallhorizon3.setLocation(450,596);
        WallVertical Wallvertical2 = new WallVertical();
        addObject(Wallvertical2,898,302);
        Player Player = new Player();
        addObject(Player,121,143);
        Player.setLocation(45,43);
        WallVertical Wallvertical3 = new WallVertical();
        addObject(Wallvertical3,93,227);
        Wallvertical3.setLocation(86,224);
        Destination destination = new Destination();
        addObject(destination,847,551);
        destination.setLocation(849,547);
        removeObject(destination);
        Destination destination2 = new Destination();
        addObject(destination2,862,558);
        destination2.setLocation(848,527);
        removeObject(destination2);
        Destination destination3 = new Destination();
        addObject(destination3,870,560);
        destination3.setLocation(856,553);
        WallVertical wallvertical4 = new WallVertical();
        addObject(wallvertical4,818,391);
        wallvertical4.setLocation(811,386);
        wallvertical4.setLocation(811,377);
        wallvertical4.setLocation(811,380);
        wallvertical4.setLocation(811,387);
        wallvertical4.setLocation(810,384);
        wallvertical4.setLocation(818,381);
    WallVertical wallvertical5 = new WallVertical();
addObject(wallvertical5,816,388);
wallvertical5.setLocation(808,381);
WallVertical wallvertical6 = new WallVertical();
addObject(wallvertical6,795,385);
wallvertical6.setLocation(799,381);
wallvertical6.setLocation(664,358);
removeObject(wallvertical6);
wallvertical5.setLocation(727,374);
removeObject(wallvertical5);
UpAndDown upanddown = new UpAndDown();
addObject(upanddown,474,309);
UpAndDown upanddown2 = new UpAndDown();
addObject(upanddown2,533,190);
UpAndDown upanddown3 = new UpAndDown();
addObject(upanddown3,600,417);
UpAndDown upanddown4 = new UpAndDown();
addObject(upanddown4,270,194);
UpAndDown upanddown5 = new UpAndDown();
addObject(upanddown5,622,252);
UpAndDown upanddown6 = new UpAndDown();
addObject(upanddown6,325,447);
UpAndDown upanddown7 = new UpAndDown();
addObject(upanddown7,300,297);
UpAndDown upanddown8 = new UpAndDown();
addObject(upanddown8,396,197);
UpAndDown upanddown9 = new UpAndDown();
addObject(upanddown9,388,83);
UpAndDown upanddown10 = new UpAndDown();
addObject(upanddown10,545,37);
UpAndDown upanddown11 = new UpAndDown();
addObject(upanddown11,716,108);
UpAndDown upanddown12 = new UpAndDown();
addObject(upanddown12,783,320);
UpAndDown upanddown13 = new UpAndDown();
addObject(upanddown13,688,529);
UpAndDown upanddown14 = new UpAndDown();
addObject(upanddown14,492,550);
UpAndDown upanddown15 = new UpAndDown();
addObject(upanddown15,448,443);
UpAndDown upanddown16 = new UpAndDown();
addObject(upanddown16,274,384);
UpAndDown upanddown17 = new UpAndDown();
addObject(upanddown17,174,470);
UpAndDown upanddown18 = new UpAndDown();
addObject(upanddown18,131,260);
UpAndDown upanddown19 = new UpAndDown();
addObject(upanddown19,193,121);
UpAndDown upanddown20 = new UpAndDown();
addObject(upanddown20,233,78);
upanddown20.setLocation(266,69);
}
}
