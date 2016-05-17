package ass2;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {
	  
  	private int p;
  	private int N;
  	private int a;
  
  	public DataGenerator(int p_, int N_, int a_) {
    	this.p = p_;
      	this.N = N_;
      	this.a = a_;
  	}
	  
	public ArrayList<DataPoint> generateDataPoint() {
      	ArrayList<DataPoint> dp_list = new ArrayList<DataPoint>();
      
    	// The amount of samples to take (N = 1000)
    	for (int i = 0; i < N; i++) {
    		ArrayList<Double> list = new ArrayList<Double>(p);
      		for (int y = 0; y < p ; y ++) {
      			double x = ThreadLocalRandom.current().nextDouble(0.0, 1.0);
        		list.add(x);
      		}
          	dp_list.add(new DataPoint(a, list));
    	}
      	return dp_list;
   	} 	
}
