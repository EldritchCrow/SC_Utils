package sc_utility;

import java.util.ArrayList;

public abstract class Datum extends Object {
	
	String name;
	protected ArrayList vars;
	
	public void addVar(Object o, String index) {
		
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Datum)) return false;
		Datum d = (Datum) o;
		if(!name.equals(d.name)) return false;
		for(int i = 0; i < vars.size(); i++) {
			try {
				if(!vars.get(i).equals(d.vars.get(i))) return false;
			}
			catch(IndexOutOfBoundsException e) {
				return false;
			}
		}
		return true;
	}

	protected void log(String message) {
		System.out.println("[" + this.getClass().getName() + "]" + message);
	}
	
	protected void log(Object message) {
		log(message.toString());
	}
	
	protected void log(int message) {
		log(Integer.toString(message));
	}
	
	protected void log(long message) {
		log(Long.toString(message));
	}
	
	protected void log(char message) {
		log(Character.toString(message));
	}
	
	protected void log(boolean message) {
		log(Boolean.toString(message));
	}
	
	protected void log(float message) {
		log(Float.toString(message));
	}
	
	protected void log(double message) {
		log(Double.toString(message));
	}
	
}
