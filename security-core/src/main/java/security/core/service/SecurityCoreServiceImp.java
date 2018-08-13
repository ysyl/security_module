package security.core.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.core.DAO.UserPrincipalDAO;
import security.core.DTO.UserPrincipal;
import security.core.form.UserPrincipalForm;

@Service
public class SecurityCoreServiceImp implements SecurityCoreService {
	
	@Autowired
	public SecurityCoreServiceImp(UserPrincipalDAO userPrincipalDAO) {
		super();
		this.userPrincipalDAO = userPrincipalDAO;
	}

	private UserPrincipalDAO userPrincipalDAO;

	@Override
	public long createUserPrincipal(UserPrincipalForm form) {
		// TODO Auto-generated method stub
		return userPrincipalDAO.createUserPrincipal(form);
	}

	@Override
	public void modifyPassword(String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserPrincipal getUserPrincipalByUsername(String username) {
		// TODO Auto-generated method stub
		return userPrincipalDAO.selectUserPrincipalByUsername(username);
	}

}
