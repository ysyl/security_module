package security.core.DTO;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {

	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities,
			Long userId) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
		this.id = userId;
	}
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
