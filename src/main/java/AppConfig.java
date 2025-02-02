import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

  @Bean(name = "calendarFactory")
  public CalendarFactory calendarFactory() {
    CalendarFactory factory = new CalendarFactory();
    factory.addDays(2);
    return factory;
  }

  @Bean(name = "calendar")
  public Calendar calendar() throws Exception {
    return calendarFactory().getObject();
  }
}
