package com.fengtaiguang.photoalbum.domain.repository.hibernate;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.fengtaiguang.ddd.framwork.domain.repository.IRepository;

@ContextConfiguration(locations = "classpath*:spring-*.xml")
public class HibernateBaseRepositoryTest extends AbstractJUnit4SpringContextTests {
	@Inject
	@Named("daoTemplate")
	IRepository daoTemplate;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSave() {
		System.out.println(daoTemplate);
	}

	@Test
	public void testDelete() {

	}

	@Test
	public void testUpdate() {

	}

	@Test
	public void testGet() {

	}

	@Test
	public void testFindByExample() {

	}

}
