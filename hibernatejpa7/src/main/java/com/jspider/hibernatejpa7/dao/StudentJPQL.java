package com.jspider.hibernatejpa7.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernatejpa7.dto.StudentDTO;
import com.mysql.cj.Query;

public class StudentJPQL {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	public static void main(String[] args) {
		openConnection();
		entityTransaction.begin();
		
		List<StudentDTO> students=findAll();
		for(StudentDTO student:students)
		{
			System.out.println(student);
		}
		
		entityTransaction.commit();
		closeConnection();
		
	}
	private static List<StudentDTO> findAll()
	{
		javax.persistence.Query query=entityManager.createQuery("SELECT student FROM StudentDTO student");
		@SuppressWarnings("unchecked")
		List<StudentDTO> students=query.getResultList();
		return students;
		
		
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
