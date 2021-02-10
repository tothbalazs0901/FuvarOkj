package fuvar;

class Fuvar {
    private int id;
    private String indulas;
    private int ido;
    private double tavolsag, vdij, borr;
    private String fizMod;

    public Fuvar(String sor) {
        String[] s = sor.split(";");
        this.id = Integer.parseInt(s[0]);
        this.indulas = s[1];
        this.ido = Integer.parseInt(s[2]);
        this.tavolsag = Double.parseDouble(s[3]);
        this.vdij = Double.parseDouble(s[4]);
        this.borr = Double.parseDouble(s[5]);
        this.fizMod = s[6];
    }
    
    
}
