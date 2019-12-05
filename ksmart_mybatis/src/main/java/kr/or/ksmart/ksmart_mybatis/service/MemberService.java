package kr.or.ksmart.ksmart_mybatis.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.ksmart_mybatis.mapper.MemberMapper;
import kr.or.ksmart.ksmart_mybatis.vo.Member;

@Service
public class MemberService {
	@Autowired MemberMapper memberMapper;
	
	
	public List<Member> MemberList(){
		return memberMapper.getMemberList();
		
	}
	public int addMember(Member member){
		return memberMapper.addMember(member);
		
		
	}
	public Member selectByMember(String memberId) {
		return memberMapper.selectByMember(memberId);
	
		
	}
	public int updateM(Member member) {
		return memberMapper.updateM(member);
		
	}
	public int delMember(Member member) {
		return memberMapper.delMember(member);
	}
	public int delMember(String memberId, String memberPw) {		
		return memberMapper.delMember(memberId, memberPw);
	}
	public Member login(Member member) {
		return memberMapper.login(member);
	}

}
