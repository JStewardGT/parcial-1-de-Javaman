
public class Impresora {
 private Mensaje mensajito;
 
 public Impresora(Mensaje m){
     for (int paisahp : m.orden) {
         System.out.print(m.letras[paisahp]);
        
     }
    
 }
 
 public void imprimirMensaje(){
     
 }
 
}


