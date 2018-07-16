package security.core.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import security.core.DTO.UserDetailsImp;
import security.core.mapper.TUserPrincipalMapper;

@Repository
public class UserDetailsDAO {
	
	private TUserPrincipalMapper tUserPrincipalMapper;

	public TUserPrincipalMapper gettUserPrincipalMapper() {
		return tUserPrincipalMapper;
	}

	@Autowired
	public void settUserPrincipalMapper(TUserPrincipalMapper tUserPrincipalMapper) {
		this.tUserPrincipalMapper = tUserPrincipalMapper;
	}

	public UserDetailsImp selectByUsername(String username) {
		// TODO Auto-generated method stub
		return tUserPrincipalMapper.selectUserDetailsByUsername(username);
	}

}
