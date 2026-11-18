import java.util.Scanner;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Connection connection = DatabaseConnection.getConnection();

        if (connection == null) {
            System.out.println("Koneksi database gagal!");
            return;
        }

        int pilihan;

        do {

            System.out.println("\n========================");
            System.out.println("     RENTAL FUTSAL");
            System.out.println("========================");
            System.out.println("1. Login");
            System.out.println("2. Registrasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {

                User user = User.login(input, connection);

                if (user != null) {

                    System.out.println("\nLogin berhasil!");
                    System.out.println("Selamat datang, " + user.getNama());

                    int menu;

                    do {

                        user.tampilkanMenu();

                        System.out.print("\nPilih menu: ");
                        menu = input.nextInt();
                        input.nextLine();

                        if (user.getRole().equals("Admin")) {

                            if (menu == 1) {
                                Lapangan.lihatLapangan(connection);
                            } else if (menu == 2) {
                                Lapangan.tambahLapangan(input, connection);
                            } else if (menu == 3) {
                                booking.lihatBooking(connection);
                            } else if (menu == 4) {
                                Pembayaran.kelolaPembayaran(input, connection);
                            } else if (menu == 5) {
                                System.out.println("Admin berhasil logout.");
                            }

                        } else {

                            if (menu == 1) {
                                Lapangan.lihatLapangan(connection);
                            } else if (menu == 2) {
                                booking.buatBooking(input, connection, user);
                            } else if (menu == 3) {
                                Pembayaran.pembayaranPenyewa(input, connection, user);
                            } else if (menu == 4) {
                                System.out.println("Penyewa berhasil logout.");
                            }

                        }

                    } while (
                        (user.getRole().equals("Admin") && menu != 5)
                        ||
                        (user.getRole().equals("Penyewa") && menu != 4)
                    );

                }

            } else if (pilihan == 2) {

                User.registrasi(input, connection);

            } else if (pilihan == 3) {

                System.out.println("Terima kasih!");

            } else {

                System.out.println("Pilihan tidak tersedia.");

            }

        } while (pilihan != 3);

        try {
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}