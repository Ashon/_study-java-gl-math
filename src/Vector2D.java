
public class Vector2D {
	double x;
	double y;
	
	public Vector2D(){
		x = 0;
		y = 0;
	}
	public Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Vector2D(Vector2D v){
		x = v.x;
		y = v.y;
	}
	
	public void add(double x, double y){
		this.x += x;
		this.y += y;
	}
	public void add(Vector2D v){
		x += v.x;
		y += v.y;
	}
	
	public void sub(double x, double y){
		this.x -= x;
		this.y -= y;
	}
	public void sub(Vector2D v){
		x -= v.x;
		y -= v.y;
	}
	
	public double dot(Vector2D v){
		return x * v.x + y * v.y;
	}
	public double cross(Vector2D v){
		return x * v.y - y * v.x;		
	}

	public void rotate(double x, double y, double radian){
		double dx = this.x - x;
		double dy = this.y - y;
		double cosR = Math.cos(radian);
		double sinR = Math.sin(radian);
		this.x = x + (dx * cosR - dy * sinR);
		this.y = y + (dx * sinR + dy * cosR);
	}
	public void rotate(Vector2D v, double radian){
		rotate(v.x, v.y, radian);
	}
	
	public void translate(double x, double y){
		add(x, y);
	}
	public void translate(Vector2D v){
		add(v.x, v.y);
	}
	
	@Override
	public String toString(){
		return super.toString() + '[' + x + ',' + y + ']';
	}
	
	public static void main(String [] args){
		Vector2D v = new Vector2D(20, 3);
	}
}