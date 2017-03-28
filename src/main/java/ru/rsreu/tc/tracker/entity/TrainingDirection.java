/**
 * 
 */
package ru.rsreu.tc.tracker.entity;

/**
 * @author Lenovo
 *
 */
public class TrainingDirection {

	private int trainingDirectionID;
	private String trainingDirectionName;
	private String trainingDirectionStatus;
	private int rdm;
	
	
	/**
	 * @return trainingDirectionID
	 */
	public int getTrainingDirectionID() {
		return trainingDirectionID;
	}
	/**
	 * @param trainingDirectionID
	 */
	public void setTrainingDirectionID(int trainingDirectionID) {
		this.trainingDirectionID = trainingDirectionID;
	}
	/**
	 * @return trainingDirectionName
	 */
	public String getTrainingDirectionName() {
		return trainingDirectionName;
	}
	/**
	 * @param trainingDirectionName
	 */
	public void setTrainingDirectionName(String trainingDirectionName) {
		this.trainingDirectionName = trainingDirectionName;
	}
	/**
	 * @return trainingDirectionStatus
	 */
	public String getTrainingDirectionStatus() {
		return trainingDirectionStatus;
	}
	/**
	 * @param trainingDirectionStatus
	 */
	public void setTrainingDirectionStatus(String trainingDirectionStatus) {
		this.trainingDirectionStatus = trainingDirectionStatus;
	}
	/**
	 * @return rdm
	 */
	public int getRdm() {
		return rdm;
	}
	/**
	 * @param rdm
	 */
	public void setRdm(int rdm) {
		this.rdm = rdm;
	}
	
	
}
