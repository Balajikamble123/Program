package com.scp.java.hibernate.HibernateInheritance;
//jgjch
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="mobile_info")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE )
//@Inheritance(strategy=InheritanceType.JOINED )
public class Mobile {
	@Id
	private int imei;
	private String model;
	private  double price;
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Mobile(int imei, String model, double price) {
		super();
		this.imei = imei;
		this.model = model;
		this.price = price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " \n Mobile [imei=" + imei + ", model=" + model + ", price=" + price + "]";
	}
	

}
@Entity
//@Table(name="android_info")
class Android extends Mobile
{
	private String playStore;

	public String getPlayStore() {
		return playStore;
	}

	public void setPlayStore(String playStore) {
		this.playStore = playStore;
	}

	@Override
	public String toString() {
		return "Android [playStore=" + playStore + "]";
	}

	

	public Android(int imei, String model, double price, String playStore) {
		super(imei, model, price);
		this.playStore = playStore;
	}

	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
@Entity
//@Table(name="Iphone_info")
class Iphone extends Mobile
{
	private String appleStore;

	public String getAppleStore() {
		return appleStore;
	}

	public void setAppleStore(String appleStore) {
		this.appleStore = appleStore;
	}

	@Override
	public String toString() {
		return "Iphone [appleStore=" + appleStore + "]";
	}

	

	public Iphone(int imei, String model, double price, String appleStore) {
		super(imei, model, price);
		this.appleStore = appleStore;
	}

	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
