package com.Amazon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AmazonOrderRepo extends JpaRepository<AmazonOrderEntity,Integer>{
	@Query(value="select orderlist.city,product.name from amazon.orderlist join amazon.product on orderlist.orderid=product.order_fk",nativeQuery = true)
	
	public List<Object> getbyquery();

}
