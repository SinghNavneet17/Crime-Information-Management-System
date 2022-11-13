package Usecases;

import java.util.Scanner;

import DAO.CrimeDao;
import DAO.CrimeDaoImp;
import Exception.CrimeExcetion;

public class GetCrimeStatusCountUsecase {
	public static void countSovingCases()
	{
		CrimeDao dao = new CrimeDaoImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Case status");
		String s1 = sc.next();

		try
		{
			int c = dao.statuscount(s1);
			System.out.println("Total Number of Resolved/Unresolved Cases : " + c);

		}
		catch (CrimeExcetion e)
		{
			e.printStackTrace();
		}
	}
}
