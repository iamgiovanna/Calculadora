import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[]args){
     Calculadora CalSimples= new Calculadora();
    double a = 0, b = 0, r = 0;
    int opcoes;
    
    do {
        opcoes = Integer.parseInt(JOptionPane.showInputDialog("Menu \n 1 - SOMAR \n 2 - Subtrair \n3 - Multiplicar \n4 Dividir  \n0 - Sair"));
    
    switch(opcoes){
        case 1: 
            CalSimples.somar();
            break;
        case 2: 
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
            
            CalSimples.subtrair(a, b);
            break;
        case 3:
          r = CalSimples.multiplicar();
           JOptionPane.showMessageDialog(null, " Resultado da multiplicação é " +r);
            break;
        case 4:
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
            r = CalSimples.divisao(a, b);
           JOptionPane.showMessageDialog(null, " Resultado da divisão é " +r);
           break;
           
        case 0:
             JOptionPane.showMessageDialog(null, " Finalizando o programa");
             break;
             
        default:
            
             JOptionPane.showMessageDialog(null, " Sair");
            
    }

}while (opcoes != 0);
    }

}
