package com.oracle.labor.service;

import static org.hamcrest.CoreMatchers.instanceOf;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.labor.dao.BioMapper;
import com.oracle.labor.dao.ZjDwdjjdbMapper;
import com.oracle.labor.dao.ZjDwzpgzbMapper;
import com.oracle.labor.po.Bio;
import com.oracle.labor.po.ZjDwdjjdb;
import com.oracle.labor.po.ZjDwzpgzb;

@Service
public class DwdjService {
	
	private int i=3;
	@Autowired
	BioMapper BioDao;
	
	@Autowired
	ZjDwzpgzbMapper zjDwzpgzbDao;

	@Transactional
	public void AddBio(Bio bio) {
		i+=1;
		
		String str=String.valueOf(i);
		
		bio.setBioId(str);
		BioDao.insert(bio);
	}
	
	@Transactional
	public Bio getBio(String No) {
		
		return BioDao.selectByNo(No);
	};
	
	
	@Transactional
	public void AddZjDwzpgzb(ZjDwzpgzb zjDwzpgzb) {
		zjDwzpgzb.setZpgzbh("222");
		zjDwzpgzbDao.insert(zjDwzpgzb);
	}
	
}
