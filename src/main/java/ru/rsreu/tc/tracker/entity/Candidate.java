/**
 * 
 */
package ru.rsreu.tc.tracker.entity;

/**
 * @author Lenovo
 *
 */
public class Candidate {
	
	private int candidateID;
	private int priority;
	private int requisitionNumber;
	private int person;
	
	/**
	 * @return candidateID
	 */
	public int getCandidateID() {
		return candidateID;
	}
	/**
	 * @param candidateID
	 */
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}
	/**
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}
	/**
	 * @param priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * @return requisitionNumber
	 */
	public int getRequisitionNumber() {
		return requisitionNumber;
	}
	/**
	 * @param requisitionNumber
	 */
	public void setRequisitionNumber(int requisitionNumber) {
		this.requisitionNumber = requisitionNumber;
	}
	/**
	 * @return person
	 */
	public int getPerson() {
		return person;
	}
	/**
	 * @param person
	 */
	public void setPerson(int person) {
		this.person = person;
	}
	
	
}
