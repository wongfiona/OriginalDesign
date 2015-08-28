import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

	int x1 = 200;
	int y1 = 50;
	int x2 = 189;
	int y2 = 69;
	int x3 = 210;
	int y3 = 70;

	int a = 77;
	int b = 55;
	int c = 56;

public void setup()
{
	size(400, 400);
}

public void draw()
{
	stars();
 	buildings();

}

public void stars()
{
	background(16, 31, 74);
	
	fill(255, 255, 0);
	noStroke();
	triangle(x1, y1, x2, y2, x3, y3);
	triangle(x1, a, x2, b, x3, c);

	//right
	triangle(x1+75, y1+75, x2+75, y2+75, x3+75, y3+75);
	triangle(x1+75, a+75, x2+75, b+75, x3+75, c+75);

	//left
	triangle(x1-118, y1+45, x2-118, y2+45, x3-118, y3+45);
	triangle(x1-118, a+45, x2-118, b+45, x3-118, c+45);

	//top right
	triangle(x1+150, y1+25, x2+150, y2+25, x3+150, y3+25);
	triangle(x1+150, a+25, x2+150, b+25, x3+150, c+25);

	//middle
	triangle(x1-50, y1+130, x2-50, y2+130, x3-50, y3+130);
	triangle(x1-50, a+130, x2-50, b+130, x3-50, c+130);

	//bottom left
	triangle(x1-170, y1+170, x2-170, y2+170, x3-170, y3+170);
	triangle(x1-170, a+170, x2-170, b+170, x3-170, c+170);

	//bottom right
	triangle(x1+150, y1+150, x2+150, y2+150, x3+150, y3+150);
	triangle(x1+150, a+150, x2+150, b+150, x3+150, c+150);

	x1 = x1 + 1;
    y1 = y1 + 1;
    x2 = x2 + 1;
    y2 = y2 + 1;
    x3 = x3 + 1;
    y3 = y3 + 1;
    a = a + 1;
    b = b + 1;
    c = c + 1;

    if(x1>400){
    	x1 = 200;
    	x1 = x1-50;
    	y1 = 50;
    	y1 = y1-50;
    	x2 = 189;
    	x2 = x2-50;
    	y2 = 69;
    	y2 = y2-50;
    	x3 = 210;
    	x3 = x3-50;
    	y3 = 70;
    	y3 = y3-50;
    	a = 77;
    	a = a-50;
    	b = 55;
    	b = b-50;
    	c = 56;
    	c = c-50;

    }


}

public void buildings()
{
	fill(194, 192, 192);
	stroke(0, 0, 0);
	rect(0, 310, 80, 90);
	rect(80, 250, 70, 150);
	rect(150, 274, 76, 126);
	triangle(310, 264, 264, 204, 226, 264);
	rect(226, 262, 83, 140);
	rect(309, 290, 91, 110);

}

	


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
