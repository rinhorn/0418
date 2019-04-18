package game.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import game.model.domain.Member;
import game.model.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/admin/members", method=RequestMethod.GET)
	public List list() {
		List<Member> memberList=memberService.selectAll();
		return memberList;
	}
}