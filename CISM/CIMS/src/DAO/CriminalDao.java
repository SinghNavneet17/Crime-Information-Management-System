package DAO;

import java.util.List;

import Bean.Criminal_Info;
import Exception.CriminalExcetion;

public interface CriminalDao {

	public String AddCriminal(Criminal_Info criminalInfo);

	public List<Criminal_Info> ViewCriminal() throws CriminalExcetion;

	public Criminal_Info getcriminalByCId(int Cid) throws CriminalExcetion;

	public String UpdateCriminal(Criminal_Info criminalInfo);
}
