public class booking {

    private String namaPenyewa;
    private String namaLapangan;
    private int durasi;
    private double totalHarga;

    public booking(String namaPenyewa, String namaLapangan, int durasi, double totalHarga) {
        this.namaPenyewa = namaPenyewa;
        this.namaLapangan = namaLapangan;
        this.durasi = durasi;
        this.totalHarga = totalHarga;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }
    public String getNamaLapangan() {
        return namaLapangan;
    }
    public int getDurasi() {
        return durasi;
    }
    public double getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanBooking() {
        System.out.println("\n=== DATA BOOKING ===");
        System.out.println("Nama Penyewa  : " + namaPenyewa);
        System.out.println("Nama Lapangan : " + namaLapangan);
        System.out.println("Durasi        : " + durasi + " jam");
        System.out.println("Total Harga   : Rp" + totalHarga);
    }
}