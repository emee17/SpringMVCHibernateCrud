package org.service;

import java.util.List;

import org.dao.IdiotDao;
import org.pojo.Idiot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("idiotService")
public class IdiotService {

	@Autowired
	IdiotDao idiotDao;
	
	public void setIdiotdao(IdiotDao idiotdao) {
		this.idiotDao = idiotdao;
	}

	public int addIdiot(Idiot idiot) 
	{
		return idiotDao.addIdiot(idiot);
	}

	public List<Idiot> getAllIdiots() 
	{
		
		return idiotDao.getAllIdiots();
	}

	public Idiot getIdiotById(String email) {
		
		return idiotDao.getIdiotById(email);
	}
	public void updateIdiot(Idiot idiot)
	{
		idiotDao.updateIdiot(idiot);
	}

	public void deletetByEmail(String email) {
		idiotDao.deletetByEmail(email);
		
	}

}