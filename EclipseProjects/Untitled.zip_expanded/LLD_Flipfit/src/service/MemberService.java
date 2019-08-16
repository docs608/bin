package service;

import dao.MemberDao;
import dao.impl.MemberDaoImpl;
import model.Member;

public class MemberService {
	
	MemberDao memberDao = new MemberDaoImpl();

	public boolean create(Member member) {
		if (member == null) {
			return false;
		} else {
			Member memberTemp = find(member.getId());
			if (memberTemp != null) {
				return false;
			} else {
				memberDao.create(member);
				return true;
			}
		}
	}
	
	public boolean update(Member member) {
		Member memberTemp = find(member.getId());
		if (memberTemp == null) {
			return false;
		} else {
			memberDao.update(member);
			return true;
		}
	}
	
	public Member find(Integer id) {
		return memberDao.findById(id);
	}
	
	public boolean delete(Integer id) {
		memberDao.delete(id);
		return true;
	}
	
}
