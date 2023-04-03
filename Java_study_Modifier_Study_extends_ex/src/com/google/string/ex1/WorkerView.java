package com.google.string.ex1;

import java.util.Arrays;

public class WorkerView {
	//WorkerDTO들를 받아서 정보를 출력
	public void view(WorkerDTO[] worker) {
		for(WorkerDTO w:worker) {
			System.out.println(w.getName());
			System.out.println(w.getDepartment());
			System.out.println(w.getJob());
			System.out.println(w.getPhone());
		}
	}
}
