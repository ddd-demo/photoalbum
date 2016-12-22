package com.fengtaiguang.photoalbum.domain.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.fengtaiguang.ddd.framwork.domain.repository.IRepository;
import com.fengtaiguang.photoalbum.domain.entity.Album;
import com.fengtaiguang.photoalbum.domain.factory.AlbumFactory;
import com.fengtaiguang.photoalbum.domain.service.IAlbumDomainService;

@Service("albumDomainService")
public class AlbumDomainServiceImpl implements IAlbumDomainService {
	private Logger logger=Logger.getLogger(this.getClass());
	@Inject
	@Named("daoTemplate")
	private IRepository<Album> daoTemplate;

	@Override
	public void sort(Album... albums) {
		// TODO Auto-generated method stub
		logger.debug("");
	}

	@Override
	public void meger(Album newAlbum, Album... albums) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return daoTemplate.findByExample(AlbumFactory.getInstace().createAlbum());
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return daoTemplate.get(Album.class, id);
	}

}
