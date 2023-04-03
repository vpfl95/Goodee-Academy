package com.google.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		WorkerDTO [] workerDTO;
		workerDTO = ws.init();
		wv.view(workerDTO);
		
		int num=10;
		String str = String.valueOf(num);
		
	}

}
