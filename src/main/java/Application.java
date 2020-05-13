import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceIml;

public class Application {
  public static void main(String args[]) {
    SpeakerService service = new SpeakerServiceIml();

    System.out.println(service.findAll().get(0).getFirstName());
  }
}
