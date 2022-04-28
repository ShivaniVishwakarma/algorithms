
public class WaysToCoverDistance {

	//Given a distance ‘dist, count total number of ways to cover the distance with 1, 2 and 3 steps.
	
	public static void main(String[] args) {
		
		int distance = 4;
		
		int waysToCoverDistance = waysToCoverDistance(distance);

		System.out.println("No. of ways to cover the distance : " + waysToCoverDistance);
	}

	private static int waysToCoverDistance(int distance) {
		
		if(distance < 0)
		return 0;
		
		if(distance == 0)
			return 1;
		
		return waysToCoverDistance(distance-1) +  //One Step
			   waysToCoverDistance(distance-2) +  //Two Step
			   waysToCoverDistance(distance-3);   //Three Step
	}

}
