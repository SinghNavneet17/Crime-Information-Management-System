package Bean;

public class Crime_Info {
	private int	CrimeId;           
	private String	Cdate;             
	private String   Cplace;
	private String   crime_name;            
	private String	 Victims;           
	private String	 Crime_Description ;
	private String Suspects;
	private String  Status;
	
	@Override
	public String toString() {
		return "Crime_Info [CrimeId=" + CrimeId + ", Cdate=" + Cdate + ", Cplace=" + Cplace + ", crime_name="
				+ crime_name + ", Victims=" + Victims + ", Crime_Description=" + Crime_Description + ", Suspects="
				+ Suspects + ", Status=" + Status + "]";
	}
	public Crime_Info(int crimeId, String cdate, String cplace, String crime_name, String victims,
			String crime_Description, String suspects, String status) {
		super();
		CrimeId = crimeId;
		Cdate = cdate;
		Cplace = cplace;
		this.crime_name = crime_name;
		Victims = victims;
		Crime_Description = crime_Description;
		Suspects = suspects;
		Status = status;
	}
	public Crime_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCrimeId() {
		return CrimeId;
	}
	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}
	public String getCdate() {
		return Cdate;
	}
	public void setCdate(String cdate) {
		Cdate = cdate;
	}
	public String getCplace() {
		return Cplace;
	}
	public void setCplace(String cplace) {
		Cplace = cplace;
	}
	public String getCrime_name() {
		return crime_name;
	}
	public void setCrime_name(String crime_name) {
		this.crime_name = crime_name;
	}
	public String getVictims() {
		return Victims;
	}
	public void setVictims(String victims) {
		Victims = victims;
	}
	public String getCrime_Description() {
		return Crime_Description;
	}
	public void setCrime_Description(String crime_Description) {
		Crime_Description = crime_Description;
	}
	public String getSuspects() {
		return Suspects;
	}
	public void setSuspects(String suspects) {
		Suspects = suspects;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
