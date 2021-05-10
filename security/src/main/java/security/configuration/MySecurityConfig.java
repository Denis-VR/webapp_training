package security.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder userBuilder = User.withDefaultPasswordEncoder();

		//сравниваем введенный пользователем User и Password с этим:
		auth.inMemoryAuthentication()
				.withUser(userBuilder.username("Pasha").password("pasha").roles(Roles.EMPLOYEE.name()))
				.withUser(userBuilder.username("Gena").password("gena").roles(Roles.MANAGER.name()))
				.withUser(userBuilder.username("Pasha").password("pasha").roles(Roles.HR.name(), Roles.MANAGER.name()));
	}
}
