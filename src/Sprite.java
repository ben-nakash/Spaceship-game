import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Sprite 
{
    protected BufferedImage bImage;
    protected int imageWidth, imageHeight; // image dimensions
    
    protected int angle, hp, speed;
    protected int locX, locY;
    protected int pWidth, pHeight;  // panel's dimensions
    protected boolean isCollide;
    
    public Sprite(int x, int y, int w, int h, int speed, int angle, int hp) 
    {
        locX = x;
        locY = y;
        this.speed = speed;
        this.angle = angle;
        pWidth = w;
        pHeight = h;
        this.hp = hp;
        isCollide = false;
    }
    
    public boolean getIsCollide()
	{
		return isCollide;
	}

	public void setIsCollide()
	{
		isCollide = true;
	}
    
    public void setImage(BufferedImage img)
    {
    	bImage = img;
    	if(bImage != null)
        {
            imageWidth = bImage.getWidth(null);
            imageHeight = bImage.getHeight(null);
        }
    }
    
    public Rectangle getBoundingBox()
    {
        return new Rectangle((int)getLocX(), (int)getLocY(), imageWidth, imageHeight);
    }

    public int getLocX() 
    {
        return locX;
    }
    
    public int getLocY() 
    {
        return locY;
    }
    
    public double getSpeed()
    {
    	return speed;
    }
    
    public int getAngle()
    {
    	return angle;
    }
    
    public int getImageWidth() 
    { 
        return imageWidth;
    }
    
    public int getImageHeight()
    {
        return imageHeight;
    }
    
    public double getHp()
    {
    	return hp;
    }
    public void setHp(int newHp)
    {
    	hp = newHp;
    }
    public void setSpeed(int newSpeed)
    {
    	speed = newSpeed;
    }
    
    
    public void updateSprite()
    { 
    	double radian = Math.toRadians(90);
    	// move at the x axis
        locX += speed * Math.cos(radian);
        if (locX >= pWidth + imageWidth)
        	locX = 0 - imageWidth;
        else if (locX < 0 - imageWidth)
        	locX = pWidth;
        // move at the y axis
        locY += speed * Math.sin(radian);
        if (locY >= pHeight)
        	locY = 0 - imageHeight;
        else if (locY < 0 - imageHeight)
        	locY = pHeight;
    }
    
    public void drawSprite(Graphics2D g)
    {
       g.fillRect((int)locX, (int)locY, imageWidth, imageHeight);
    }
}

