import java.util.Random;

public  class Personagem {

   int nivel;
   int forca;
public String nome;

// voi -> significa que não está retornando 
void mostraStatus() { 
               
  System.out.format("Personagem: %s (lvl %d) com %d de forca.\n", nome, nivel , forca);
}

int calcularDano() {

  Random gerado = new Random();
  int dado20Faces = 1 + gerado.nextInt(19);
  int dano = forca + dado20Faces;
  return dano;
}


void atacar(String alvo,String habilidade) {
    int danoCausado = calcularDano();            
   if(habilidade.length() ==0){  
   System.out.format(" %s atacou %s e causou %d de dano.\n ",
                               nome,alvo,danoCausado);            
   } else { 
   System.out.format("%s usou '%s' contra  %s e causou %d de dano.\n ", 
                              nome,habilidade,alvo,danoCausado);

    }  

  }
}
