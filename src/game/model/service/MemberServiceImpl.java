package game.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.model.domain.Member;
import game.model.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;

	public int insert(Member member) {
		return 0;
	}

	public List selectAll() {
		return memberDAO.selectAll();
	}


	public Member select(int member_id) {
		return null;
	}


	public void update(Member member) {
		
	}


	public void delete(int member_id) {
		
	}
}