package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Crime_Criminal_Info;
import Bean.Criminal_Info;
import Exception.CriminalExcetion;
import Utility.DBUtil;

public class crime_CriminalDaoImpl implements crime_CriminalDao {
	@Override
	public List<Criminal_Info> CrimeFile(String cname) throws CriminalExcetion
	{
		List<Criminal_Info> Criminals = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection();)
		{

			PreparedStatement ps = conn.prepareStatement("select c.cname, cr.crime_name from criminal"
					+ " c INNER JOIN crime cr INNER JOIN crime_criminal cc ON cc.crimeId=cr.crimeId "
					+ "AND cc.cid=c.cid AND cr.crime_name=?");
			ps.setString(1, cname);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{

				Criminal_Info cr = new Criminal_Info();
				cr.setName(rs.getString("cname"));
				cr.setCrime_Name(rs.getString("Crime_name"));

				Criminals.add(cr);

			}
		}
		catch (SQLException e)
		{
			throw new CriminalExcetion(e.getMessage());

		}

		if (Criminals.size() == 0) throw new CriminalExcetion("No Criminal crime found..");

		return Criminals;

	}

	@Override
	public String AddCriminalCrime(int crimeid, int cid)
	{

		String msg = "Not Inserted .....";
		try (Connection conn = DBUtil.provideConnection();)
		{

			PreparedStatement ps = conn.prepareStatement("insert into crime_criminal values(?,?)");
			ps.setInt(1, crimeid);
			ps.setInt(2, cid);

			int x = ps.executeUpdate();

			if (x > 0)
			{
				msg = "Criminal crime added successfully !!";
			}
			else
			{
				msg = "Unable To add Record ...";
			}

		}
		catch (SQLException e)
		{
			msg = e.getMessage();
		}
		return msg;

	}

	@Override
	public String DeleteCriminal_crime(Crime_Criminal_Info crimeInfo)
	{

		String msg = "Not Updated....";

		try (Connection conn = DBUtil.provideConnection();)
		{
			PreparedStatement ps = conn.prepareStatement("DELETE FROM crime_Criminal WHERE cId=?");

			ps.setInt(1, crimeInfo.getCrimeId());
			ps.executeUpdate();

			msg = "Data deleted Successfully";

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		return msg;

	}
}
