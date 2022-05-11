package aula9;

public class Wrapper {

    

    //#region Primitivos
    short num1 = 1;
    byte num2 = 10;
    int num3 = 100;
    long num4 = 10000009;
    float num5 = 3.5f;
    double num6 = 3.555555;
    boolean flag = true;
    char a = 'a'; //char aspa simples, string java dupla
    //#endregion

    //#region classe Wrapper
    //Quando vc declara com letra maíuscula classe Wrapper
    Short num7 = 1; 
    Byte num8 = Byte.valueOf(num2); // vai pegar o valor de num2 e vai guardar
    Integer num9 = Integer.parseInt("235");  // vai transformar a string em number e guardar no num9
    Long num10 = Long.valueOf(num4); 
    
    Boolean flag2 = Boolean.parseBoolean("true");  //tudo que vc colocar é false, menor o true
    Character b = Character.valueOf(a); // resigna os caracteres 
    Double num11 = Double.parseDouble("8.4"); // vai converter para um Dooble

    //#endregion
}

