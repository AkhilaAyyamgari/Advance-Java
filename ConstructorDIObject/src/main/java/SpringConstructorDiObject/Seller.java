package SpringConstructorDiObject;

public class Seller {
 private String sellername;
 private String address;
public Seller(String sellername, String address) {
	super();
	this.sellername = sellername;
	this.address = address;
}
public String getSellername() {
	return sellername;
}
public String getAddress() {
	return address;
}
 
}
