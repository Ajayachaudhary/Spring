package com.SpringORM.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.SpringORM.entites.customers;

import jakarta.transaction.Transactional;

public class customerDao {

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insertData(customers customer) {
		Integer i = (Integer) this.hibernateTemplate.save(customer);
		return i;
	}
	
	//fetch single data from data using customer id
	public customers getdata (int customerid) {
		customers data = this.hibernateTemplate.get(customers.class, customerid);
		return data;
	}
	
	//fetch all data of customer from db
	
	public List<customers> getalldata(){
		List<customers> datas = this.hibernateTemplate.loadAll(customers.class);
		return datas;
	}
	
	//delete customer data from db
	
	@Transactional
	public void deletedata(int customerid) {
		customers cust = this.hibernateTemplate.get(customers.class, customerid);
		this.hibernateTemplate.delete(cust);
	}
	
	// update customer detail
	
	
	
	
	
}
