public class Rectangle {
    String nomR;
    double longueur,largeur;
    public Rectangle(String nomR,double longueur,double largeur){
        this.nomR=nomR;
        this.longueur=longueur;
        this.largeur=largeur;
    }
    public double perimetre(){
        return 2*(longueur+largeur);
    }
    public double surface(){
        return longueur*largeur;
    }
    public void afficheR(){
        System.out.println("Le Rectangle se nomme "+nomR+ " avec pour longeur: "+longueur+" et largeur:"+largeur);
    }
}
