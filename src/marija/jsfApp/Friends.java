package marija.jsfApp;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@SessionScoped
@ManagedBean
public class Friends {

	String email;
	String firstName;
	String middleName;
	String lastName;
	String country;
	String sex;
	List<String> gender;
	String employmentStatus;
	private String[] progLanguages;
	String phone;
	String linkedin;
	String github;
	String highschool;
	String faculty;
	String hscity;
	String facity;
	String date;

	public Friends() {
		// TODO Auto-generated constructor stub
		gender = new ArrayList<>();
		gender.add("--enter gender here--");
		gender.add("male");
		gender.add("female");
	}
	
	public void validateLinkedin(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		if (value == null) {
			return;
		}
		String data = value.toString();
		if (!data.startsWith("rs.linkedin.com/")) {

			FacesMessage message = new FacesMessage(" This content must start with rs.linkedin.com/");
			throw new ValidatorException(message);
		}
		else
			return;
	}
	
	public void validateGithub(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		if (value == null) {
			return;
		}
		String data = value.toString();
		if (!data.startsWith("www.github.com/")) {

			FacesMessage message = new FacesMessage(" This content must start with www.github.com/");
			throw new ValidatorException(message);
		}
		else
			return;
	}

	public String getSex() {
		return sex;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<String> getGender() {
		return gender;
	}

	public void setGender(List<String> gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String userName) {
		this.email = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getProgLanguages() {
		return progLanguages;
	}

	public void setProgLanguages(String[] progLanguages) {
		this.progLanguages = progLanguages;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getHscity() {
		return hscity;
	}

	public void setHscity(String hscity) {
		this.hscity = hscity;
	}

	public String getFacity() {
		return facity;
	}

	public void setFacity(String facity) {
		this.facity = facity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
}
