/**
 * 
 */
package ru.rsreu.tc.tracker.dao;

import ru.rsreu.tc.tracker.dao.candidate.CandidateDAO;
import ru.rsreu.tc.tracker.dao.person.PersonDAO;
import ru.rsreu.tc.tracker.dao.rdm.RdmDAO;
import ru.rsreu.tc.tracker.dao.requisition.RequisitionDAO;
import ru.rsreu.tc.tracker.dao.training_direction.TrainingDirectionDAO;

/**
 * @author Lenovo
 *
 */
public interface DAOFactory {

	public PersonDAO getPersonDAO();

	public CandidateDAO getCandidateDAO();

	public RdmDAO getRdm();

	public RequisitionDAO getRequisitionDAO();

	public TrainingDirectionDAO getTrainingDirectionDAO();

}
