package com.fengtaiguang.photoalbum.application.adaper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.domain.entity.Album;
import com.fengtaiguang.photoalbum.domain.factory.AlbumFactory;

@Component
public class AlbumAdaper implements IAlbumAdaper {

	public Album toAlbum(AlbumDto albumDto, Album album) {
		album.setId(albumDto.getId());
		album.setName(albumDto.getName());
		album.setNumber(albumDto.getNumber());
		album.setDescription(albumDto.getDescription());
		album.setUserId(albumDto.getUserId());
		return album;
	}

	public Album toAlbum(AlbumDto albumDto) {
		Album album = AlbumFactory.getInstace().createAlbum();
		album.setId(albumDto.getId());
		album.setName(albumDto.getName());
		album.setNumber(albumDto.getNumber());
		album.setDescription(albumDto.getDescription());
		album.setUserId(albumDto.getUserId());
		return album;
	}

	public AlbumDto toAlbumDto(Album album) {
		AlbumDto albumDto = new AlbumDto();
		albumDto.setId(album.getId());
		albumDto.setName(album.getName());
		albumDto.setNumber(album.getNumber());
		albumDto.setDescription(album.getDescription());
		albumDto.setUserId(album.getUserId());
		return albumDto;
	}
 
	public List<AlbumDto> toAlbumDtoList(List<Album> albumList) {
		List list = new ArrayList();
		for (int i = 0; i < albumList.size(); i++) {
			list.add(toAlbumDto(albumList.get(i)));
		} 
		return list;
	}

}
