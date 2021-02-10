package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FuvarProgram {

    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList<Fuvar> fuvarLista = new ArrayList<>();
        //3. feladat
        int sorokHossz = sorok.size();
        for (int i = 1; i < sorokHossz; i++) {
            String sor = sorok.get(i);
            fuvarLista.add(new Fuvar(sor));
        }

        System.out.println("3. feladat: " + fuvarLista.size() + " fuvar");

        //4. feladat
        int db = 0;
        double bev = 0;
        int fuvarListaHossz = fuvarLista.size();
        for (int i = 0; i < fuvarListaHossz; i++) {
            if (fuvarLista.get(i).getId() == 6185) {
                db++;
                bev += fuvarLista.get(i).getVdij();
                bev += fuvarLista.get(i).getBorr();
            }
        }
        System.out.printf("4. feladat: %d fuvar alatt: %.2f$\n", db, bev);

        //5. feladat
//        HashMap<String, Integer> fizModok = new HashMap<>();
////        String ertek = fizModok.values();
////        int kulcs = fizModok.keySet();
//        for (Fuvar fuvar : fuvarLista) {
//            if(fizModok.containsKey(fuvar.getFizMod())){
//                fizModok.values(fuvar.getFizMod()++);
//            }else{
//                fizModok.get(fuvar.getFizMod());
//            }
//            
//        }
//        System.out.println("5. feladat: ");


        double tav = 0.0;
        for (Fuvar fuvar : fuvarLista) {
            tav += fuvar.getTavolsag()*1.6;
        }
        System.out.printf("6. feladat: %.2f km\n" , tav );
    }
}
