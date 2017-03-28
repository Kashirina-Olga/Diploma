/**
 * 
 */
package ru.rsreu.tc.tracker.dao.requisition;

import ru.rsreu.tc.tracker.entity.Requisition;

/**
 * @author Lenovo
 *
 */
public interface RequisitionDAO {

	public Requisition findRequisition(int requisitionNumber);
	public int deleteRequisition(int requisitionNumber);
	int insertRequisition(String name, String courseType, int trainingDirection);
	boolean updateRequisition(String name, String courseType, int trainingDirection);
}
