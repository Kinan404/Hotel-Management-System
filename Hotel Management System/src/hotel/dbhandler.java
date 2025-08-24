package hotel;

import MainClasses.Customer;
import java.sql.*;
import java.util.ArrayList;

public class dbhandler {

    private static final String baseUrl = "jdbc:mysql://localhost:3306/hoteldb";
    private static final String host = "root";
    private static final String token = "kinankoni";

    public static Connection getConnection() throws SQLException, Exception {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(baseUrl, host, token);
        } catch (Exception ex) {
            throw ex;
        }
        return con;
    }

    public static ArrayList<Customer> getAllStudents() throws SQLException, Exception {
        Statement st;
        ResultSet res;
        ArrayList<Customer> arr = new ArrayList<>();
        try {
            st = getConnection().createStatement();
            res = st.executeQuery("SELECT * FROM rezervations");

            while (res.next()) {
                arr.add(new Customer(
                        res.getString("Name"),
                        res.getString("IdCard"),
                        res.getString("Roomno"),
                        res.getString("Roomtype"),
                        res.getString("Check_in"),
                        res.getString("Check_out"),
                        res.getString("RezerType")
                ));
            }
        } catch (Exception ex) {
            throw ex;
        }

        return arr;
    }

   
}
