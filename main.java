import java.sql.Connection;
import java.sql.PreparedStatement;

public class SampleService {

public void addSample(String name, String type) {

try {

Connection con = DBConnection.getConnection();

String query = "INSERT INTO sample(sample_name,sample_type,status) VALUES(?,?,?)";

PreparedStatement ps = con.prepareStatement(query);

ps.setString(1, name);
ps.setString(2, type);
ps.setString(3, "Collected");

ps.executeUpdate();

System.out.println("Sample added successfully");

} catch(Exception e) {
System.out.println(e);
}

}
}
