package demos;

import processing.core.PApplet;
import processing.core.PImage;
public class MyPApplet1 extends PApplet{
	PImage img;
	int h = hour();
	
	public void setup() {
		size(500,500);//default size of the canvas is (500,500), meaning width is 500 and height is 500.
		img = loadImage("https://www.treebo.com/blog/wp-content/uploads/2018/08/Aerial-view-of-RK-beach.jpg","jpg");// Here, you have loaded the image of RK Beach, Vizag into the memory of the program.
	}
	
	public void draw(){
		image(img,0,0);//Here you are displaying the loaded image with starting point being the coordinates,(0,0).
		img.resize(0, height);// Now you are resizing the image so that it  dynamically changes 
		int[] color = sunColorMin(hour());
		fill(color[0],color[1],color[2]);
		ellipse(width/4, height/4, width/5, height/5);//inserting the sun, again with dynamic coordinate values..
		
		
	}

	private int[] sunColorMin(int hour) {
		// TODO Auto-generated method stub
		int[] rgb = new int[3];//an array for storing the red green blue values.
		if(hour!=0 && hour<=12) {
			float diffFrom0=Math.abs(0-hour);//we need to calculate the difference or absolute value of the current hour
			//for example, if its 12 pm, then diffFrom23 will store 23-12=11
			float ratio = diffFrom0/12;
			//this is to know how close the value is to 0/1
			//for suppose for diffFrom23=11,tot=11/23 which equals to 0
			
			rgb[0] = (int)(255*ratio);
			rgb[1] = (int)(255*ratio);
			rgb[2] = 0;
			
			//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
			return rgb;
		
			
	}
		if(hour>12)
		{
			float diffFrom23=Math.abs(23-hour);//we need to calculate the difference or absolute value of the current hour
			//for example, if its 12 pm, then diffFrom23 will store 23-12=11
			float ratio = diffFrom23/12;
			//this is to know how close the value is to 0/1
			//for suppose for diffFrom23=11,tot=11/23 which equals to 0
			
			rgb[0] = (int)(255*ratio);
			rgb[1] = (int)(255*ratio);
			rgb[2] = 0;
			
			//System.out.println("R" + rgb[0] + " G" + rgb[1] + " B" + rgb[2]);
			return rgb;
		}
		if(hour==0)
		{
			rgb[0] = 0;
			rgb[1] = 0;
			rgb[2] = 0;
			
			return rgb;
		}
		return rgb;
	}

	
}
