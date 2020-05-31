package com.customer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class 'Logindetails' to map with the table 'logindetails' in the database 'customer'.
 * 
 * As you can see, we use the annotation @Entity to map this class to the table logindetails (the class has same name as the table). 
 * All the class field names are also identical to the table's ones. 
 * The field id is annotated with @Id and @GeneratedValue annotations to indicate that this field is primary key 
 * and its value is auto generated. 
 */
@Entity
public class Logindetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String userpassword;

	public Logindetails() {}

	public Logindetails(String username, String userpassword) {
		this.username = username;
		this.userpassword = userpassword;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((userpassword == null) ? 0 : userpassword.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logindetails other = (Logindetails) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (userpassword == null) {
			if (other.userpassword != null)
				return false;
		} else if (!userpassword.equals(other.userpassword))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Logindetails [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", userpassword=");
		builder.append(userpassword);
		builder.append("]");
		return builder.toString();
	}
}