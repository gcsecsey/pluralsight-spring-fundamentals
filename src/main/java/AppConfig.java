import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
  @Bean(name = "speakerService")
  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
  public SpeakerService getSpeakerService() {
    SpeakerServiceImpl service = new SpeakerServiceImpl();
    return service;
  }

  @Bean(name = "speakerRepository")
  public SpeakerRepository getSpeakerRepository() {
    return new HibernateSpeakerRepositoryImpl();
  }
}
