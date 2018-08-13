package security.core.service;


import security.core.DTO.UserPrincipal;
import security.core.form.UserPrincipalForm;

public interface SecurityCoreService {

	public long createUserPrincipal(UserPrincipalForm form);
	
	public void modifyPassword(String password);

	public UserPrincipal getUserPrincipalByUsername(String username);
}
