/**
 * 
 */
package ru.rsreu.tc.tracker.dao.person;

import ru.rsreu.tc.tracker.entity.Person;

/**
 * @author Lenovo
 *
 */
public interface PersonDAO {

	/**
	 * @param personID
	 * @return person
	 */
	public Person findPerson(int personID);

	/**
	 * @param personID 
	 * @param lastname 
	 * @param name 
	 * @param patronimyc 
	 * @param e_mail 
	 * @param skype 
	 * @param phone 
	 * @param army 
	 * @param workPlace 
	 * @param TA_englishLevel 
	 * @param S_englishLevel 
	 * @param W_englishLevel 
	 * @param attractionChannel 
	 * @return personID
	 */
	public int insertPerson(int personID, String lastname, String name, String patronimyc, String e_mail, String skype,
			int phone, String army, String workPlace, String TA_englishLevel, String S_englishLevel, String W_englishLevel, String attractionChannel);
    /**
     * @param lastname
     * @return true or false
     */
    public boolean deletePerson(String lastname);
    

	/**
	 * @param personID
	 * @param lastname
	 * @param name
	 * @param patronimyc
	 * @param e_mail
	 * @param skype
	 * @param phone
	 * @param army
	 * @param workPlace
	 * @param TA_englishLevel
	 * @param S_englishLevel
	 * @param W_englishLevel
	 * @param attractionChannel
	 * @return true or false
	 */
	boolean updatePerson(int personID, String lastname, String name, String patronimyc, String e_mail, String skype,
			int phone, String army, String workPlace, String TA_englishLevel, String S_englishLevel,
			String W_englishLevel, String attractionChannel);

}
