package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	public static List<Integer> fibonacci() {
		List<Integer> fibonacciList = new ArrayList<>(Arrays.asList(0,1));

		for (int i=1; i<350;){
			i = Integer.sum(fibonacciList.get(fibonacciList.size()-2),
					fibonacciList.get(fibonacciList.size() - 1));

			fibonacciList.add(i);
		}
		return fibonacciList;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}
