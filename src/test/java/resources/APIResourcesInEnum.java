package resources;

// enum is special class in java which has collection of constant and methods 
public enum APIResourcesInEnum {
	
	
	
	addPlaceAPI("maps/api/place/add/json"),
	getPlaceAPI(""),
	deletePlaceAPI("");
	
	
	private String resources;

	private APIResourcesInEnum(String resources1) {
		
		this.resources=resources1;
		
	}
	
	
	public String getResources() {
		
		return resources;
	}

}

