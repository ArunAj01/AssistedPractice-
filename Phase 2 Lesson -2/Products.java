package products;
import java.sql.*;
public class Products {
 public static void main(String[] args) {
 try {
 // Step 1: Set up the database connection
 String url = "jdbc:mysql://localhost/ecommerce";
 String username = "root";
 String password = "root";
 Connection connection = DriverManager.getConnection(url, username,
password);
 // Step 2: Fetch data and count products of similar types
 countSimilarProducts(connection);
 // Close the database connection
 connection.close();
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 private static void countSimilarProducts(Connection connection) throws
 	SQLException {
	 String countQuery = "SELECT product_type, COUNT(*) AS similar_products_count FROM products GROUP BY product_type";
			 Statement statement = connection.createStatement();
	 ResultSet resultSet = statement.executeQuery(countQuery);
	 System.out.println("Product Type | Count");
	 System.out.println("-----------------------");
	 while (resultSet.next()) {
		 String productType = resultSet.getString("product_type");
		 int count = resultSet.getInt("similar_products_count");
 	System.out.println(productType + " | " + count);
	 }
	 resultSet.close();
	 statement.close();
 }
}
