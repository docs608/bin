import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controller.CenterController;
import controller.MemberController;
import model.Center;
import model.Member;
import service.CenterService;

public class ControllerTest {
	
	public CenterController centerController = new CenterController();
	public MemberController memberController = new MemberController();
	
	@Test
	public void TestCenterNull() {
		assertTrue(!centerController.create(null));
	}
	
	@Test
	public void TestCenterNotNull() {
		Center center = new Center();
		center.setId(1);
		center.setCenterName("abc");
		center.setCenterEmail("abc@gmail.com");
		center.setCenterAddress("sector - abc, bangalore");
		assertTrue(centerController.create(center));
	}
	
	@Test
	public void TestMemberNull() {
		assertTrue(!memberController.create(null));
	}
	
	@Test
	public void TestMemberNotNull() {
		Member member = new Member();
		member.setId(1);
		member.setName("member1");
		member.setEmail("member1@gmail.com");
		member.setPhone("11111111");
		member.setPassword("password1");
		member.setAddress("member1, bangalore");
		assertTrue(memberController.create(member));
	}
	
}
