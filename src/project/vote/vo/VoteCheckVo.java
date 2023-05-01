package project.vote.vo;

public class VoteCheckVo {

	private String vjumin;
	private String vname;
	private String mno;
	private String vtime;
	private String varea;
	private String vconfirm;

	public VoteCheckVo() {

	}

	public VoteCheckVo(String vjumin, String vname, String mno, String vtime, String varea, String vconfirm) {
		this.vjumin = vjumin;
		this.vname = vname;
		this.mno = mno;
		this.vtime = vtime;
		this.varea = varea;
		this.vconfirm = vconfirm;
	}

	public String getVjumin() {
		return vjumin;
	}

	public void setVjumin(String vjumin) {
		this.vjumin = vjumin;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getVtime() {
		return vtime;
	}

	public void setVtime(String vtime) {
		this.vtime = vtime;
	}

	public String getVarea() {
		return varea;
	}

	public void setVarea(String varea) {
		this.varea = varea;
	}

	public String getVconfirm() {

		return vconfirm;
	}

	public void setVconfirm(String vconfirm) {
		this.vconfirm = vconfirm;
	}

}