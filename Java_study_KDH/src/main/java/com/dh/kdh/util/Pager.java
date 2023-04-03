package com.dh.kdh.util;

public class Pager {
	
	//멤버 변수
	/*
	 * 파라미터를 담을 변수
	 * jsp에서 꺼내서 사용할 변수
	 * mapper에서 꺼내서 사용할 변수
	 * perPage : 한 페이지에 출력할 글의 갯수
	 * perBlock : 한 페이지에 출력할 번호의 갯수
	 * */
	private Long page;
	private Long startRow;
	private Long lastRow;
	private Long startNum;
	private Long lastNum;
	private Long perPage;
	private Long perBlock;
	
	public Pager() {
		this.perPage = 10L;
		this.perBlock=5L;
	}
	
	//1. mapper에서 사용할 값 계산
	public void getRowNum()throws Exception{
		this.startRow = (this.getPage()-1) * this.getPerPage() +1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	//2.JSP에서 사용할 값 계산
	public void getNum(Long totalCount)throws Exception{
		//2.totalcount로 totalPage 구하기(총 페이지 개수)
		Long totalPage = totalCount % this.getPerPage()==0 ? totalCount/this.getPerPage() : totalCount/this.getPerPage()+1;
		//3.totalPage를 이용해 totalBlock 구하기
		Long totalBlock =  totalPage % this.getPerBlock() == 0 ? totalPage/this.getPerBlock() : totalPage/this.getPerBlock()+1;
		//4. page로 curBlock 찾기
		Long curBlock = this.getPage() % this.getPerBlock()== 0 ? this.getPage()/this.getPerBlock() : this.getPage()/this.getPerBlock()+1;
		//5. curBlock으로 startNum(시작번호),lastNum(끝번호) 구하기
		this.startNum = (curBlock-1)*this.getPerBlock() + 1;
		this.lastNum = curBlock*this.getPerBlock();
	}
	
	public Long getPerPage() {
		if(this.perPage==null) {
			this.perPage=10L;
		}
		return perPage;
	}


	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}


	public Long getPerBlock() {
		return perBlock;
	}


	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}


	public Long getPage() {
		if(this.page==null) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	
	
	
}
