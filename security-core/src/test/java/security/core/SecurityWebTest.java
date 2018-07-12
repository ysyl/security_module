package security.core;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityWebTest extends BaseTest {
	
	private static final Logger logger = Logger.getLogger(SecurityWebTest.class);
	
	@Autowired
	UserDetailsService uds;

	@Test
	public void tests() {
		UserDetails ud = uds.loadUserByUsername("verrickt");
		for (GrantedAuthority au : ud.getAuthorities()) {
			logger.info(au.getAuthority());
		}
	}
}
