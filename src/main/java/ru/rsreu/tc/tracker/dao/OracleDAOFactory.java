/**
 * 
 */
package ru.rsreu.tc.tracker.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import ru.rsreu.tc.tracker.dao.candidate.CandidateDAO;
import ru.rsreu.tc.tracker.dao.candidate.OracleCandidateDAO;
import ru.rsreu.tc.tracker.dao.person.OraclePersonDAO;
import ru.rsreu.tc.tracker.dao.person.PersonDAO;
import ru.rsreu.tc.tracker.dao.rdm.OracleRdmDAO;
import ru.rsreu.tc.tracker.dao.rdm.RdmDAO;
import ru.rsreu.tc.tracker.dao.requisition.OracleRequisitionDAO;
import ru.rsreu.tc.tracker.dao.requisition.RequisitionDAO;
import ru.rsreu.tc.tracker.dao.training_direction.OracleTrainingDirectionDAO;
import ru.rsreu.tc.tracker.dao.training_direction.TrainingDirectionDAO;

/**
 * @author Lenovo
 *
 */
public class OracleDAOFactory implements DAOFactory{

	@Resource()
	private DataSource dataSource;
	@PostConstruct
	public void init(){
		Locale.setDefault(Locale.ENGLISH);
	}
	
	
	public DataSource getDs() {
		return dataSource;
	}



	public void setDs(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/**
	 * 
	 */
	@Override
	public PersonDAO getPersonDAO() {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new OraclePersonDAO(connection);
	}



	



	/**
	 * 
	 */
	@Override
	public CandidateDAO getCandidateDAO() {
		Connection connection = null;
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new OracleCandidateDAO(connection);
	}



	/**
	 * 
	 */
	@Override
	public RdmDAO getRdm() {
		Connection connection = null;
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new OracleRdmDAO(connection);
	}



	/**
	 * 
	 */
	@Override
	public RequisitionDAO getRequisitionDAO() {
		Connection connection = null;
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new OracleRequisitionDAO();
	}



	/**
	 * 
	 */
	@Override
	public TrainingDirectionDAO getTrainingDirectionDAO() {
		Connection connection = null;
		try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return (TrainingDirectionDAO) new OracleTrainingDirectionDAO();
	}
	
}
