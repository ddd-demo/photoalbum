package com.fengtaiguang.photoalbum.open.facade.restful;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fengtaiguang.photoalbum.application.dto.AlbumDto;
import com.fengtaiguang.photoalbum.open.facade.IAlbumFacade;

//这层的目的就是为了开发HTTP RESTFUL的接口!
@RestController
@RequestMapping("/open/album/")
public class AlbumRestFul {
	@Inject
	private IAlbumFacade albumFacade;

	@RequestMapping("save")
	public AlbumDto save(@RequestBody AlbumDto albumDto) {

		System.out.println("albumDto=" + albumDto);
		albumFacade.save(albumDto);
		return albumDto;
	}

	@RequestMapping("get/{id}")
	public AlbumDto get(@PathVariable String id) {

		System.out.println("..get id=" + id);
		AlbumDto albumDto = albumFacade.get(id);
		return albumDto;
	}
}
