package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="Name")
	private String Name;


	@Column(name="course")
	private String course;
	
	@Column(name="country")
	private String country;

	public Student()
	{
		
	}
	
	public Student(String Name, String course, String country) {
		
		this.Name = Name;
		this.course = course;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}


	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", course=" + course
				+ ", country=" + country + "]";
	}
	


	

}
