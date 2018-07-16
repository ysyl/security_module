package security.core.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import security.core.DAO.UserDetailsDAO;
import security.core.DTO.UserDetailsImp;

@Component
public class UserDetailsServiceImp implements UserDetailsService {
	
	private UserDetailsDAO userDetailsDAO;

	public UserDetailsDAO getUserDetailsDAO() {
		return userDetailsDAO;
	}

	@Autowired
	public void setUserDetailsDAO(UserDetailsDAO userDetailsDAO) {
		this.userDetailsDAO = userDetailsDAO;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userDetailsDAO.selectByUsername(username);
	}
	
	public UserDetailsImp getUserPrincipalByUsername(String username) {
		return userDetailsDAO.selectByUsername(username);
	}

}
