/*

ClassPhoto Greedy Question

*/

import java.util.*;

class ClassPhoto {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    Collections.sort(redShirtHeights, Collections.reverseOrder());
		Collections.sort(blueShirtHeights, Collections.reverseOrder());
		
		String shirtColorInFirstRow=(redShirtHeights.get(0)<blueShirtHeights.get(0))?"RED":"BLUE";
		for(int idx=0; idx<redShirtHeights.size(); idx++){
			int redShirtHeight=redShirtHeights.get(idx);
			int blueShirtHeight=blueShirtHeights.get(idx);
			
			if(shirtColorInFirstRow=="RED"){
				if(redShirtHeight>=blueShirtHeight){
					return false;
				}
				} else{
					if(blueShirtHeight>=redShirtHeight){
						return false;
					}
			}
			}
		return true;
		}
  }

