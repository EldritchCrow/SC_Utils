package sc_utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Utility {
	
	private Random rand = new Random();
	
	
	public boolean prob(double p) {
		if(p >= 100) return true;
		else if(p <= 0) return false;
		int i = rand.nextInt(100) + 1;
		if(i > p) return false;
		else return true;
	}
	
	public Object pick(Object[] args) {
		int i = rand.nextInt(args.length);
		return args[i];
	}
	
	public Object pick(List args) {
		int i = rand.nextInt(args.size());
		return args.get(i);
	}
	
	public String file2text(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String toReturn = "";
		while(reader.ready()) {
			toReturn += reader.readLine();
			toReturn += System.getProperty("line.seperator");
		}
		reader.close();
		return toReturn;
	}
	
	public LinkedList file2list(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		LinkedList toReturn = new LinkedList();
		while(reader.ready()) {
			toReturn.add(reader.readLine());
		}
		reader.close();
		return toReturn;
	}
	
	public boolean sleep(long millis, int nanos) {
		try {
			Thread.sleep(millis, nanos);
			return true;
		} catch (InterruptedException e) {
			return false;
		}
	}
	
	/**
	 * Returns an instance of t
	 * @param t The class to instantiate
	 * @return a new instance of t
	 */
	public Object create(Class t) {
		try {
			return t.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}
