//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
	   setSpeed(5);
   }
   public Paddle(int x, int y)
   {
	   super(x,y);
	   setSpeed(5);
   }
   public Paddle(int x, int y, int s)
   {
	   super(x,y);
	   setSpeed(s);
   }
   public Paddle(int x, int y, int width, int height)
   {
	   super(x,y,width,height);
	   setSpeed(5);
   }
   public Paddle(int x, int y, int width, int height, int s)
   {
	   super(x,y,width,height);
	   setSpeed(s);
   }
   public Paddle(int x, int y, int width, int height, int s, Color c)
   {
	   super(x,y,width,height,c);
	   setSpeed(s);
   }
   public void setSpeed(int s)
   {
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   
   }

   public void moveDownAndDraw(Graphics window)
   {


   }
   
   public int getSpeed()
   {
	   return speed;
   }

   public String toString()
   {
	   return super.toString() + " " + getSpeed();
   }
}