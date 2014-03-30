import javax.swing.JOptionPane;

public class EntradaGrafica {
    
    public static void main(String[] args){

        String nome =
            JOptionPane.showInputDialog("Qual é seu nome");

        JOptionPane.showMessageDialog(null, nome);
    }
}
