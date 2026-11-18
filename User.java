public class User {

    private String nama;
    private String username;
    private String password;
    private String role;

    public User(String nama, String username, String password, String role) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void tampilkanMenu() {

        if (role.equals("Admin")) {

            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Lihat Lapangan");
            System.out.println("2. Tambah Lapangan");
            System.out.println("3. Lihat Booking");
            System.out.println("4. Lihat Pembayaran");
            System.out.println("5. Logout");

        } else {

            System.out.println("\n=== MENU PENYEWA ===");
            System.out.println("1. Lihat Lapangan");
            System.out.println("2. Booking Lapangan");
            System.out.println("3. Lihat Pembayaran");
            System.out.println("4. Logout");

        }
    }
}