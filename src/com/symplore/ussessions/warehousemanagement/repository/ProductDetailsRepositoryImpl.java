package com.symplore.ussessions.warehousemanagement.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.symplore.ussessions.warehousemanagement.entity.ProductDetails;

public class ProductDetailsRepositoryImpl implements ProductDetailsRepository {

	// Driver-> translator
	// Query ->question
	// ResultSet ->response

	// blocks {}
	// inside methods;

	private Connection connectToDB() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// db url
			// username
			// password
			String url = "jdbc:mysql://localhost:3306/java_sessions_us_batch_db";
			String userName = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, userName, password);
			return connection;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public void addProduct(ProductDetails product) {
		// TODO Auto-generated method stub

		// get connection
		// write a query
		// get the response

		try {
			Connection con = connectToDB();
			String query = "insert into product_details (p_name,man_date,exp_date,category) values (?,?,?,?);";
			PreparedStatement st = con.prepareStatement(query);

			// insert into table_name (col1,col2,col3) values ();
			st.setString(1, product.getProdName());
			st.setString(2, product.getManDate().toString());
			st.setString(3, product.getExpDate().toString());
			st.setString(4, product.getCategory());

			System.out.println("query :" + query);
			int noOfRowsEffected = st.executeUpdate();
			if (noOfRowsEffected > 0) {
				System.out.println("product inserted successfully");
			}

		} catch (SQLException e) {
			System.out.println("exception occured while adding the product");
			e.printStackTrace();
		}

	}

	@Override
	public List<ProductDetails> viewProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(Integer productId, Integer quantity) {
		// TODO Auto-generated method stub

	}

}
