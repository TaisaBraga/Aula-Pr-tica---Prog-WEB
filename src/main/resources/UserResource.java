import org.springframework.beans.factory.annotation.Autowired;
import services.UserService;

public class UserResource {
	
	@Autowired 
	private UserService userService;

}
