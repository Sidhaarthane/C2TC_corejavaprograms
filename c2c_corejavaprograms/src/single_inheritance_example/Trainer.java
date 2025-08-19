package single_inheritance_example;

public class Trainer extends Person{
 public Trainer(int pid, String name, String city) {
		super(pid, name, city);
		// TODO Auto-generated constructor stub
	}
 private int eid;
 @Override
public String toString() {
	return "Trainer [eid=" + eid + ", designation=" + designation + ", location=" + location + "]";
}
 private String designation;
private String location;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
