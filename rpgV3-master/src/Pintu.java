import java.util.ArrayList;
//belum menggunakan inheritance, idealnya turunan dari Item

public class Pintu extends Item{

    private ArrayList<String> arrAksi = new ArrayList<>();
    private GameInfo objGameInfo;

    //base class dari Item
    public Pintu(String nama, String desc) {
        super(nama);
        //init pilihan
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");
    }


        public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka pintu. TERKUNCI!");
            }
        }
    }

    @Override
    public void setObjGameInfo(GameInfo objGameInfo) {
        super.setObjGameInfo(objGameInfo);
    }

    @Override
    public void setDeskripsi(String deskripsi) {
        super.setDeskripsi(deskripsi);
    }

    public ArrayList<String> getAksi() {
        return arrAksi;
    }

}
