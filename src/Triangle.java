public class Triangle {
    String nomTri;
    double cote1, cote2, cote3;
    public Triangle(String nomTri, double cote1, double cote2, double cote3){
        this.nomTri=nomTri;
        this.cote1=cote1;
        this.cote2=cote2;
        this.cote3=cote3;
    }
    public void afficheT(){
        System.out.println("Le triangle se nomme "+nomTri+" avec pour dimensions cote 1: "+cote1+", cote 2: "+cote2+" et cote 3: "+cote3);
    }
    public void equilateral(){
        if ((cote1 == cote2) && (cote2 == cote3))
            System.out.println("Triangle Equilateral");
        else System.out.println("Triangle non equilateral");
    }
    public void isocele(){
        if ((cote1 == cote2) || (cote1==cote3) || (cote2==cote3))
            System.out.println("Triangle isocele");
        else System.out.println("Triangle non isocele");
    }
}
