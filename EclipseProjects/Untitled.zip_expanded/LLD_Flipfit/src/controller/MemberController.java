package controller;

import model.Member;
import service.MemberService;

public class MemberController {
	MemberService memberService = new MemberService();
	
	public boolean create(Member member) {
		return memberService.create(member);
	}
	
	public boolean update(Member member) {
		return memberService.update(member);
	}
	
	public Member find(Integer id) {
		return memberService.find(id);
	}
	
	public boolean delete(Integer id) {
		return memberService.delete(id);
	}
}
