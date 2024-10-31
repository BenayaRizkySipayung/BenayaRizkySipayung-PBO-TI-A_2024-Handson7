package abstraksiv2;

public class Printer implements Cetakk {
    @Override
    public void print() {
        System.out.println("Mencetak Dokumen....");
    }

    @Override
    public void scan() {
        System.out.println("Memindai dokumen....");
    }
}
