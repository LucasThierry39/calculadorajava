package calculadora.app;

public class MinhaCalculadora {

    public static void main(String[] args) {
       FrmCalculadora calculadora = new FrmCalculadora();
       calculadora.setTitle("My Calculator App");
       calculadora.setLocationRelativeTo(calculadora);
       calculadora.setVisible(true);
    }
    
}
