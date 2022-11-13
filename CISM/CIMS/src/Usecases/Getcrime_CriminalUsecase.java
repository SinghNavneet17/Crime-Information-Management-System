package Usecases;

import java.util.List;
import java.util.Scanner;

import Bean.Criminal_Info;
import DAO.crime_CriminalDao;
import DAO.crime_CriminalDaoImpl;
import Exception.CriminalExcetion;

public class Getcrime_CriminalUsecase {
	public static void CriminalCrimeRecord()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Crime Name : ");

		String cr = sc.next();

		crime_CriminalDao dao = new crime_CriminalDaoImpl();

		try
		{
			List<Criminal_Info> criminals = dao.CrimeFile(cr);

			criminals.forEach(s ->
			{

				System.out.println("Criminal name --> " + s.getName());
				System.out.println("Crime Commited by Criminal is --> " + s.getCrime_Name());

				System.out.println("================================================");

				System.out.println();

			});

		}
		catch (CriminalExcetion se)
		{
			System.out.println(se.getMessage());
		}

	}
}
