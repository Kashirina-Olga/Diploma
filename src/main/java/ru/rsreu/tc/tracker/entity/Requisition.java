/**
 * 
 */
package ru.rsreu.tc.tracker.entity;

/**
 * @author Lenovo
 *
 */
public class Requisition {

	private int requisitionNumber;
	private String requisiotionName;
	private String courseType;
	private int trainingDurection;
	
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
	 * @return requisiotionName
	 */
	public String getRequisiotionName() {
		return requisiotionName;
	}
	/**
	 * @param requisiotionName
	 */
	public void setRequisiotionName(String requisiotionName) {
		this.requisiotionName = requisiotionName;
	}
	/**
	 * @return courseType
	 */
	public String getCourseType() {
		return courseType;
	}
	/**
	 * @param courseType
	 */
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	/**
	 * @return trainingDurection
	 */
	public int getTrainingDurection() {
		return trainingDurection;
	}
	/**
	 * @param trainingDurection
	 */
	public void setTrainingDurection(int trainingDurection) {
		this.trainingDurection = trainingDurection;
	}
	
	
}
