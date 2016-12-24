package com.fengtaiguang.photoalbum.domain.repository.hibernate;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.fengtaiguang.ddd.framwork.domain.repository.IRepository;
import com.fengtaiguang.photoalbum.domain.entity.Album;

@ContextConfiguration(locations = "classpath*:spring-*.xml")
public class HibernateBaseRepositoryTest extends AbstractJUnit4SpringContextTests {
	@Inject
	@Named("daoTemplate")
	IRepository daoTemplate;
	private Logger logger = Logger.getLogger(this.getClass());

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testFindByExample() {
//		Album album=new Album();
//		album.setName("xc");
//		daoTemplate.findByExample(album);
	}

	@Test
	public void testSave() {

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

	
}
