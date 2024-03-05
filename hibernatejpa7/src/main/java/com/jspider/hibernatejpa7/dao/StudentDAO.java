package com.jspider.hibernatejpa7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa7.dto.StudentDTO;

public class StudentDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	public static void main(String[] args) {
		openConnection();
	     entityTransaction.begin();
	     StudentDTO studentDTO=new StudentDTO();
	     studentDTO.setId(5);
	     studentDTO.setName("Vijay");
	     studentDTO.setEmail("vijay@gmail.com");
	     studentDTO.setMobile(9158397169l);
	     studentDTO.setAge(25);
	     entityManager.persist(studentDTO);
	     entityTransaction.commit();
		closeConnection();
		
	}
	private static void openConnection()
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
