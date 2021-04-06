package io.org.addtocart.config.validation;

public class EmailValidation {
	
	private String email;

	public EmailValidation(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 
	 * @param email
	 * @return true if email has "@" and ".com" 
	 * else return false
	 */
	public boolean emailvalidation(String email){
		return email.contains("@")&&email.contains(".com")?true:false;
	}

}
