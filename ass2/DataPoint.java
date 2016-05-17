package ass2;

import java.util.ArrayList;

public class DataPoint {
	
  	private int a;
	private ArrayList<Double> list;
  	public double l_x;
  	public double y;
  
  	public DataPoint(int a_, ArrayList<Double> l) {
      	this.a = a_;
    	this.list = l;
      	this.l_x = getLengthX(list);
      	this.y = Math.exp(-a * l_x);
  	}
  
  	// Computes ||x||
    public double getLengthX(ArrayList<Double> list) {
    	double ret = 0;
      	for (double d : list) {
        	ret += Math.pow(d, 2);
      	}
      	return Math.sqrt(ret);
    }
  
  	public int getListSize() {
    	return list.size();
  	}
  
  	@Override
  	public String toString() {
    	return list.toString() + " - " + l_x + " - " + y;
  	}
  
}