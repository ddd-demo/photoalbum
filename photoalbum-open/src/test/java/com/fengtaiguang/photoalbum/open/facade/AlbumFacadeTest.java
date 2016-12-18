package com.fengtaiguang.photoalbum.open.facade;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.application.service.IAlbumApplicationService;

@ContextConfiguration(locations = "classpath*:spring-*.xml")
public class AlbumFacadeTest extends  AbstractJUnit4SpringContextTests {
	@Inject
	IAlbumFacade albumFacade;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSave() {
		
		//System.out.println("alid=" + albumFacade.get("al001"));
	}

}
