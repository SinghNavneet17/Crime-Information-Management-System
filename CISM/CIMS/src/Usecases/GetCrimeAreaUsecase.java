package Usecases;

import java.util.List;
import java.util.Scanner;

import Bean.Crime_Info;
import DAO.CrimeDao;
import DAO.CrimeDaoImp;
import Exception.CrimeExcetion;

public class GetCrimeAreaUsecase {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Crime Area : ");
		String n = sc.next();
		CrimeDao dao = new CrimeDaoImp();

		try
		{
			List<Crime_Info> criminals = dao.CrimeArea(n);

			criminals.forEach(s ->
			{

				System.out.println("Crime Id -->" + s.getCrimeId());
				System.out.println("Crime Date --> " + s.getCdate());
				System.out.println("Crime Place --> " + s.getCplace());
				System.out.println("Crime Name --> " + s.getCrime_name());
				System.out.println("Crime Victims --> " + s.getVictims());
				System.out.println("Crime Description --> " + s.getCrime_Description());
				System.out.println("Crime Suspected name --> " + s.getSuspects());
				System.out.println("Crime Case Status --> " + s.getStatus());

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
