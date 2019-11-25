package com.briup.cms.dao;

import com.briup.cms.bean.Customer;
import com.briup.cms.exception.CustomerException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<Customer,Integer> {
}
