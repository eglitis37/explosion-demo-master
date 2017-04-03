import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadWorld here.
 * 
 * @author Klavs Eglitis
 * @version 3/23/2017
 */
public class BadWorld extends World
{

    /**
     * Constructor for objects of class BadWorld.
     * 
     */
    public BadWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Explosion explosion = new Explosion();
        addObject(explosion,218,239);
        Explosion explosion2 = new Explosion();
        addObject(explosion2,298,285);
        Explosion explosion3 = new Explosion();
        addObject(explosion3,422,217);
        Explosion explosion4 = new Explosion();
        addObject(explosion4,362,148);
        Explosion explosion5 = new Explosion();
        addObject(explosion5,291,134);
        Explosion explosion6 = new Explosion();
        addObject(explosion6,125,150);
        Explosion explosion7 = new Explosion();
        addObject(explosion7,124,290);
        removeObject(explosion2);
        removeObject(explosion);
        removeObject(explosion6);
        removeObject(explosion7);
        removeObject(explosion5);
        removeObject(explosion4);
        removeObject(explosion3);
        Explosion explosion8 = new Explosion();
        addObject(explosion8,139,89);
        Explosion explosion9 = new Explosion();
        addObject(explosion9,140,217);
        Explosion explosion10 = new Explosion();
        addObject(explosion10,145,351);
        Explosion explosion11 = new Explosion();
        addObject(explosion11,327,349);
        Explosion explosion12 = new Explosion();
        addObject(explosion12,312,221);
        Explosion explosion13 = new Explosion();
        addObject(explosion13,309,106);
        Explosion explosion14 = new Explosion();
        addObject(explosion14,484,104);
        Explosion explosion15 = new Explosion();
        addObject(explosion15,477,219);
        Explosion explosion16 = new Explosion();
        addObject(explosion16,492,328);
        Rock rock = new Rock();
        addObject(rock,501,332);
        Rock rock2 = new Rock();
        addObject(rock2,483,223);
        Rock rock3 = new Rock();
        addObject(rock3,484,111);
        Rock rock4 = new Rock();
        addObject(rock4,316,108);
        Rock rock5 = new Rock();
        addObject(rock5,319,236);
        Rock rock6 = new Rock();
        addObject(rock6,332,350);
        Rock rock7 = new Rock();
        addObject(rock7,157,353);
        Rock rock8 = new Rock();
        addObject(rock8,147,224);
        Rock rock9 = new Rock();
        addObject(rock9,143,99);
        rock5.setLocation(315,227);
    }
}
