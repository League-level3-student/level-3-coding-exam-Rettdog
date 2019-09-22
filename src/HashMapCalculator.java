import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int numMatched = 0;
		
		Set<String> keySet = hashmap1.keySet();
		
		Object[] keySet1 = keySet.toArray();
		System.out.println(keySet1.toString());
		keySet = hashmap2.keySet();
		Object[] keySet2 = keySet.toArray();
		
		ArrayList<String> matchedKey = new ArrayList<String>();
		
		for(int i = 0;i<keySet1.length;i++) {
			for(int j = 0;j<keySet2.length;j++) {
				if(keySet1[i].equals(keySet2[j])) {
					matchedKey.add((String) keySet1[i]);
				}
			}
		}
		
		for(int i = 0;i<matchedKey.size();i++) {
			if(hashmap1.get(matchedKey.get(i)).equals(hashmap2.get(matchedKey.get(i)))){
				numMatched++;
			}
		}
		
		
		
		
		
		
		
		return numMatched;
	}

}
