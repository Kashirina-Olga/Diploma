/**
 * 
 */
package ru.rsreu.tc.tracker.dao.rdm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ru.rsreu.tc.tracker.dao.OracleDAOFactory;
import ru.rsreu.tc.tracker.entity.RDM;

/**
 * @author Lenovo
 *
 */
public class OracleRdmDAO implements RdmDAO {

	public static final String SQL_SELECT_RDM = "select LASTNAME from RDM WHERE RDM_ID = ? ;";
	private static final String SQL_INSERT_RDM = "INSERT INTO RDM VALUES (null, ?, ?, ?, ?);";
	// private static final String SQL_DELETE_RDM = "DELETE FROM RDM WHERE
	// LASTNAME = ?";
	private static final String SQL_UPDATE_RDM = "UPDATE RDM SET LASTNAME = ?, NAME=?, "
			+ "PATROMYMIC=?, POSITION = ?, WHERE RDM_ID = ?;";

	private Connection connection;

	/**
	 * 
	 */
	public OracleRdmDAO(Connection connection) {
		this.connection = connection;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.rdm.RdmDAO#findRdm(int)
	 */
	@Override
	public RDM findRdm(int rdmID) {
		PreparedStatement pStatement = null;
		RDM rdm = new RDM();
		try {

			pStatement = connection.prepareStatement(SQL_SELECT_RDM);
			pStatement.setInt(1, rdmID);
			connection.commit();
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				rdm.setLastName(rSet.getString(1));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rdm;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.rdm.RdmDAO#deleteRdm(java.lang.String)
	 */
	@Override
	public int deleteRdm(String lastname) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.rdm.RdmDAO#insertRdm(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public int insertRdm(String lastname, String name, String patronymic, String position) {
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_INSERT_RDM);

			pStatement.setString(1, lastname);
			pStatement.setString(2, name);
			pStatement.setString(3, patronymic);
			pStatement.setString(4, position);
			pStatement.addBatch();
			pStatement.executeBatch();
			connection.commit();
			pStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.rdm.RdmDAO#updateRdm(java.lang.String, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public boolean updateRdm(String lastname, String name, String patronymic, String position) {
		boolean result;
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_UPDATE_RDM);

			pStatement.setString(1, lastname);
			pStatement.setString(2, name);
			pStatement.setString(3, patronymic);
			pStatement.setString(4, position);
			pStatement.addBatch();
			pStatement.executeBatch();
			connection.commit();
			pStatement.close();
			connection.close();
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

}
