package be.g00glen00b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class SpringValidationApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringValidationApplication.class, args);
  }

  @Bean(name = "messageSource")
  public ReloadableResourceBundleMessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
    messageBundle.setBasename("classpath:messages/messages");
    messageBundle.setDefaultEncoding("UTF-8");
    return messageBundle;
  }
}
