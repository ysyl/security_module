package security.core.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import security.core.DTO.Role;
import security.core.mapper.TRoleMapper;

@Component
public class RoleDAO {
	
	private TRoleMapper tRoleMapper;

	@Autowired
	public RoleDAO(TRoleMapper tRoleMapper) {
		super();
		this.tRoleMapper = tRoleMapper;
	}

	public Role getByRoleName(String roleName) {
		return tRoleMapper.selectRoleByRoleName(roleName);
	}
	
	public void collectRoleToUser(String roleName, long userId) {
		tRoleMapper.collectRoleToUserByRoleName(roleName, userId);
	}
	
}
