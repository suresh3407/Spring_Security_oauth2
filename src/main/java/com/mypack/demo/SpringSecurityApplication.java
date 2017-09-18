package com.mypack.demo;

import com.mypack.demo.configuration.CustomUserDetails;
import com.mypack.demo.model.User;
import com.mypack.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}
        @Autowired
        public void AuthenticatedManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception{
            builder.userDetailsService(new UserDetailsService(){
                @Override
                 public UserDetails loadUserByUsername(String s){
                   return new CustomUserDetails((User) repo.findByuserName(s));
                     
                 }
                
                
            }
            );
        }
}
