package kr.or.ksmart.ksmart_mybatis.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.ksmart_mybatis.vo.Member;

@Mapper
public interface MemberMapper {
	//전체회원 리스트 조회
	public List<Member> getMemberList();
	
	//회원 등록
	//select를 제외한 모든것을 int 받는다.
	public int addMember(Member member);
	
	
	//회원 수정화면 처리
	public Member selectByMember(String memberId);
	
	//회원 수정 처리
	public int updateM(Member member);
	 //회원삭제 처리
	public int delMember(Member member);
	
	public int delMember(String memberId, String memberPw);
	
	//로그인 처리
	public Member login(Member member);

}
