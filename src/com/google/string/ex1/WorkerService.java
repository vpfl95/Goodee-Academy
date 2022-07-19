package com.google.string.ex1;

public class WorkerService {

	//private String info;
	private StringBuffer sb;
	
	public WorkerService() {
		sb=new StringBuffer();
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT-대리-0102222");
		sb.append(", choa-영업-부장-0103333");
		sb.append(", hani-마케팅-사원-0104444");
	}
	
	public WorkerDTO [] init() {
		//info 파싱해서 WorkerDTO에 대입하고
		//WorkerDTO를 모은 배열을 리턴
		
		String [] people= sb.toString().split(",");
		String [] person;
		WorkerDTO[] workers = new WorkerDTO[people.length];
		for(int i=0; i<people.length;i++) {
			WorkerDTO worker = new WorkerDTO();
			person = people[i].split("-");
			worker.setName(person[0]);
			worker.setDepartment(person[1]);
			worker.setJob(person[2]);
			worker.setPhone(person[3]);
			workers[i] = worker;
		}
		return workers;
	} 
}
