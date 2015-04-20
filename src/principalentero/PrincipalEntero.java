/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principalentero;

/**
 *
 * @author SOLEDAD
 */
public class PrincipalEntero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VectorNumEnteros V=new VectorNumEnteros();
V.cargaVector();
V.imprimir();
V.verPar();
V.ordenarDecreciente();
V.imprimir();
    }
}
