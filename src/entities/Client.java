package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name;
	private String instagram;
	private Date dateBirth;
	
	public Client() {
		
	}
	public Client(String name, String instagram, Date dateBirth) {
		this.name = name;
		this.instagram = instagram;
		this.dateBirth = dateBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public Date getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	@Override
	public String toString() {
		return  name + " " + instagram  + " " + sdf.format(dateBirth) ;
	}
	
	
	
}
