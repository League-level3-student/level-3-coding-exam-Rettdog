import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		
		int pope = 0;
		int snow = 0;
		
		for(int i = 0;i<votes.size();i++) {
			if(votes.get(i).equalsIgnoreCase("pope francis")) {
				pope+=1;
			}else if(votes.get(i).equalsIgnoreCase("edward snowden")) {
				snow+=1;
			}
			
			
			
		}
		if(pope>snow) {
			return "pope francis";
		}else if(pope<snow) {
		return "edward snowden";
		}
		return "TIE";
	}

}
