package org.lyk.persistence;

public class PageMaker {

	private int page,startPage,endPage,totalPage,totalCount;
	private boolean prev,next;
	private double pageBlock;
	
	public PageMaker(int page,int totalCount){
		pageBlock = 10.0;
		this.page=page;
		this.totalCount=totalCount;
		
		this.totalPage=(int)Math.ceil(totalCount/pageBlock);
		double temppage=Math.ceil(this.page/pageBlock)*10;
		this.startPage=(int)(temppage-9);
		double realPage = Math.ceil(totalCount/pageBlock);
		if(realPage > temppage){
			this.next = true;
			this.endPage = (int) temppage;
		} else {
			this.endPage = (int) realPage;
		}
		if(startPage != 1) {
			this.prev = true;
		}
		
	}
	
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "PageMaker [page=" + page + ", startPage=" + startPage + ", endPage=" + endPage + ", totalPage="
				+ totalPage + ", totalCount=" + totalCount + ", prev=" + prev + ", next=" + next + "]";
	}
	
}
