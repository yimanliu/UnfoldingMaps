package guimodule;

public class findAirportCode {
	
	public String findairport(String toFind, Airport[] airports) {
		/*String myairport = "no result found";
		for (int i = 0; i < airports.length; i++) {
			if (airports[i].getCity().equals(toFind) ) {
				myairport = airports[i].getCode();
			}
		}
		return myairport;*/
		
		int low = 0;
		int high = airports.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			int compare = toFind.compareTo(airports[mid].getCity());
			if (compare < 0) {
				high = mid - 1;
			}
			else if (compare > 0){
				low = mid + 1;
			}
			else {
				return airports[mid].getCode();
			}
		}
		return null;
	}
}



























