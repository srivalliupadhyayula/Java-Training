
import java.util.Map;
import java.util.TreeMap;

public class Q33_Circus_Height_weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] HW = {{65, 100},{70, 150},{56, 90},{75, 190},{60, 95},{68, 110}};
//		int[][] HW = {{10, 100},{20, 120},{15, 121},{25, 122},{30, 130},{35, 128},{40,140}};
		//int[][] HW = {{10, 100},{20, 120},{15, 121},{25, 122},{30, 130},{35, 128},{40,140}};
		
		Map<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
		
		
		for (int i = 0 ; i < HW.length ; i++) {
			tMap.put(HW[i][0], HW[i][1]);
		}
		
		System.out.println(tMap);
		System.out.println(tMap.values());
		
		int seqCount = 0;
		int prevVal = 0;
		
		for (Integer val : tMap.values()) {
			if (prevVal <= val) {
				seqCount++;
			}
			prevVal = val;
		}
			
		
		System.out.println(seqCount);
		
		
	}

}
