public class HelloWorld {
    public static void main (String [] args){
        System.out.println("HELLO WORLD");
        System.out.println("BONJOUR LE MONDE");
        Rectangle Rec;
        Rec= new Rectangle("LudoRect",12.5,8);
        Rec.afficheR();
        System.out.println("Il a pour perimetre : "+Rec.perimetre()+ " et pour surface : "+Rec.surface());
        Triangle t= new Triangle ("TriangleLudo",10.5,89,10.5);
        t.afficheT();
        t.isocele();
        t.equilateral();
    }
}
