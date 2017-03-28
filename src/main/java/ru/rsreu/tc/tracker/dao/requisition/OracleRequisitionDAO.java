/**
 * 
 */
package ru.rsreu.tc.tracker.dao.requisition;

import ru.rsreu.tc.tracker.entity.Requisition;

/**
 * @author Lenovo
 *
 */
public class OracleRequisitionDAO implements RequisitionDAO{

	public static final String SQL_SELECT_REQUISITION = "select LASTNAME from REQUISITION WHERE RDM_ID = ? ;";
	private static final String SQL_INSERT_REQUISITION = "INSERT INTO REQUISITION VALUES (null, ?, ?, ?, ?);";
	//private static final String SQL_DELETE_REQUISITION = "DELETE FROM REQUISITION WHERE LASTNAME = ?";
	private static final String SQL_UPDATE_REQUISITION = "UPDATE REQUISITION SET LASTNAME = ?, NAME=?, "
			+ "PATROMYMIC=?, POSITION = ?, WHERE RDM_ID = ?;";
	
	/* (non-Javadoc)
	 * @see dao.requisition.RequisitionDAO#findRequisition(int)
	 */
	@Override
	public Requisition findRequisition(int requisitionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see dao.requisition.RequisitionDAO#deleteRequisition(int)
	 */
	@Override
	public int deleteRequisition(int requisitionNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.requisition.RequisitionDAO#insertRequisition(java.lang.String, java.lang.String, int)
	 */
	@Override
	public int insertRequisition(String name, String courseType, int trainingDirection) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see dao.requisition.RequisitionDAO#updateRequisition(java.lang.String, java.lang.String, int)
	 */
	@Override
	public boolean updateRequisition(String name, String courseType, int trainingDirection) {
		// TODO Auto-generated method stub
		return false;
	}

}
