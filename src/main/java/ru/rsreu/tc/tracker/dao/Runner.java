/**
 * 
 */
package ru.rsreu.tc.tracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.rsreu.tc.tracker.dao.person.PersonDAO;
import ru.rsreu.tc.tracker.entity.Person;

/**
 * @author Lenovo
 *
 */
public class Runner {
	@Autowired
	private DAOFactory daoFactory;

	public DAOFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

		Runner runner = ctx.getBean(Runner.class);
		DAOFactory daoFactory2 = runner.getDaoFactory();
		System.out.println(daoFactory2);
		PersonDAO personDAO = daoFactory2.getPersonDAO();
		Person person = personDAO.findPerson(1);
		System.out.println(person.getLastname());

		// int i = personDAO.insertPerson(6, "Алексеев", "Илья", "Сергеевич",
		// "sd@mail.ru", "lon45", 231223, "Нет", "Приборный завод", "C1", "C1",
		// "C1", "Интернет");
		// boolean j = personDAO.deletePerson("Алексеев");
	}

}
