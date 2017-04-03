import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * An explosion. It starts by expanding and then collapsing. 
 * The explosion will explode other obejcts that the explosion intersects.
 * 
 * @author Poul Henriksen
 * @version 1.0.1
 */
public class Explosion extends Actor
{
    private final static int IMAGE_COUNT = 12;
    
    private static GreenfootImage[] images;
    
    private int imageNum = 0;
    
    private int increment = 1;
    
    private int actCycles = 0;
    
    /**
     * Explosion is the constructer for our Explosion objects.
     */
    public Explosion()
    {
        initializeImages();
        setImage( images[0] );
    }
    
    /**
     * initializeImages fills the GreenfootImage array with images
     * for our explosion.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private synchronized static void initializeImages()
    {
        GreenfootImage baseImage = new GreenfootImage("explosion-big.png");
        int size;
        
        if( images == null )
        {
            images = new GreenfootImage[IMAGE_COUNT];
        
            for( int i = 0; i < images.length; i++ )
            {
                size = (i+1) * ( baseImage.getWidth() / IMAGE_COUNT );
                images[i] = new GreenfootImage( baseImage );
                images[i].scale( size, size );
            }
        }
    }
    
    /**
     * act will cause the Explosion to increase in size until it hits 
     * maximum size, then it will decrease in size until it reaches
     * it's minimum. Once this occurs, it will remove itself from the
     * world.
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void act()
    {
        
        if( actCycles == 0 )
        {
            Greenfoot.playSound("MetalExplosion.wav");
        }
        
        actCycles++;
        
        setImage( images[imageNum] );
        
        imageNum += increment;
        
        if( imageNum >= IMAGE_COUNT )
        {
            increment = -increment;
            imageNum += increment;
        }
        
        if( imageNum < 0 )
        {
            getWorld().removeObject(this);
        }
    }
}