package project.vote.vo;

public class candidateVo {

	private String mno;
	private String mname;
	private String pname;
	private String pschool;
	private String mjumin;
	private String mcity;
	private String ptel1;
	private String ptel2;
	private String ptel3;

	public candidateVo() {
	}

	public candidateVo(String mno, String mname, String pname, String pschool, String mjumin, String mcity,
			String ptel1, String ptel2, String ptel3) {
		this.mno = mno;
		this.mname = mname;
		this.pname = pname;
		this.pschool = pschool;
		this.mjumin = mjumin;
		this.mcity = mcity;
		this.ptel1 = ptel1;
		this.ptel2 = ptel2;
		this.ptel3 = ptel3;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPschool() {
		if (pschool.equals("1")) {
			pschool = "고졸";
		} else if (pschool.equals("2")) {
			pschool = "석사";
		} else if (pschool.equals("3")) {
			pschool = "학사";
		} else {
			pschool = "박사";
		}
		return pschool;
	}

	public void setPschool(String pschool) {
		this.pschool = pschool;
	}

	public String getMjumin() {
		return mjumin;
	}

	public void setMjumin(String mjumin) {
		this.mjumin = mjumin;
	}

	public String getMcity() {
		return mcity;
	}

	public void setMcity(String mcity) {
		this.mcity = mcity;
	}

	public String getPtel1() {
		return ptel1;
	}

	public void setPtel1(String ptel1) {
		this.ptel1 = ptel1;
	}

	public String getPtel2() {
		return ptel2;
	}

	public void setPtel2(String ptel2) {
		this.ptel2 = ptel2;
	}

	public String getPtel3() {
		return ptel3;
	}

	public void setPtel3(String ptel3) {
		this.ptel3 = ptel3;
	}

}