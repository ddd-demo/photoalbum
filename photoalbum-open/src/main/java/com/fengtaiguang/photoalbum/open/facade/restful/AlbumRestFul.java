package com.fengtaiguang.photoalbum.open.facade.restful;

import java.util.List;

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

	@RequestMapping("edit/{id}")
	public AlbumDto edit(@PathVariable String id) {
		System.out.println("..get id=" + id);
		AlbumDto albumDto = albumFacade.get(id);
		return albumDto;
	}

	@RequestMapping("update")
	public AlbumDto update(@RequestBody AlbumDto albumDto) {
		albumFacade.update(albumDto);
		return albumDto;
	}

	@RequestMapping("delete/{id}")
	public Boolean delete(@PathVariable String id) {
		AlbumDto albumDto = new AlbumDto();
		albumDto.setId(id);
		albumFacade.delete(albumDto);
		return true;
	}

	@RequestMapping("get/{id}")
	public AlbumDto get(@PathVariable String id) {
		System.out.println("..get id=" + id);
		AlbumDto albumDto = albumFacade.get(id);
		return albumDto;
	}

	@RequestMapping("find")
	public List<AlbumDto> find(@RequestBody AlbumDto albumDto) {
		List<AlbumDto> list = albumFacade.findAll();
		return list;
	}
}
