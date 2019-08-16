package dao.impl;

import java.util.logging.Logger;

import dao.MemberDao;
import database.Database;
import model.*;

public class MemberDaoImpl implements MemberDao {

    private static final Logger logger = Logger.getLogger(MemberDaoImpl.class.getName());

    public void create(Member member) {
    	Database.memberTable.put(member.getId(), member);
    }

    public void update(Member member) {
    	Database.memberTable.put(member.getId(), member);
    }

    public Member findById(int id) {
    	return Database.memberTable.get(id);
    }

    public void delete(int id) {
    	Database.memberTable.remove(id);
    }

}
