package OOP1;

public class Car {

private int doors; 
private int wheels;
private String model;
private  String engine;
private String colour;
// create a method that is attached to all objects that you create for that particular class

public void setModel(String model) {
	String validationModel = model;
	if(validationModel.equals("carrera") || validationModel.equals("Common")) {
	this.model = model;
}else {
	this.model ="Unknown";
}
}
public String getModel() {
	return this.model;
}
	}

 
 