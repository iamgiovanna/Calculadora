import javax.swing.JOptionPane;
public class Calculadora {
    private double n1;
    private double n2;
    private double r;
    
    public Calculadora(){
        this(0,0,0); //construtor vazio
    }
    public Calculadora(double n1, double n2, double r){
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    
    public double getN1(){
        return n1;
   }
    
    public double getN2(){
        return n2;
        }
    
    public double getR(){
        return r;
    }
    public void setN1(double n1){
        this.n1 = n1;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }
    public void setR(double r){
        this.r = r;
    }
    
    public void somar(){
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")));
        this.setR(this.getN1() + this.getN2());
        JOptionPane.showMessageDialog(null, " O valor da soma é " + this.getR());
        
    }
    public void subtrair(double ai, double bi){
        this.setN1(ai);
        this.setN2(bi);
        this.setR (this.getN1() - this.getN2());
        JOptionPane.showMessageDialog(null, " O valor da subtração é " + this.getR());
        
    }
    
    public double multiplicar(){
        this.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: ")));
        this.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: ")));
        this.setR (this.getN1() * this.getN2());
        return this.getR();
    }
    
    public double divisao(double ai, double bi){
      this.setN1(ai);
        this.setN2(bi);
        this.setR (this.getN1() / this.getN2());
       return this.getR();
        
    }
}
