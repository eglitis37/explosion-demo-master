import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        explode();
    }
    
    /**
     * explode plays explosion sound and runs loop that adds a new Debris object
     * to the world and remove itself from the world.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void explode()
    {
        Greenfoot.playSound("MetalExplosion.wav");
        
        for( int i = 0; i < 50; i++ )
        {
            getWorld().addObject(new Debris(), getX(), getY());
            
        }
        getWorld().removeObject(this);
    }
}
