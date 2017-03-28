/**
 * 
 */
package ru.rsreu.tc.tracker.dao.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ru.rsreu.tc.tracker.dao.OracleDAOFactory;
import ru.rsreu.tc.tracker.entity.Person;

/**
 * @author Lenovo
 *
 */
public class OraclePersonDAO implements PersonDAO {

	/**
	 * 
	 */
	public static final String SQL_SELECT_PERSON = "SELECT LASTNAME FROM PERSON WHERE PERSON_ID = ?";
	private static final String SQL_INSERT_PERSON = "INSERT INTO PERSON VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE_PERSON = "DELETE FROM PERSON WHERE LASTNAME = ?";
	private static final String SQL_UPDATE_PERSON = "UPDATE PERSON SET LASTNAME = ?, NAME=?, "
													+ "PATRONYMIC=?, \"E-mail\"=?, SKYPE=?,  PHONE=?, ARMY=?, "
													+ "WORK_PLACE=?, TA_ENGLISH_LEVEL=?, S_ENGLISH_LEVEL=?, "
													+ "W_ENGLISH_LEVEL=?, AATTRACTION_CHANNEL=?, WHERE PERSON_ID = ?;";
	private Connection connection;


	/**
	 * 
	 */
	public OraclePersonDAO() {

		
	}

	public OraclePersonDAO(Connection connection) {
		this.connection = connection;
	}

	/**
	 * 
	 */
	@Override
	public Person findPerson(int personID) {
		PreparedStatement pStatement = null;
		Person person = new Person();
		try {

			pStatement = connection.prepareStatement(SQL_SELECT_PERSON);
			pStatement.setInt(1, personID);
			connection.commit();
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				person.setLastname(rSet.getString(1));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}

	/**
	 * 
	 */
	@Override
	public int insertPerson(int personID, String lastname, String name, String patronimyc, String e_mail, String skype,
			int phone, String army, String workPlace, String TA_englishLevel, String S_englishLevel,
			String W_englishLevel, String attractionChannel) {
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_INSERT_PERSON);

			pStatement.setInt(1, personID);
			pStatement.setString(2, lastname);
			pStatement.setString(3, name);
			pStatement.setString(4, patronimyc);
			pStatement.setString(5, e_mail);
			pStatement.setString(6, skype);
			pStatement.setInt(7, phone);
			pStatement.setString(8, army);
			pStatement.setString(9, workPlace);
			pStatement.setString(10, TA_englishLevel);
			pStatement.setString(11, S_englishLevel);
			pStatement.setString(12, W_englishLevel);
			pStatement.setString(13, attractionChannel);
			pStatement.addBatch();
			pStatement.executeBatch();
			connection.commit();
			pStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personID;
	}

	/**
	 * 
	 */
	@Override
	public boolean deletePerson(String lastname) {
		boolean result;
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_DELETE_PERSON);

			pStatement.setString(1, lastname);
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

	/**
	 * 
	 * @param lastname
	 * @return true or false
	 */
	@Override
	public boolean updatePerson(int personID, String lastname, String name, String patronimyc, String e_mail, String skype,
			int phone, String army, String workPlace, String TA_englishLevel, String S_englishLevel,
			String W_englishLevel, String attractionChannel) {
		boolean result;
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_UPDATE_PERSON);
			pStatement.setString(1, lastname);
			pStatement.setString(2, name);
			pStatement.setString(3, patronimyc);
			pStatement.setString(4, e_mail);
			pStatement.setString(5, skype);
			pStatement.setInt(6, phone);
			pStatement.setString(7, army);
			pStatement.setString(8, workPlace);
			pStatement.setString(9, TA_englishLevel);
			pStatement.setString(10, S_englishLevel);
			pStatement.setString(11, W_englishLevel);
			pStatement.setString(12, attractionChannel);
			pStatement.setInt(13, personID);
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
