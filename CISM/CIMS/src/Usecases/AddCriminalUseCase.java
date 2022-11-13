package Usecases;

import java.util.Scanner;

import Bean.Criminal_Info;
import DAO.CriminalDao;
import DAO.CriminalDaoImpl;

public class AddCriminalUseCase {

	public static void Addcriminal()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Criminals Name: ");
		String name = sc.next();

		System.out.println("Enter Criminals Age: ");
		int age = sc.nextInt();

		System.out.println("Enter Criminals Gender: ");
		String gender = sc.next();

		System.out.println("Enter Criminals Address : ");
		String address = sc.next();

		System.out.println("Enter Criminals Face Identity Mark: ");
		String mark = sc.next();

		System.out.println("Enter Criminals crime Area : ");
		String area = sc.next();

		System.out.println("Enter Criminals crime  : ");
		String crime = sc.next();

		CriminalDao dao = new CriminalDaoImpl();

		Criminal_Info criminal = new Criminal_Info();

		criminal.setName(name);
		criminal.setAge(age);
		criminal.setGender(gender);
		criminal.setAddress(address);
		criminal.setFace_Id(mark);
		criminal.setCrime_Area(area);
		criminal.setCrime_Name(crime);

		String result = dao.AddCriminal(criminal);

		System.out.println(result);

	}
}
