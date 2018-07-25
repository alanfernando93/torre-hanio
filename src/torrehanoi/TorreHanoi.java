/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torrehanoi;

/**
 *
 * @author amh
 */
public class TorreHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TorreHanoi objHanoi = new TorreHanoi();
        objHanoi.torresHanio(3, 1, 2, 3);
    }

    public void torresHanio(int discos, int torre1, int torre2, int torre3) {
        if (discos == 1) {
            System.out.println("Mover Disco de Torre " + torre1 + " a Torre " + torre3);
        } else {
            torresHanio(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover Disco de Torre " + torre1 + " a Torre " + torre3);
            torresHanio(discos - 1, torre2, torre1, torre3);
        }
    }

}
