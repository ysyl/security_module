package security.core.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import security.core.DAO.UserPrincipalDAO;
import security.core.DTO.CustomUser;
import security.core.DTO.UserPrincipal;

@Component
public class UserDetailsServiceImp implements UserDetailsService {
	
	private UserPrincipalDAO userPrincipalDAO;

	@Autowired
	public UserDetailsServiceImp(UserPrincipalDAO userPrincipalDAO) {
		super();
		this.userPrincipalDAO = userPrincipalDAO;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserPrincipal userPrincipal = userPrincipalDAO.selectUserPrincipalByUsername(username);
		UserDetails userDetails = new CustomUser(userPrincipal.getUsername(), userPrincipal.getPassword(), userPrincipal.getAuthorities(), userPrincipal.getId());;
		return userDetails;
	}

}
