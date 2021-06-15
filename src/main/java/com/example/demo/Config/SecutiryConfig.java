package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecutiryConfig extends WebSecurityConfigurerAdapter {

    private static final String DEFAULT_PASSWORD = new BCryptPasswordEncoder().encode("1234");

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    UserDetailsService userDetailsService ;


    @Autowired
    public SecutiryConfig(@Qualifier("userDetailsServiceImpl")
                                         UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").roles("master").password(DEFAULT_PASSWORD);
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/all/**").permitAll()
                .antMatchers("/master/**").hasRole("master")
                .antMatchers("/nurse/**").hasRole("nurse")
                .antMatchers("/doctor/**").hasRole("doctor")
                .antMatchers("/patient/**").hasRole("patient")
                .and()
                .formLogin()
                .and().logout().permitAll()
                .and().exceptionHandling().accessDeniedPage("/403");
    }
}
