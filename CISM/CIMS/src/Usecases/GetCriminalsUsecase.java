package Usecases;

import java.util.List;

import Bean.Criminal_Info;
import DAO.CriminalDao;
import DAO.CriminalDaoImpl;
import Exception.CriminalExcetion;

public class GetCriminalsUsecase {
	public static void Criminal()
	{

		CriminalDao dao = new CriminalDaoImpl();

		try
		{
			List<Criminal_Info> criminals = dao.ViewCriminal();

			criminals.forEach(s ->
			{

				System.out.println("Criminal Id -->" + s.getCid());
				System.out.println("Criminal name --> " + s.getName());
				System.out.println("Criminal Age --> " + s.getAge());
				System.out.println("Criminal Gender --> " + s.getGender());
				System.out.println("Criminal Address --> " + s.getAddress());
				System.out.println("Criminal Face Mark --> " + s.getFace_Id());
				System.out.println("Criminal Crime Area --> " + s.getCrime_Area());
				System.out.println("Criminal Crime Name --> " + s.getCrime_Name());

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
