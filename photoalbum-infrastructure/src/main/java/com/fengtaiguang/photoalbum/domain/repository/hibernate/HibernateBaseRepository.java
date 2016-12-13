package com.fengtaiguang.photoalbum.domain.repository.hibernate;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.fengtaiguang.ddd.framwork.domain.repository.IRepository;

@Repository("daoTemplate")
public class HibernateBaseRepository implements IRepository {

	@Inject
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(entity);
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(entity);
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(entity);
	}

	@Override
	public Object get(Class type, Serializable id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(type, id);
	}

	@Override
	public List<Object> findByExample(Object exampleEntity) {
		// TODO Auto-generated method stub
		return hibernateTemplate.findByExample(exampleEntity);
	}

}
