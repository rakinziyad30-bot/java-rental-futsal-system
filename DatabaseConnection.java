import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/rental_futsal";
        String username = "rentaluser";
        String password = "rental123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                url, username, password
            );

            System.out.println("Koneksi database berhasil!");

            return connection;

        } catch (Exception e) {

            System.out.println("Koneksi database gagal!");
            System.out.println(e.getMessage());

            return null;
        }
    }
}