package security.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations= {"classpath:applicationContext.xml"})
public class BaseTest {
	
	private static final Logger logger = Logger.getLogger(BaseTest.class.getName());
	
	@Autowired
	UserDetailsService uds;

	@Test
	public void test() {
		UserDetails ud = uds.loadUserByUsername("verrickt");
		logger.info(ud.getPassword());
	}
	
}
