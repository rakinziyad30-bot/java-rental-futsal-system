public class payment {

    private String namaPenyewa;
    private double jumlahPayment;
    private String metodePayment;
    private String status;

    public payment(String namaPenyewa, double jumlahPayment,
                   String metodePayment, String status) {   

        this.namaPenyewa = namaPenyewa;
        this.jumlahPayment = jumlahPayment;
        this.metodePayment = metodePayment;
        this.status = status;
    }

    public void tampilkanPayment() {
        System.out.println("\n=== DATA PEMBAYARAN ===");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Jumlah Bayar : Rp" + jumlahPayment);
        System.out.println("Metode       : " + metodePayment);
        System.out.println("Status       : " + status);
    }
}