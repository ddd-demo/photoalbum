package com.fengtaiguang.photoalbum.open.facade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.application.service.IAlbumApplicationService;
import com.fengtaiguang.photoalbum.domain.entity.Album;

@Service("albumFacade")
public class AlbumFacadeImpl implements IAlbumFacade {
	@Inject
	@Named("albumApplicationService")
	private IAlbumApplicationService albumApplicationService;
	
	@Override
	public void save(AlbumDto albumDto) {
		albumApplicationService.save(albumDto);
	}

	@Override
	public void update(AlbumDto albumDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(AlbumDto albumDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public AlbumDto get(String albumId) {
		// TODO Auto-generated method stub
		return albumApplicationService.get(albumId);
	}

	@Override
	public List<AlbumDto> findAll() {
		// TODO Auto-generated method stub
		return albumApplicationService.findAll();
	}

	@Override
	public List<AlbumDto> findByName(String albumName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void meger(Album newAlbum, Album... albums) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort(Album... albums) {
		// TODO Auto-generated method stub
		
	}

}
