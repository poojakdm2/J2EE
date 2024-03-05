package com.jspider.hibernatejpa7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa7.dto.StudentDTO;

public class StudentSelect {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		StudentDTO studentDTO = entityManager.find(StudentDTO.class, 1);
		System.out.println(studentDTO);
		entityTransaction.commit();
		closeConnection();
		//for select operation begin the transaction and commit the transaction is not mandatory.
		
	}
	private static void  openConnection()

	{
	  entityManagerFactory=Persistence.createEntityManagerFactory("student");
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
