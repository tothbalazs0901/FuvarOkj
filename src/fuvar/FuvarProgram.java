package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FuvarProgram {

    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList<Fuvar> fuvarLista = new ArrayList<>();
        int hossz = sorok.size();
        for (int i = 1; i < hossz; i++) {
            String sor = sorok.get(i);
            fuvarLista.add(new Fuvar(sor));
        }
        
        System.out.println("3. feladat: " + fuvarLista.size() + " fuvar");
        
    }
}
