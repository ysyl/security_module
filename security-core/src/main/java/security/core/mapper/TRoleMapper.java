package security.core.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import security.core.DTO.Role;
import security.core.entity.TRole;
import security.core.entity.TRoleExample;

public interface TRoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	long countByExample(TRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int deleteByExample(TRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int insert(TRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int insertSelective(TRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	List<TRole> selectByExample(TRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	TRole selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TRole record, @Param("example") TRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int updateByExample(@Param("record") TRole record, @Param("example") TRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int updateByPrimaryKeySelective(TRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_role
	 * @mbg.generated  Wed Jul 18 20:42:00 CST 2018
	 */
	int updateByPrimaryKey(TRole record);
	
	void collectRoleToUserByRoleId(@Param("roleId") int roleId, @Param("userId") long uesrId);
	
	Role selectRoleByRoleName(String roleName);

	void collectRoleToUserByRoleName(@Param("roleName") String roleName,@Param("userId") long userId);
}