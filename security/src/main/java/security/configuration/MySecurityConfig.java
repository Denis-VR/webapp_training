package security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);

//		UserBuilder userBuilder = User.withDefaultPasswordEncoder();
		//сравниваем введенный пользователем User и Password с этим:
//		auth.inMemoryAuthentication()
//				.withUser(userBuilder.username("pasha").password("pasha").roles("EMPLOYEE"))
//				.withUser(userBuilder.username("gena").password("gena").roles("HR"))
//				.withUser(userBuilder.username("elena").password("elena").roles("HR", "MANAGER"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//** - означает, что человек имеет доступ на любой адрес, начианающийся с /manager_info/
		http.authorizeRequests()
				.antMatchers("/").hasAnyRole("EMPLOYEE", "HR", "MANAGER")
				.antMatchers("/hr_info").hasRole("HR")
				.antMatchers("/manager_info/**").hasRole("MANAGER")
				.and().formLogin().permitAll(); //логин будет заправшиваться у всех
	}
}
