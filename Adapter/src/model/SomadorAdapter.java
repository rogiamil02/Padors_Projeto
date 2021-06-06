package model;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter {

	private SomadorExistente somador;
    private List<Integer> lista;

    public SomadorAdapter(SomadorExistente somador){
        this.somador = somador;
    }

    public int somaVetor(int[] vetor){
    	this.lista = new ArrayList<Integer>();
    	
        for (int i : vetor) {
            lista.add(i);
        }
        int resultado = somador.somaLista(lista);
        return resultado;
    }
}