package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Amarelo", 0.4f);
        c1.status();
        
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        
        System.out.println("Tenho uma caneta " + c1.getModelo()
        + " " + "de ponta" + c1.getPonta());*/
        
        Caneta c2 = new Caneta("Montblanc", "Dourada", 0.3f);
        c2.status();
    }
}
