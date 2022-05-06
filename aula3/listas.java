package aula3;

import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ScrollPaneConstants;

public class listas {
    public static void main(String[] args) {
        // ArrayList<Integer> lista0 = new ArrayList<>();

        List lista1 = new ArrayList<Integer>();

        // var lista2 = new ArrayList<Integer>();
        // System.out.println(lista0.getClass());
        // System.out.println(lista1.getClass());
        // System.out.println(lista2.getClass());

        lista1.add("arroz");
        lista1.add("bolacha");
        lista1.add("margarina");
        lista1.add("leite");
        lista1.add("massas");

        System.out.println("--------[Lista sem alterações]---");
        System.out.println(lista1);
        System.out.println("--------[Lista com alteração]----");
        lista1.set(2, "manteiga");
        System.out.println(lista1);
        System.out.println("----------[Lista com Remoção]----");
        lista1.remove(2);
        System.out.println(lista1);
    }
}
