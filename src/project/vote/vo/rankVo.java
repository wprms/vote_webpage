package project.vote.vo;

public class rankVo {

	private String mno;
	private String mname;
	private String vtotal;

	public rankVo() {

	}

	public rankVo(String mno, String mname, String vtotal) {
		this.mno = mno;
		this.mname = mname;
		this.vtotal = vtotal;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getVtotal() {
		return vtotal;
	}

	public void setVtotal(String vtotal) {
		this.vtotal = vtotal;
	}

}