package security.core.entity;

public class TRole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.id
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_role.role_name
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	private String roleName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.id
	 * @return  the value of t_role.id
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.id
	 * @param id  the value for t_role.id
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_role.role_name
	 * @return  the value of t_role.role_name
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_role.role_name
	 * @param roleName  the value for t_role.role_name
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}