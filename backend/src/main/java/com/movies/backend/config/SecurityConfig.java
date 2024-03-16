// // package com.movies.backend;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// // import org.springframework.http.HttpMethod;
// // import org.springframework.security.config.Customizer;
// // import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// // import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// // import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// // import org.springframework.security.crypto.password.PasswordEncoder;
// // import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// // import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// // import org.springframework.security.config.http.SessionCreationPolicy;
// // import org.springframework.security.web.SecurityFilterChain;

// // import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//         .authorizeHttpRequests((authz) -> authz
//         .requestMatchers("/movies/**").permitAll()
//         .requestMatchers("/movies/add").permitAll()
//         .requestMatchers("/admin/**").hasRole("ADMIN")
//         .anyRequest().authenticated())
//         .httpBasic(Customizer.withDefaults())
//         .formLogin(Customizer.withDefaults())
//         .logout((logout) -> logout.logoutSuccessUrl("/my/success/endpoint"));

//         return http.build();

    
// }
// }