package com.fengtaiguang.photoalbum.application.service;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import com.fengtaiguang.photoalbum.application.adaper.AlbumAdaper;
import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.domain.entity.Album;
import com.fengtaiguang.photoalbum.domain.factory.AlbumFactory;
import com.fengtaiguang.photoalbum.domain.service.IAlbumDomainService;

@Service("albumApplicationService")
public class AlbumApplicationServiceImpl implements IAlbumApplicationService {
	@Inject
	@Named("albumDomainService")
	private IAlbumDomainService albumDomainService;
	@Inject
	private AlbumAdaper albumAdaper;

	@Override
	public void save(AlbumDto albumDto) {
		// TODO Auto-generated method stub
		// fc.get
		// albumDto---->entity{User}
		// UserAggRoot userAggRoot=userAggRootFactory.getUserAggRoot();
		// userAggRoot.get(userId);====>User{userId.userName}===>entity

		// 在此只需要albumDto====》entity
		Album album = AlbumFactory.getInstace().createAlbum();
		albumAdaper.toAlbum(albumDto, album);
		album.setId(UUID.randomUUID().toString());
		album.save();

	}

	@Override
	public void update(AlbumDto albumDto) {
		// TODO Auto-generated method stub
		Album album = albumAdaper.toAlbum(albumDto);
		album.update();
	}

	@Override
	public void delete(AlbumDto albumDto) {
		// TODO Auto-generated method stub
		Album album = albumAdaper.toAlbum(albumDto);
		album.delete();
	}

	@Override
	public AlbumDto get(String id) {
		return albumAdaper.toAlbumDto(albumDomainService.findById(id));
	}

	@Override
	public List<AlbumDto> findAll() {
		// TODO Auto-generated method stub
		return albumAdaper.toAlbumDtoList(albumDomainService.findAll());
	}

	@Override
	public List<AlbumDto> findByName(String albumName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void meger(AlbumDto newAlbum, AlbumDto... albums) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sort(AlbumDto... albums) {
		// TODO Auto-generated method stub

	}

}
