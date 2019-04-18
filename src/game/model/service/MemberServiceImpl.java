package game.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import game.common.exception.DeleteFailException;
import game.common.exception.EditFailException;
import game.model.domain.Member;
import game.model.repository.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	@Qualifier("mybatisMemberDAO")
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


	public void update(Member member) throws EditFailException{
		int result=memberDAO.update(member);
		if(result==0) {
			throw new EditFailException("수정 실패");
		}
	}


	public void delete(int member_id) throws DeleteFailException{
		int result=memberDAO.delete(member_id);
		if(result==0) {
			throw new DeleteFailException("삭제 실패");
		}
	}
}