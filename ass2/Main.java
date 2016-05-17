package ass2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	public static int N = 1;
	public static int a = 8;

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(4);
		
		ArrayList<ArrayList<DataPoint>> datapoints = new ArrayList<ArrayList<DataPoint>>();
		for (int x = 0; x < 5; x++) {
			N *= 10; 
//			System.out.println("------ N = " + N + " -------");
			System.out.print(N + " & ");
			for (int z = 0; z < 10; z++) {
				datapoints.clear();

				for (int p = 1; p <= 32; p *= 2) {
					DataGenerator dg = new DataGenerator(p, N, a);
					datapoints.add(dg.generateDataPoint());
				}
				// System.out.println("Size of all datapoints generated:\t" +
				// datapoints.size());
				// System.out.println("Size of the sample list generated:\t" +
				// datapoints.get(0).size());
				// for (int i = 0; i < datapoints.size(); i++) {
				// System.out.println("Size of DataPoint list:\t" +
				// datapoints.get(i).get(0).getListSize());
				// }

				/* START OF ASSIGNMENT */
				// Find the smallest ||x||
				for (int i = 0; i < 1; i++) {
					DataPoint res = datapoints.get(i).get(0);
					for (DataPoint d : datapoints.get(i)) {
						if (d.l_x < res.l_x) {
							res = d;
						}
					}
//					System.out.println((int) Math.pow(2, i) + ", " + df.format(res.y));
					double w = 1.0 - res.y;
					System.out.print(df.format(w) + (z != 9 ? " & " : 0));
				}
			}
			System.out.println(" \\\\");
		}
	}

}