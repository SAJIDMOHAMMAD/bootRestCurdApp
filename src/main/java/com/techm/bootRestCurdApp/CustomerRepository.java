package com.techm.bootRestCurdApp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerDetails, String> {
	CustomerDetails findBy_id(int _id);
}