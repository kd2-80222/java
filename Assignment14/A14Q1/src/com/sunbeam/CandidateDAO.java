
package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable{
	
//	Connection Established.
	
	private Connection con;
	public CandidateDAO() throws SQLException
	{
		con = DbUtil.getConnection();
	}
	@Override
	public void close()
	{
		try 
		{
			if(con != null)
				con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
//------------------------------------------------
	
//	Add new Candidate
	public int save(Candidate c) throws SQLException
	{
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt= stmt.executeUpdate();
			return cnt;
		}
		
	}
	
//	Modify name and Party for the id
	
	public int update(Candidate c) throws SQLException
	{
		
		String sql = "update candidates set votes = ?, name = ? where id = ? ";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			stmt.setInt(3, c.getId());
			stmt.setString(2, c.getName());
			stmt.setInt(1, c.getVotes());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

//	Get party wise votes
	public List<PartyVotes> getPartywiseVotes() throws SQLException
	{
		List<PartyVotes> list = new ArrayList<>();
		
		String sql = "select party, sum(votes) as Total_Votes from candidates group by party";
		try(PreparedStatement stmt = con.prepareStatement(sql))
		{
			try(ResultSet rs = stmt.executeQuery())
			{
				while(rs.next())
				{
					String party = rs.getString("party");
					int totalVotes = rs.getInt("Total_votes");
					PartyVotes p= new PartyVotes(party,totalVotes);
					list.add(p);
				}
			}
		}
		return list;
	}
	
}
