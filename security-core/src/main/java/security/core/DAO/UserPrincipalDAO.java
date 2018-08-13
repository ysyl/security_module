package security.core.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import security.core.DTO.UserPrincipal;
import security.core.constant.SecurityCoreConstant;
import security.core.entity.TRole;
import security.core.entity.TUserPrincipal;
import security.core.form.UserPrincipalForm;
import security.core.mapper.TRoleMapper;
import security.core.mapper.TUserPrincipalMapper;

@Repository
public class UserPrincipalDAO {
	
	private TUserPrincipalMapper tUserPrincipalMapper;
	
	private RoleDAO roleDAO;

	@Autowired
	public UserPrincipalDAO(TUserPrincipalMapper tUserPrincipalMapper, RoleDAO roleDAO) {
		super();
		this.tUserPrincipalMapper = tUserPrincipalMapper;
		this.roleDAO = roleDAO;
	}

	public UserPrincipal selectUserPrincipalByUsername(String username) {
		// TODO Auto-generated method stub
		return tUserPrincipalMapper.selectUserPrincipalByUsername(username);
	}
	
	public long createUserPrincipal(UserPrincipalForm form) {
		TUserPrincipal entity = new TUserPrincipal();
		entity.setEmail(form.getEmail());
		entity.setLock(false);
		entity.setUsername(form.getUsername());
		entity.setPassword(form.getPassword());
		
		tUserPrincipalMapper.insertSelective(entity);
		long uid = entity.getId();
		roleDAO.collectRoleToUser(SecurityCoreConstant.ROLE_USER, uid);
		
		return uid;
	}
}
