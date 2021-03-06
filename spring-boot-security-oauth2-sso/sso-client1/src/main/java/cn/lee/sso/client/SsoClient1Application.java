package cn.lee.sso.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author litz-a
 */
@EnableOAuth2Sso
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SsoClient1Application {

  public static void main(String[] args) {
    SpringApplication.run(SsoClient1Application.class, args);
  }

}
