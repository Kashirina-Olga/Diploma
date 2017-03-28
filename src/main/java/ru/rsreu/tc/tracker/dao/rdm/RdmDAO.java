/**
 * 
 */
package ru.rsreu.tc.tracker.dao.rdm;

import ru.rsreu.tc.tracker.entity.RDM;

/**
 * @author Lenovo
 *
 */
public interface RdmDAO {

	public RDM findRdm(int rdmID);
	public int deleteRdm(String lastname);
	int insertRdm(String lastname, String name, String patronymic, String position);
	boolean updateRdm(String lastname, String name, String patronymic, String position);

}
