package project.vote.vo;

public class VoteVo {

	private String vname;
	private String vjumin;
	private String vbirth;
	private String vage;
	private String vgender;
	private String mno;
	private String vtime;
	private String varea;
	private String vconfirm;

	public VoteVo() {

	}

	public VoteVo(String vname, String vjumin, String vbirth, String vage, String vgender, String mno, String vtime,
			String varea, String vconfirm) {
		this.vname = vname;
		this.vjumin = vjumin;
		this.vbirth = vbirth;
		this.vage = vage;
		this.vgender = vgender;
		this.mno = mno;
		this.vtime = vtime;
		this.varea = varea;
		this.vconfirm = vconfirm;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVjumin() {
		return vjumin;
	}

	public void setVjumin(String vjumin) {
		this.vjumin = vjumin;
	}

	public String getVbirth() {
		return vbirth;
	}

	public void setVbitrth(String vbirth) {
		this.vbirth = vbirth;
	}

	public String getVage() {
		return vage;
	}

	public void setVage(String vage) {
		this.vage = vage;
	}

	public String getVgender() {
		if (vgender.equals("1")) {
			vgender = "남";
		} else if (vgender.equals("2")) {
			vgender = "여";
		}
		return vgender;
	}

	public void setVgender(String vgender) {
		this.vgender = vgender;
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
		if (vconfirm.equals("Y")) {
			vconfirm = "확인";
		} else {
			vconfirm = "미확인";
		}
		return vconfirm;
	}

	public void setVconfirm(String vconfirm) {
		this.vconfirm = vconfirm;
	}

}