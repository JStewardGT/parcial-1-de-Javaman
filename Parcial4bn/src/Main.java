
public class Main {

    public static void main(String[] args) {
    Mensaje m=new Mensaje();
    m.letras=new char[10];
    m.orden=new int[10];
    
    m.letras[0]='p';
    m.letras[1]='o';
    m.letras[2]='e';
    m.letras[3]='m';
    m.letras[4]='o';
    m.letras[5]='a';
    m.letras[6]='t';
    m.letras[7]='r';
    m.letras[8]='d';
    m.letras[9]='e';
    
    m.orden[0]=0;
    m.orden[1]=9;
    m.orden[2]=8;
    m.orden[3]=7;
    m.orden[4]=1;
    m.orden[5]=6;
    m.orden[6]=2;
    m.orden[7]=5;
    m.orden[8]=3;
    m.orden[9]=4;
    
    Impresora imp=new Impresora(m);
    imp.imprimirMensaje();   
    }
    
}
