import javax.swing.JOptionPane;

/*
 *Calcula o indice de massa corporal
 *IMC = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros)
 */

public class IMC {

    public static void main(String[] args){

/*        
        Double pesoEmQuilograma = 70.00;
        Double alturaEmMetros = 1.80;
        Double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);
*/

        Double pesoEmQuilograma;

        String peso =
            JOptionPane.showInputDialog("Quando é seu Peso?");

        pesoEmQuilograma = Double.parseDouble(peso);

        Double alturaEmMetros;

        String altura =
            JOptionPane.showInputDialog("Qual sua Altura?");

        alturaEmMetros = Double.parseDouble(altura);


        Double imc = pesoEmQuilograma / (alturaEmMetros * alturaEmMetros);



    
        if(imc > 20 && imc <= 25){
            System.out.println("Peso Ideal");
        }else{
            System.out.println("Fora do Peso");
        }


        System.out.println("IMC : " + imc);
        JOptionPane.showMessageDialog(null, imc);

    }

}
