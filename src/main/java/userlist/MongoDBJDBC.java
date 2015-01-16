package userlist;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.Arrays;

public class MongoDBJDBC{
	/*
   public static void main( String args[] ){
      try{   
	 // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
         // Now connect to your databases
         DB db = mongoClient.getDB( "test" );
	 System.out.println("Connect to database successfully");
         DBCollection coll = db.createCollection("people", null);
         System.out.println("Collection created successfully");
         DBCollection collected = db.getCollection("people");
         if (collected != null){
        	 System.out.println("collection got");
         }
      }catch(Exception e){
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	  }
   }*/
}