package security.core.entity;

public class TUserPrincipal {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_principal.id
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_principal.username
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_principal.credential
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_principal.email
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_principal.lock
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	private Boolean lock;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_principal.id
	 * @return  the value of t_user_principal.id
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_principal.id
	 * @param id  the value for t_user_principal.id
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_principal.username
	 * @return  the value of t_user_principal.username
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_principal.username
	 * @param username  the value for t_user_principal.username
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_principal.credential
	 * @return  the value of t_user_principal.credential
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_principal.credential
	 * @param password  the value for t_user_principal.credential
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_principal.email
	 * @return  the value of t_user_principal.email
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_principal.email
	 * @param email  the value for t_user_principal.email
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_principal.lock
	 * @return  the value of t_user_principal.lock
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public Boolean getLock() {
		return lock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_principal.lock
	 * @param lock  the value for t_user_principal.lock
	 * @mbg.generated  Fri Jul 06 14:29:58 CST 2018
	 */
	public void setLock(Boolean lock) {
		this.lock = lock;
	}
}