package com.jspider.onetoonebid.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.onetoonebid.dto.AdharDTO;
import com.jspider.onetoonebid.dto.PersonDTO;


public class PersonDAO {
  private static EntityManagerFactory entityManagerFactory;
  private static EntityManager entityManager;
  private static EntityTransaction entityTransaction;
  public static void main(String[] args) {
	  PersonDTO person=new PersonDTO();
	person.setName("Ram");
	person.setEmail("ram@gmail.com");
	person.setMobile(9156397169l);
	AdharDTO adhar=new AdharDTO();
	
	adhar.setAadharNumber(220788026143l);
	
	person.setAadhar(adhar);
	adhar.setPerson(person);
	openConnection();
	entityTransaction.begin();
	entityManager.persist(adhar);
	entityManager.persist(person);
	entityTransaction.commit();
	closeConnection();
}
  private static void openConnection()
  {
      entityManagerFactory=Persistence.createEntityManagerFactory("person");
      entityManager=entityManagerFactory.createEntityManager();
      entityTransaction=entityManager.getTransaction();
  }
  private static void closeConnection()
  {
	if(entityManagerFactory !=null)
	{
		entityManagerFactory.close();
	}
	if(entityManager !=null)
	{
		entityManager.close();
	}
	if(entityTransaction !=null)
	{
		if(entityTransaction.isActive())
		{
			entityTransaction.rollback();
		}
	}
  }
}
