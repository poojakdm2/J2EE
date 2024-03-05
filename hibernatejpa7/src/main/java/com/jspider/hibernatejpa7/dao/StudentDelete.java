package com.jspider.hibernatejpa7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa7.dto.StudentDTO;

public class StudentDelete {
	private static EntityManagerFactory entiyEntityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		
		StudentDTO studentDTO = entityManager.find(StudentDTO.class,3 );
		entityManager.remove(studentDTO);
		
		entityTransaction.commit();
		closeConnection();
		
		
	}
	public static void openConnection()
	{
	 entiyEntityManagerFactory=Persistence.createEntityManagerFactory("student");
	 entityManager=entiyEntityManagerFactory.createEntityManager();
	 entityTransaction=entityManager.getTransaction();
	}
	public static void closeConnection()
	{
		if(entiyEntityManagerFactory !=null)
		{
			entiyEntityManagerFactory.close();
			
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
