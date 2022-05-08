public class App {
        public static void main(String[] args) throws Exception {
       

        Personagem horoi = new Personagem ();
        horoi.nome = "Onne";
        horoi.nivel = 2;
        horoi.forca = 16;

        horoi.mostraStatus();
        horoi.atacar("Hidra","golpe Duplo");

        
        
       

    }
}
