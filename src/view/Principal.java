package view;
import com.hfoganholi.quicksort.QuickSort;
import com.hfoganholi.mergesort.MergeSort;
import com.hfoganholi.bubblesort.BubbleSort;
import java.util.Arrays;

public class Principal {

	// Método auxiliar para criar um vetor em ordem decrescente
	    public static int[] criarVetorDecrescente(int tamanho) {
	        int[] vetor = new int[tamanho];
	        for (int i = 0; i < tamanho; i++) {
	            vetor[i] = tamanho - 1 - i;
	        }
	        return vetor;
	    }

	    public static void main(String[] args) {
	        int tamanhoVetor = 1500;
	        
	        // --- Testando BubbleSort ---
	        int[] vetorBubble = criarVetorDecrescente(tamanhoVetor);
	        long inicioBubble = System.nanoTime();
	        BubbleSort.ordenar(vetorBubble);
	        long fimBubble = System.nanoTime();
	        long tempoBubble = fimBubble - inicioBubble;
	        double tempoBSegundos = (double) tempoBubble / 1_000_000_000.0;
	        System.out.println("Tempo de ordenação (BubbleSort): " + tempoBSegundos + " s");

	        // --- Testando MergeSort ---
	        int[] vetorMerge = criarVetorDecrescente(tamanhoVetor);
	        long inicioMerge = System.nanoTime();
	        MergeSort.ordenar(vetorMerge);
	        long fimMerge = System.nanoTime();
	        long tempoMerge = fimMerge - inicioMerge;
	        double tempoMSegundos = (double) tempoMerge / 1_000_000_000.0;
	        System.out.println("Tempo de ordenação (MergeSort): " + tempoMSegundos + " s");

	        // --- Testando QuickSort ---
	        int[] vetorQuick = criarVetorDecrescente(tamanhoVetor);
	        long inicioQuick = System.nanoTime();
	        QuickSort.ordenar(vetorQuick);
	        long fimQuick = System.nanoTime();
	        long tempoQuick = fimQuick - inicioQuick;
	        double tempoQSegundos = (double) tempoQuick / 1_000_000_000.0;
	        System.out.println("Tempo de ordenação (QuickSort): " + tempoQSegundos + " s");
	    }
	}
