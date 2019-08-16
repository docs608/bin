package service;

import dao.CenterDao;
import dao.impl.CenterDaoImpl;
import model.Center;

public class CenterService {
	
	CenterDao centerDao = new CenterDaoImpl();

	public boolean create(Center center) {
		if (center == null) {
			return false;
		} else {
			Center centerTemp = find(center.getId());
			if (centerTemp != null) {
				return false;
			} else {
				centerDao.create(center);
				return true;
			}
		}
	}
	
	public boolean update(Center center) {
		Center centerTemp = find(center.getId());
		if (centerTemp == null) {
			return false;
		} else {
			centerDao.update(center);
			return true;
		}
	}
	
	public Center find(Integer id) {
		return centerDao.findById(id);
	}
	
	public boolean delete(Integer id) {
		centerDao.delete(id);
		return true;
	}
	
}
