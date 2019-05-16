//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100,150);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}
	
	public Block(int x, int y)
	{
		setPos(x,y);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
	}
	
	public Block(int x, int y, int w)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(10);
		setColor(Color.black);
	}
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(Color.black);
	}
	
	
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
	@Override 
	public void setX(int x)
	{
		xPos = x;
	}
	@Override 
	public void setY(int y)
	{
		yPos = y;
	}
	
	@Override
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
   public boolean equals(Object obj)
   {
	   if(obj.equals(toString()))
		   return true;
	   return false;
   }   
	
   
   public Color getColor()
   {
	   return color;
   }
   public int getWidth() 
   {
	   return width;
   }
   public int getHeight()
   {
	   return height;
   }
	
   	@Override
	public int getX()
	{
		return xPos;
	}
   	@Override
	public int getY()
	{
		return yPos;
	}
    

	public String toString()
	{
		String output = getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();	
		return output;
	}

   //add a toString() method  - x , y , width, height, color
}