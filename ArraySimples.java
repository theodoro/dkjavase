import java.util.Arrays;

public class ArraySimples{

    public static void main(String[] args){
        
        //Criando um array
        
        String[] paises = {"Brasil", "Argentina", "Paragua"};
            
        /*
         * Lista os Valores do Array
         */
            for(int i = 0; i < paises.length; i++){
            System.out.println(paises[i]);
        }

        System.out.println("---Apresentando de Maneira Diferente---");

        System.out.println(Arrays.toString(paises));
    }

}

