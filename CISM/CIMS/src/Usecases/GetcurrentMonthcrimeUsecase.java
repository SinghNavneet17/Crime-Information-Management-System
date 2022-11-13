package Usecases;

import java.util.Scanner;

import DAO.CrimeDao;
import DAO.CrimeDaoImp;
import Exception.CrimeExcetion;

public class GetcurrentMonthcrimeUsecase {

	public static void OneMonthCrime()
	{
		CrimeDao dao = new CrimeDaoImp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  StartDate in YYYY-MM-DD :");
		String s1 = sc.next();
		System.out.println("Enter the EndDate in YYYY-MM-DD : ");
		String s2 = sc.next();

		try
		{
			int c = dao.Monthcount(s1, s2);
			System.out.println("Number of crimes recorded in the current month : " + c);

		}
		catch (CrimeExcetion e)
		{
			e.printStackTrace();
		}
	}
}
