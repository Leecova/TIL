package Chapter5;

public class Exercise05 {
	public static void main(String[] args) {
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		//int count = 0;
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) { //for( j<array[i]인데 i를 안넣고 헤맴
				sum	= sum + array[i][j];
				//count++;
			}	
		}
		avg = (double)sum / 10;
		//avg = (double)sum / count;
		// 또 앞에 double 붙여주는거 깜빡함
		// 배열이 바뀌면 10이 아니게 되므로 count를 쓰는게 좋다.
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
