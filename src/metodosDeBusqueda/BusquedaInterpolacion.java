/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosDeBusqueda;

/**
 *
 * @author Luis Coreas
 */
public class BusquedaInterpolacion {
    public static int busquedaPorInterpolacion(int[] vector, int ElementoABuscar) 
    {
    int IndiceDeComienzo = 0;
    int UltimoIndice = (vector.length - 1);
    while ((IndiceDeComienzo <= UltimoIndice) && (ElementoABuscar >= vector[IndiceDeComienzo]) &&
           (ElementoABuscar <= vector[UltimoIndice])) 
    {
        // usando fórmulas de interpolación para encontrar la mejor posición probable para que exista este elemento
        int posicion = IndiceDeComienzo + (((UltimoIndice-IndiceDeComienzo) /
          (vector[UltimoIndice]-vector[IndiceDeComienzo]))*
                        (ElementoABuscar - vector[IndiceDeComienzo]));
        if (vector[posicion] == ElementoABuscar)
            return posicion;
        if (vector[posicion] < ElementoABuscar)
            IndiceDeComienzo = posicion + 1;
        else
            UltimoIndice = posicion - 1;
    }
    return -1;
}
}
