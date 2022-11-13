package DAO;

import java.util.List;

import Bean.Crime_Info;
import Exception.CrimeExcetion;

public interface CrimeDao {
	public String AddCrime(Crime_Info crimeInfo);

	public List<Crime_Info> ViewCrime() throws CrimeExcetion;

	public int statuscount(String s1) throws CrimeExcetion;

	public int Monthcount(String s1, String s2) throws CrimeExcetion;

	public List<Crime_Info> CrimeArea(String s) throws CrimeExcetion;

	public String UpdateCrime(Crime_Info crimeInfo);
}
