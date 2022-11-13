package Usecases;

import java.util.Scanner;

import DAO.crime_CriminalDao;
import DAO.crime_CriminalDaoImpl;

public class AddCrime_Criminal_RecordUsecase {
	public static void AddCriminalCrime()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Crime Id: ");
		int crimeid = sc.nextInt();

		System.out.println("Enter Criminal Id: ");
		int cid = sc.nextInt();

	crime_CriminalDao dao = new crime_CriminalDaoImpl();

		String res = dao.AddCriminalCrime(crimeid, cid);
		System.out.println(res);

	}
}
