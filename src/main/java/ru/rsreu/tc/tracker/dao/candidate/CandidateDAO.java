/**
 * 
 */
package ru.rsreu.tc.tracker.dao.candidate;

import ru.rsreu.tc.tracker.entity.Person;

/**
 * @author Lenovo
 *
 */
public interface CandidateDAO {

	/**
	 * @param candidateID
	 * @return
	 */
	public Person findCandidate(int candidateID);
	public int deleteCandidate(String lastname);
	/**
	 * @param priority
	 * @param requisiotionNumber
	 * @param personID
	 * @return
	 */
	int insertCandidate(int priority, int requisiotionNumber, int personID);
	/**
	 * @param priority
	 * @param requisiotionNumber
	 * @param personID
	 * @return true or false
	 */
	boolean updateCandidate(int priority, int requisiotionNumber, int personID);
	
}
