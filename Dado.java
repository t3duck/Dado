import java.security.SecureRandom;
public class Dado {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [] volado=new int[7];
        final int Cara1=1;
        final int Cara2=2;
        final int Cara3=3;
        final int Cara4=4;
        final int Cara5=5;
        final int Cara6=6;
        final int LANZAMIENTOS=10000;
        int lanzamiento;
        volado[Cara1]=0;
        volado[Cara2]=1;
        volado[Cara3]=2;
        volado[Cara4]=3;
        volado[Cara5]=4;
        volado[Cara6]=5;

        for (int i=0; i<LANZAMIENTOS; i++){
            lanzamiento=random.nextInt(6)+1;
            volado[lanzamiento]=volado[lanzamiento]+1;
            /*if (lanzamiento==AGUILA){
                volado[AGUILA]+=1;
            }if (lanzamiento==SOL){
                volado[SOL]+=1;
            }*/
        }
        System.out.println("La Cara 1 del dado "+volado[Cara1]+" veces");
        System.out.println("La Cara 2 del dado "+volado[Cara2]+" veces");;
        System.out.println("La Cara 3 del dado "+volado[Cara3]+" veces");
        System.out.println("La Cara 4 del dado "+volado[Cara4]+" veces");;
        System.out.println("La Cara 5 del dado "+volado[Cara5]+" veces");
        System.out.println("La Cara 6 del dado" +volado[Cara6]+" veces");;
    }
}