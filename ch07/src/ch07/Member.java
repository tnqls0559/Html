package ch07;

public class Member {
	  private String id;
	  private String password;
	  private String name;
	  private String tel;
	  private String email;
	  private String dob;
	  private String url;
	  private String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", tel=" + tel + ", email=" + email
				+ ", dob=" + dob + ", url=" + url + ", gender=" + gender + "]";
	}
	public Member(String id, String password, String name, String tel, String email, String dob, String url,
			String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.dob = dob;
		this.url = url;
		this.gender = gender;
	}
	  
	  
}
