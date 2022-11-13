package DAO;

import java.util.List;

import Bean.Crime_Criminal_Info;
import Bean.Criminal_Info;
import Exception.CriminalExcetion;

public interface crime_CriminalDao {
	public List<Criminal_Info> CrimeFile(String cname) throws CriminalExcetion;

	public String AddCriminalCrime(int crimeid, int cid);

	public String DeleteCriminal_crime(Crime_Criminal_Info crimeInfo);
}
