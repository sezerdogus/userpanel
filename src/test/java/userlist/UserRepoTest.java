package userlist;

import java.util.List;

import userlist.User;
import repository.*;
import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRepoTest {
	
	@Autowired
	private UserRepository userRepo;
	
	@Test
	public void testFindByName()
	{
		User user = userRepo.findByName("Dogus");
		
		Assert.assertEquals("Dogus", user.getName());
        Assert.assertEquals("Sezer", user.getSurname());
        Assert.assertEquals("5369281712", user.getphoneNo());
	}
	
	public void testFindActiveUsers()
	{
		long userCount = userRepo.count();
		
		Assert.assertEquals("2", userCount);
	}
	
	@Test
    public void testFindAllOrderedByName()
    {
        User user = new User();
        user.setName("Ayfer");
        user.setSurname("Sezer");
        user.setPhoneNo("5309139005");
        userRepo.save(user);

        List<User> users = userRepo.findAll();
        User newUser = users.get(0);

        Assert.assertEquals("Ayfer", newUser.getName());
        Assert.assertEquals("Sezer", newUser.getSurname());
        Assert.assertEquals("05309139005", newUser.getphoneNo());
        return;
    }
}

