/**
 * 
 */
package ru.rsreu.tc.tracker.entity;

import java.io.Serializable;

/**
 * @author Lenovo
 *
 */
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personID;
	private String lastname;
	private String name;
	private String patronimyc;
	private String e_mail;
	private String skype;
	private int phone;
	private String army;
	private String workPlace;
	private String TA_englishLevel;
	private String S_englishLevel;
	private String W_englishLevel;
	private String attractionChannel;

	/**
	 * @return personID
	 */
	public int getPersonID() {
		return personID;
	}

	/**
	 * @param personID
	 */
	public void setPersonID(int personID) {
		this.personID = personID;
	}

	/**
	 * @return lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return patronimyc
	 */
	public String getPatronimyc() {
		return patronimyc;
	}

	/**
	 * @param patronimyc
	 */
	public void setPatronimyc(String patronimyc) {
		this.patronimyc = patronimyc;
	}

	/**
	 * @return e_mail
	 */
	public String getE_mail() {
		return e_mail;
	}

	/**
	 * @param e_mail
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	/**
	 * @return skype
	 */
	public String getSkype() {
		return skype;
	}

	/**
	 * @param skype
	 */
	public void setSkype(String skype) {
		this.skype = skype;
	}

	/**
	 * @return phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return army
	 */
	public String getArmy() {
		return army;
	}

	/**
	 * @param army
	 */
	public void setArmy(String army) {
		this.army = army;
	}

	/**
	 * @return workPlace
	 */
	public String getWorkPlace() {
		return workPlace;
	}

	/**
	 * @param workPlace
	 */
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	/**
	 * @return TA_englishLevel
	 */
	public String getTA_englishLevel() {
		return TA_englishLevel;
	}

	/**
	 * @param tA_englishLevel
	 */
	public void setTA_englishLevel(String tA_englishLevel) {
		TA_englishLevel = tA_englishLevel;
	}

	/**
	 * @return S_englishLevel
	 */
	public String getS_englishLevel() {
		return S_englishLevel;
	}

	/**
	 * @param s_englishLevel
	 */
	public void setS_englishLevel(String s_englishLevel) {
		S_englishLevel = s_englishLevel;
	}

	/**
	 * @return W_englishLevel
	 */
	public String getW_englishLevel() {
		return W_englishLevel;
	}

	/**
	 * @param w_englishLevel
	 */
	public void setW_englishLevel(String w_englishLevel) {
		W_englishLevel = w_englishLevel;
	}

	/**
	 * @return attractionChannel
	 */
	public String getAttractionChannel() {
		return attractionChannel;
	}

	/**
	 * @param attractionChannel
	 */
	public void setAttractionChannel(String attractionChannel) {
		this.attractionChannel = attractionChannel;
	}

}
