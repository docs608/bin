package controller;

import model.Center;
import service.CenterService;

public class CenterController {
	CenterService centerService = new CenterService();
	
	public boolean create(Center center) {
		return centerService.create(center);
	}
	
	public boolean update(Center center) {
		return centerService.update(center);
	}
	
	public Center find(Integer id) {
		return centerService.find(id);
	}
	
	public boolean delete(Integer id) {
		return centerService.delete(id);
	}
}
