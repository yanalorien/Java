package interfaces;

public class TestDrawable
{
	public static void main(String[] args)
	{
		Circle c = new Circle();
		c.draw();
		c.fillWithRedColor();
		
		Drawable dr = new Circle();
		dr.draw();
		
		dr = new Square();
		dr.draw();
		
		Drawable.drawing();
		
		dr.drawWithPen();
	}
}
