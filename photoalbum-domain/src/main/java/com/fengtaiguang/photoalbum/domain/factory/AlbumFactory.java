package com.fengtaiguang.photoalbum.domain.factory;

import org.springframework.stereotype.Component;

import com.fengtaiguang.ddd.framwork.domain.factory.FactoryBase;
import com.fengtaiguang.photoalbum.domain.entity.Album;

//@ContextConfiguration(locations = "classpath:spring-repository-hibernate.xml")
@Component
public class AlbumFactory extends FactoryBase implements IAlbumFactory {

	@Override
	public Album createAlbum() {
		Album album = (Album) applicationContext.getBean("album");
		return album;
	}

	private AlbumFactory() {

	}

	public static IAlbumFactory getInstace() {
		return new AlbumFactory();
	}

}
