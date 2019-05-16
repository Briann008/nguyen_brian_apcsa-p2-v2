//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setSpeed(3,1);
	}
	public Ball(int x, int y)
	{
		super(x,y);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		setSpeed(3,1);
	}
	public Ball(int x, int y, int w, int h, Color c, int xFast, int yFast)
	{
		super(x,y,w,h,c);
		setSpeed(xFast,yFast);
	}
	   
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
	public void setYSpeed(int y)
	{
		ySpeed = y;
	}
	public void setSpeed(int x, int y)
	{
		setXSpeed(x);
		setYSpeed(y);
	}
	
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);


      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(obj.equals(toString()))
		{
			return true;
		}
		return false;
	}   

	public int getXSpeed() 
	{
		return xSpeed;
	}
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		String output = super.getX() + " " + super.getY() + " " + super.getWidth() + " " + super.getHeight() + " " +super.getColor() + 
				" " + getXSpeed() + " " + getYSpeed();	
		return output;
	}
}