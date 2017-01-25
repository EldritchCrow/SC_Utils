package sc_utility;

public class Coords extends Datum {
	int x_pos;
	int y_pos;
	int z_pos;
	
	public Coords(int x, int y, int z) {
		name = "Coordinate";
		x_pos = x;
		y_pos = y;
		z_pos = z;
		vars.add(name);
		vars.add(new Integer(x_pos));
		vars.add(new Integer(y_pos));
		vars.add(new Integer(z_pos));
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Coords)) return false;
		Coords c = (Coords) o;
		return (x_pos == c.x_pos) || (y_pos == c.y_pos) || (z_pos == c.z_pos);
	}
}
