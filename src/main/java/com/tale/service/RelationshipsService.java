package com.tale.service;

import java.util.List;

import com.blade.jdbc.core.Take;
import com.blade.jdbc.model.Paginator;

import com.tale.model.Relationships;

public interface RelationshipsService {
	
	Relationships getRelationshipsById(Integer cid);

	List<Relationships> getRelationshipsList(Take take);
	
	Paginator<Relationships> getRelationshipsPage(Take take);

	void update(Relationships relationships) throws Exception;

	void save(Relationships relationships) throws Exception;
	
	void delete(Integer cid) throws Exception;
		
}
