/*

Given an array representing heights of buildings and the direction they are facing, return an array of indices of the building that can see the sunset view.


*/

import java.util.*;

class BuildingWithSunsetViews {

  public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
    ArrayList<Integer> buildingWithSunsetViews=new ArrayList<Integer>();
		
		int startIdx=buildings.length-1;
		int step=-1;
		
		if(direction.equals("WEST")){
			startIdx=0;
			step=1;
		}
		
		int idx=startIdx;
		int runningMaxHeight=0;
		
		while(idx>=0 && idx<buildings.length){
			int buildingHeight=buildings[idx];
			if(buildingHeight>runningMaxHeight){
				buildingWithSunsetViews.add(idx);
			}
			runningMaxHeight=Math.max(runningMaxHeight, buildingHeight);
			idx+=step;
		}
		
		if(direction.equals("EAST")){
			Collections.reverse(buildingWithSunsetViews);
		}
		return buildingWithSunsetViews;
		
  }
}
