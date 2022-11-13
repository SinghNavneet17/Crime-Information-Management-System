package Usecases;

import java.util.Scanner;

import Bean.Crime_Criminal_Info;
import DAO.crime_CriminalDao;
import DAO.crime_CriminalDaoImpl;

public class DeleteCrime_CriminalUseCase {
	public static void DelectCrimeRecord()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Criminal id: ");
		int id = sc.nextInt();

		crime_CriminalDao dao = new crime_CriminalDaoImpl();

		Crime_Criminal_Info crime = new Crime_Criminal_Info();

		crime.setCrimeId(id);
		;

		String result = dao.DeleteCriminal_crime(crime);

		System.out.println(result);

	}
}
