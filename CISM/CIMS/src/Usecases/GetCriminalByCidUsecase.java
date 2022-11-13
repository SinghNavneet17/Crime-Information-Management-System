package Usecases;

import java.util.Scanner;

import Bean.Criminal_Info;
import DAO.CriminalDao;
import DAO.CriminalDaoImpl;
import Exception.CriminalExcetion;

public class GetCriminalByCidUsecase {
	public static void ViewCriminalById()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Criminal Id");
		int id = sc.nextInt();

		CriminalDao dao = new CriminalDaoImpl();

		try
		{
			Criminal_Info criminal = dao.getcriminalByCId(id);

			System.out.println("Criminal Id -->" + criminal.getCid());
			System.out.println("Criminal name --> " + criminal.getName());
			System.out.println("Criminal Age --> " + criminal.getAge());
			System.out.println("Criminal Gender --> " + criminal.getGender());
			System.out.println("Criminal Address --> " + criminal.getAddress());
			System.out.println("Criminal Face Mark --> " + criminal.getFace_Id());
			System.out.println("Criminal Crime Area --> " + criminal.getCrime_Area());
			System.out.println("Criminal Crime Name --> " + criminal.getCrime_Name());

			System.out.println();

			System.out.println();

		}
		catch (CriminalExcetion e)
		{
			e.printStackTrace();
		}

	}
}
