package hibernate.associations.entity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "city")
	private String city;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	@OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL)
	private Employee2 employee2;

	public Employee2 getEmployee2() {
		return employee2;
	}

	public void setEmployee2(Employee2 employee2) {
		this.employee2 = employee2;
	}

	public Detail() {
	}

	public Detail(String city, String phoneNumber, String email) {
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Detail{" +
				"id=" + id +
				", city='" + city + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
