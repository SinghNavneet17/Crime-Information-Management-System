package Bean;

public class Crime_Criminal_Info {
	private int CrimeId;
	private int CriminalId;
	
	@Override
	public String toString() {
		return "Crime_Criminal_Info [CrimeId=" + CrimeId + ", CriminalId=" + CriminalId + "]";
	}
	public Crime_Criminal_Info() {
		super();
	}
	public Crime_Criminal_Info(int crimeId, int criminalId) {
		super();
		CrimeId = crimeId;
		CriminalId = criminalId;
	}
	public int getCrimeId() {
		return CrimeId;
	}
	public void setCrimeId(int crimeId) {
		CrimeId = crimeId;
	}
	public int getCriminalId() {
		return CriminalId;
	}
	public void setCriminalId(int criminalId) {
		CriminalId = criminalId;
	}
}
