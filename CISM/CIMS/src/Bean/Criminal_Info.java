package Bean;

public class Criminal_Info {
	private int Cid;
	private	String  Name;
	private int Age;
	private String Gender;
	private String Address;
	private String Face_Id;
	private String Crime_Area;
	private String Crime_Name;
	
	@Override
	public String toString() {
		return "Criminal_Info [Cid=" + Cid + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Address="
				+ Address + ", Face_Id=" + Face_Id + ", Crime_Area=" + Crime_Area + ", Crime_Name=" + Crime_Name + "]";
	}
	public Criminal_Info() {
		super();
	}
	public Criminal_Info(int cid, String name, int age, String gender, String address, String Face_Id,
			String crime_Area, String crime_Name) {
		super();
		Cid = cid;
		Name = name;
		Age = age;
		Gender = gender;
		Address = address;
		Face_Id = Face_Id;
		Crime_Area = crime_Area;
		Crime_Name = crime_Name;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getFace_Id() {
		return Face_Id;
	}
	public void setFace_Id(String Face_Id) {
		Face_Id = Face_Id;
	}
	public String getCrime_Area() {
		return Crime_Area;
	}
	public void setCrime_Area(String crime_Area) {
		Crime_Area = crime_Area;
	}
	public String getCrime_Name() {
		return Crime_Name;
	}
	public void setCrime_Name(String crime_Name) {
		Crime_Name = crime_Name;
	}
}
