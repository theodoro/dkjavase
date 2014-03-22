import java.util.ArrayList;

public class ArrayListSimples{

    public static void main(String[] args){

    ArrayList<String> lista = new ArrayList<>();

    lista.add("Bruno");
    lista.add("Priscila");

    for (int i = 0; i < lista.length; i++){
        
        System.out.println(lista[i]);
    }

    }

}
