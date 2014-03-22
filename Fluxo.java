import javax.swing.JOptionPane;

public class Fluxo{
    
    public static void main(String[] args){
 
        //Recebe um idade em forma de String
        String idade =
            JOptionPane.showInputDialog("Informe sua Idade");

        //Converte a String em um inteiro
        int  anos = Integer.parseInt(idade);

        //Faz a comparação e apresenta uma janela com a mensagem
        if (anos < 18){
            JOptionPane.showMessageDialog(null, "Criança");
        }else{
            JOptionPane.showMessageDialog(null, "Adulto");
        }
    }

}
