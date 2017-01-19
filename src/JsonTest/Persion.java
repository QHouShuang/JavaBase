package JsonTest;

import java.io.Serializable;

public class Persion implements Serializable{
	
	private String name;
	private int id;
	private String classId;
	private String sex;
	private String tel;
	
	public Persion(){
		
	};
	
	@Override
	public String toString() {
		return "Persion [name=" + name + ", id=" + id + ", classId=" + classId
				+ ", sex=" + sex + ", tel=" + tel + "]";
	}

	public Persion(String name,int id,String classId,String sex,String tel){
		this.name=name;
		this.id=id;
		this.classId=classId;
		this.sex=sex;
		this.tel=tel;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
}
