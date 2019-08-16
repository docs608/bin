package dao.impl;

import java.util.logging.Logger;

import dao.CenterDao;
import database.Database;
import model.*;

public class CenterDaoImpl implements CenterDao {

    private static final Logger logger = Logger.getLogger(CenterDaoImpl.class.getName());

    public void create(Center center) {
    	Database.centerTable.put(center.getId(), center);
    }

    public void update(Center center) {
    	Database.centerTable.put(center.getId(), center);
    }

    public Center findById(int id) {
    	return Database.centerTable.get(id);
    }

    public void delete(int id) {
    	Database.centerTable.remove(id);
    }

}
