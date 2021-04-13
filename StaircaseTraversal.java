/*

Write a function that return the number of ways in which you can 
climb the staircase given the total number of steps in the staircase and
maximum number of steps you can climb at a particular time.

*/

import java.util.*;

//O(k*n) time | O(n) space - where n is the height of the staircase and k is the maximum number of allowed steps
class StaircaseTraversal {

  public int staircaseTraversal(int height, int maxSteps) {
    return numberOfWaysToTop(height, maxSteps);
  }
	
	public int numberOfWaysToTop(int height, int maxSteps){
		if(height <= 1){
			return 1;
		}
		
		int numberOfWays = 0;
		for(int step = 1; step < Math.min(maxSteps, height) + 1; step++){
			numberOfWays += numberOfWaysToTop(height - step, maxSteps);
		}
		return numberOfWays;
	}
}
