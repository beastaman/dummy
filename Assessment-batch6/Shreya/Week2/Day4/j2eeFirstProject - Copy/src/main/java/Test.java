import com.dao.UserDao;
import com.to.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user= new User("u1@gmail.com", "password", null);
		UserDao userDao = new UserDao();
		try {
			userDao.getUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
