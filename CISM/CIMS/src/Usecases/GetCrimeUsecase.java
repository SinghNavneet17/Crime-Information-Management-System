package Usecases;

import java.util.List;

import Bean.Crime_Info;
import DAO.CrimeDao;
import DAO.CrimeDaoImp;
import Exception.CrimeExcetion;

public class GetCrimeUsecase {

	public static void ViewCrimeRecord()
	{

		CrimeDao dao = new CrimeDaoImp();

		try
		{
			List<Crime_Info> criminals = dao.ViewCrime();

			criminals.forEach(s ->
			{

				System.out.println("Crime Id :" + s.getCrimeId());
				System.out.println("Crime Date : " + s.getCdate());
				System.out.println("Crime Place: " + s.getCplace());
				System.out.println("Crime Name: " + s.getCrime_name());
				System.out.println("Crime Victims: " + s.getVictims());
				System.out.println("Crime Description: " + s.getCrime_Description());
				System.out.println("Crime Suspected name : " + s.getSuspects());
				System.out.println("Crime Case Status: " + s.getStatus());

				System.out.println("================================================");

				System.out.println();

			});

		}
		catch (CrimeExcetion se)
		{
			System.out.println(se.getMessage());
		}

	}
}
