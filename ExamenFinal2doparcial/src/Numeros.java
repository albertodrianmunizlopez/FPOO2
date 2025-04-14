import javax.swing.*;

public class Numeros {


    public Numeros(String numero, String numRomano) {
        this.numero = numero;
        this.numRomano = numRomano;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumRomano() {
        return numRomano;
    }

    public void setNumRomano(String numRomano) {
        this.numRomano = numRomano;
    }

    private String numero;
    private String numRomano ;


    public Numeros(String[] hola) {
        this.hola = hola;
    }

    String[] hola = {"I","V","X","L"};



    public void Numer(){


        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
        String numRomano = JOptionPane.showInputDialog("Ingrese su numero romano ");

        JOptionPane.showMessageDialog(null,"El resultado es "+num +numRomano);
    }

    public void convertirRomano(){



        int op[] = {1,5,10,50};

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero"));
        String numRomano = JOptionPane.showInputDialog("Ingrese su numero romano ");


        if( num <=51 || num >=1 ) {



            JOptionPane.showMessageDialog(null, "El resultado es " + num + numRomano);
        }
            if(num <= 0 ) {
                JOptionPane.showMessageDialog(null,"No esta permitido ese numero");
            }


    }


}
