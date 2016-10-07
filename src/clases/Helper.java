/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class Helper {
    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }
    
    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void limpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }
    
    public static void LetraB(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getColumnCount();
        nc = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i == 0 || i == nf / 2 || i == nf - 1 || j == 0) && j != nc - 1 || j == nc - 1 && i != 0 && i != nf / 2 && i != nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void letraK(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if((i + (j - 1) == (nf - 1) / 2) || (i - (j - 1) == (nf - 1) /2) || j==0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void LetraM(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getColumnCount();
        nc = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i + j == nf - 1 && i <= j) || (i == j && i + j <= nf) || j == 0 || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }

        }
    }
    
    public static void letraW(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || ((i == nc - 1 && (j > nc / 2 || j < nc / 2)))) {
                    tabla2.setValueAt(aux, i, j);
                }
                if (j == nc / 2 && i >= nf / 2 && i != nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void letraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, lq;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        lq = nf/2;
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if(i == 0 && j !=0 && j!=nf-1 || j==0 && i<=nf/2 && i !=0 || (((lq+1)==i && j!=nf-1)) || j==nc-1 && i<=nf/2 && i!=0 || i== j && i>lq){
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void letraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == nc / 2 || (i == nf - 1 && j <= nc / 2) || (j == 0 && i >= nf / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void letraR(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf / 2 || j == 0 || (j == nc - 1 && i <= nf / 2) || (i == j && i >= nf / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void figura1(JTable tabla1, JTable tabla2){
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = i; j < nc-i; j++) {
                tabla2.setValueAt(tabla1.getValueAt(i, j), i, j);   
                tabla2.setValueAt(tabla1.getValueAt(nf-i-1, j), nf-i-1, j);
            }
        }
    }
    
    public static void figura2(JTable tabla1, JTable tabla2){
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int j = 0; j < nc; j++) {
            for (int i = j; i < nf-j; i++) {
                tabla2.setValueAt(tabla1.getValueAt(i, j), i, j); 
                tabla2.setValueAt(tabla1.getValueAt(i, nc-j-1), i, nc-j-1);
            }
        }
    }
    
    public static void figura3(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if(i == nf/2 || j == nc /2 || i == (nf /2 -1) || j==(nc/2-1)){
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void figura4(JTable tabla1, JTable tabla2) {
        int nf, nc, aux, auxdos;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        auxdos = (nc / 2);
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i+auxdos==j || j+auxdos==i || auxdos-i==j || nc-i+auxdos==j+ 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
}
