package guimodule;

public class Airport {
		private String city;
		private String code;
		
		public Airport(String mycity, String mycode) {
			city = mycity;
			code = mycode;
		}
		
		public String getCity() {
			return city;
		}
		public String getCode() {
			return code;
		}
	}
