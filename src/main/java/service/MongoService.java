package service;
import userlist.*;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class MongoService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
 
	public void init() {
		// Drop existing collections
		mongoTemplate.dropCollection("user");
 
		
		User dogus = new User();
		dogus.setId(UUID.randomUUID().toString());
		dogus.setName("Dogus");
		dogus.setSurname("Sezer");
		dogus.setPhoneNo("5369281712");
		
		User ayfer = new User();
		ayfer.setId(UUID.randomUUID().toString());
		ayfer.setName("Ayfer");
		ayfer.setSurname("Sezer");
		ayfer.setPhoneNo("5309281712");
		
		// Insert to db
		mongoTemplate.insert(dogus, "user");
		mongoTemplate.insert(ayfer, "user");

	}

}
