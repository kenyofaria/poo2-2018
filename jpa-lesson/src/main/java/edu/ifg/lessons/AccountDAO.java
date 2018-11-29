package edu.ifg.lessons;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

	private Connection connection;
	
	public AccountDAO(Connection connection) {
		super();
		this.connection = connection;
	}


	public void save(Account account) {
		String sql = "insert into account (holder, number, bank, funds) values (?,?,?,?)";
		try {
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.setString(1, account.getHolder());
			ps.setString(2, account.getNumber());
			ps.setString(3, account.getBank());
			ps.setDouble(4, account.getFunds());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}
	
	public List<Account> pagedList(int first, int total){
		try {
			String sql = "select holder, number, bank, funds from account offset ? limit ? ";
			PreparedStatement ps = this.connection
					.prepareStatement(sql);
			ps.setInt(1, first);
			ps.setInt(2, total);

			ResultSet rs = ps.executeQuery();

			List<Account> list = new ArrayList<Account>();

			while (rs.next()) {
				Account a = new Account();
				a.setHolder(rs.getString("holder"));
				a.setNumber(rs.getString("number"));
				a.setBank(rs.getString("bank"));
				a.setFunds(rs.getDouble("funds"));
				list.add(a);
			}

			ps.close();
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
