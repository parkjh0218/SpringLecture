package com.lec6_1.ex;

public class Family {

	String papaName;
	String mamaName;
	String sisName;
	String broName;
	
	//아빠이름, 엄마이름은 생성자를 통해 초기화 하겠다
	public Family(String papaName, String mamaName) {
		this.papaName = papaName;
		this.mamaName = mamaName;
	}
    //게터세터는 모두 있다
	public String getPapaName() {
		return papaName;
	}

	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}

	public String getMamaName() {
		return mamaName;
	}

	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}

	public String getSisName() {
		return sisName;
	}

	public void setSisName(String sisName) {
		this.sisName = sisName;
	}

	public String getBroName() {
		return broName;
	}

	public void setBroName(String broName) {
		this.broName = broName;
	}

}
