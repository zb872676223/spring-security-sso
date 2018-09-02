package com.gcr.sso.config.encryption;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author litz-a
 */
@Configuration
public class Encoders {

  /**
   * spring 5必须指定一种加密方式,否则会报错:There is no PasswordEncoder mapped for the id “null”
   * @return
   */
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}