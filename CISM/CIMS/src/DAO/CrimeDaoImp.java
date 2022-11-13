package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Crime_Info;
import Exception.CrimeExcetion;
import Utility.DBUtil;

public class CrimeDaoImp implements CrimeDao{
	@Override
	public String AddCrime(Crime_Info crimeInfo)
	{

		String msg = "Not Insertd ....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement(
					"insert into crime (cdate, cplace, Crime_name, Victims, Crime_Description, suspects)"
							+ "values (?,?,?,?,?,?)");

			ps.setString(1, crimeInfo.getCdate());
			ps.setString(2, crimeInfo.getCplace());
			ps.setString(3, crimeInfo.getCrime_name());
			ps.setString(4, crimeInfo.getVictims());
			ps.setString(5, crimeInfo.getCrime_Description());
			ps.setString(6, crimeInfo.getSuspects());

			int x = ps.executeUpdate();

			if (x > 0)
			{

				msg = "Crime Added Sucessfully !";
			}
		}
		catch (SQLException e)
		{

			e.printStackTrace();
			System.out.println(e.getMessage());

		}

		return msg;
	}

	@Override
	public List<Crime_Info> ViewCrime() throws CrimeExcetion
	{
		List<Crime_Info> Crime = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();)
		{

			PreparedStatement ps = conn.prepareStatement("select * from crime");

			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{

				int id = rs.getInt("crimeId");
				String d = rs.getString("cdate");
				String p = rs.getString("cplace");
				String cn = rs.getString("Crime_name");
				String v = rs.getString("Victims");
				String cd = rs.getString("Crime_Description");
				String sp = rs.getString("suspects");
				String st = rs.getString("Status");

				Crime_Info cri = new Crime_Info(id, d, p, cn, v, cd, sp, st);

				Crime.add(cri);

			}
		}
		catch (SQLException e)
		{
			throw new CrimeExcetion(e.getMessage());

		}

		if (Crime.size() == 0) throw new CrimeExcetion("No crime found..");

		return Crime;

	}

	@Override
	public int statuscount(String s1) throws CrimeExcetion
	{

		int count = 0;

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select count(*) from crime where status=?");
			ps.setString(1, s1);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{

				count = rs.getInt("count(*)");
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int Monthcount(String s1, String s2) throws CrimeExcetion
	{
		int count = 0;

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select count(*) from crime where cdate between ? AND ?");
			ps.setString(1, s1);
			ps.setString(2, s2);

			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{

				count = rs.getInt("count(*)");
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public List<Crime_Info> CrimeArea(String n) throws CrimeExcetion
	{

		List<Crime_Info> Crime = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("select * from crime where cplace=?");

			ps.setString(1, n);

			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				int id = rs.getInt("crimId");
				String d = rs.getString("cdate");
				String p = rs.getString("cplace");
				String cn = rs.getString("Crime_name");
				String v = rs.getString("Victims");
				String cd = rs.getString("Crime_Description");
				String sp = rs.getString("suspects");
				String st = rs.getString("Status");

				Crime_Info cr = new Crime_Info(id, d, p, cn, v, cd, sp, st);
				Crime.add(cr);

			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		if (Crime.size() == 0) throw new CrimeExcetion("No crime found..");

		return Crime;

	}

	@Override
	public String UpdateCrime(Crime_Info crimeInfo)
	{

		String msg = "Not Updated....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("update crime set status=? where crimeId=?");

			ps.setString(1, crimeInfo.getStatus());
			ps.setInt(2, crimeInfo.getCrimeId());
			ps.executeUpdate();

			msg = "Case Status Updated Successfully";

		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return msg;
	}
}
