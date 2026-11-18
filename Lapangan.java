public class Lapangan {

    private String namaLapangan;
    private double harga;
    private String status;

    public Lapangan(String namaLapangan, double harga, String status) {
        this.namaLapangan = namaLapangan;
        this.harga = harga;
        this.status = status;
    }

    public String getNamaLapangan() {
        return namaLapangan;
    }

    public double getHarga() {
        return harga;
    }

    public String getStatus() {
        return status;
    }

    public void tampilkanLapangan() {
        System.out.println("Nama Lapangan : " + namaLapangan);
        System.out.println("Harga         : Rp" + harga + "/jam");
        System.out.println("Status        : " + status);
    }
}