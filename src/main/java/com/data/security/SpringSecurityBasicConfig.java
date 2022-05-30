package com.data.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityBasicConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/students/**").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/students/**").hasAnyRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/students/**").hasAnyRole("USER")
                .antMatchers(HttpMethod.DELETE, "/students/**").hasAnyRole("USER").and().csrf().disable().headers()
                .frameOptions().disable();
/*    .hasAnyRole("USER", "ADMIN"), we can add multiple roles like this in the above commands
    To authenticate all the post requests of student then we should write like this "post/student/**"
    "/post/*" will only authenticate upto the next path after the post. "/post/**" will authenticate every request after the post path.
    */
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user123").password("{noop}password").roles("USER").and()
                .withUser("admin123").password("{noop}password").roles("ADMIN").and().withUser("test123")
                .password("{noop}password").roles("USER").and().withUser("shyam").password("{noop}password")
                .roles("ADMIN");
    }
}