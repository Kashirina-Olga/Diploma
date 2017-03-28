/**
 * 
 */
package ru.rsreu.tc.tracker.dao.candidate;

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
public class OracleCandidateDAO implements CandidateDAO{
	
	public static final String SQL_SELECT_CANDIDATE = "select PERSON.LASTNAME from PERSON inner join "
													+ "CANDIDATE on PERSON.PERSON_ID = "
													+ "CANDIDATE.PERSON_PERSON_ID "
													+ "where CANDIDATE.CANDIDATE_ID=?;";
	private static final String SQL_INSERT_CANDIDATE = "INSERT INTO CANDIDATE VALUES (null, ?, ?, ?);";
	//private static final String SQL_DELETE_CANDIDATE = "DELETE FROM PERSON WHERE LASTNAME = ?";
	private static final String SQL_UPDATE_CANDIADTE = "UPDATE PERSON SET PRIORITY = ?, REQUISITION_REQUISITION_NUMBER=?, "
													+ "PERSON_PERSON_ID=?, WHERE CANDADATE_ID = ?;";
	
	private Connection connection;
	
	public OracleCandidateDAO(Connection connection) {
		this.connection=connection;
	}
	

	/**
	 * 
	 */
	@Override
	public Person findCandidate(int candidateID) {
		PreparedStatement pStatement = null;
		//Candidate candidate = new Candidate();
		Person person = new Person();
		try {

			pStatement = connection.prepareStatement(SQL_SELECT_CANDIDATE);
			pStatement.setInt(1, candidateID);
			connection.commit();
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				//candidate.setPriority(rSet.getInt(1));
				person.setLastname(rSet.getString(1));
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return person;
	}

	/* (non-Javadoc)
	 * @see dao.candidate.CandidateDAO#insertCandidate()
	 */
	@Override
	public int insertCandidate(int priority, int requisiotionNumber, int personID) {
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_INSERT_CANDIDATE);

			pStatement.setInt(1, priority);
			pStatement.setInt(2, requisiotionNumber);
			pStatement.setInt(3, personID);
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

	/* (non-Javadoc)
	 * @see dao.candidate.CandidateDAO#updateCandidate()
	 */
	@Override
	public boolean updateCandidate(int priority, int requisiotionNumber, int personID) {
		boolean result;
		PreparedStatement pStatement;
		try {
			pStatement = connection.prepareStatement(SQL_UPDATE_CANDIADTE);
			pStatement.setInt(1, priority);
			pStatement.setInt(2, requisiotionNumber);
			pStatement.setInt(3, personID);
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

	/* (non-Javadoc)
	 * @see dao.candidate.CandidateDAO#deleteCandidate(java.lang.String)
	 */
	@Override
	public int deleteCandidate(String lastname) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
