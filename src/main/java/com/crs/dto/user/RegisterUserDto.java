package com.crs.dto.user;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class RegisterUserDto {
	//@NotBlank(message = "first name can't be blank")
	private String firstName;

	//@NotBlank(message = "last name can't be blank")
	private String lastName;

	//@Email
	private String email;
	
	//@NotNull
	//@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})",message = "invalid password format!!!!")
	private String password;

	//@Pattern(regexp = "^[0-9]{10}$" ,message = "invalid password format!!!!")
	private String mobile;


	private Character gender;


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	
}
