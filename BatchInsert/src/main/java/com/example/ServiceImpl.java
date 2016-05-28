package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class ServiceImpl {

	@Autowired
	IProjectDao dao;
	public void add()
	{
		List<Project> list = new ArrayList<Project>();
		
		for(int i = 0; i<100;i++)
		{
			Project p = new Project();
			p.setName("Moxie"+i);
			list.add(p);
		}
		
		dao.bulkSave(list);
		
	}
}
