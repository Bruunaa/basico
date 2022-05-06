package aula2;

public class para {
    public static void main(String[] args) {
        int num = 10;
        int tab = 10;
        
        for(int j=1; j <= tab; j++){
            System.out.println("Tabuada do "+j);
            for(int i=1; i<=num; i++){
                System.out.println( j+ " x "+i+" = "+(j*i));
            }
        }
    }
}


