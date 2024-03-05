package com.jspider.hibernatejpa7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa7.dto.StudentDTO;

public class StudentUpdate {
	private static EntityManagerFactory emfEntityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		StudentDTO studentDTO = entityManager.find(StudentDTO.class, 1);
		studentDTO.setMobile(9763117169l);
		entityManager.persist(studentDTO);
		entityTransaction.commit();
		closeConnection();
		//for DML operations begin the transaction and commit the transaction is  if we skip one of the step it will not going to work 
		
		
	}
	private static void openConnection()
	{
		emfEntityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=emfEntityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	private static void closeConnection()
	{
		if(emfEntityManagerFactory !=null)
		{
			emfEntityManagerFactory.close();
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
