package demo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Dima {
	@Id
	@GeneratedValue
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDatanumber() {
		return datanumber;
	}
	public void setDatanumber(int datanumber) {
		this.datanumber = datanumber;
	}
	private String name;
	private int datanumber;
	
	@Override
	public String toString() {
		return "Dima [id=" + id + ", name=" + name + ", datanumber=" + datanumber + "]";
	}

}
