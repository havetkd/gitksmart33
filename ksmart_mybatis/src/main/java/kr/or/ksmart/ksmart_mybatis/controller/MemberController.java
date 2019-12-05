package kr.or.ksmart.ksmart_mybatis.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ksmart.ksmart_mybatis.service.MemberService;
import kr.or.ksmart.ksmart_mybatis.vo.Member;

@Controller
public class MemberController {
	
	@Autowired MemberService memberservice;
	//로그아웃 처리
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		
	}
	//로그인 처리
	@GetMapping("/login")
	public String login() {
		return "/login/login";
		
	}
	@PostMapping("/login")
	public String login(Member member,HttpSession session,Model model){
		session.setAttribute("SID", member.getMemberId());
		System.out.println("member->"+member);
	
		model.addAttribute("member", member.getMemberId());
		return "redirect:/";
	}
	
	
	//컨테이너 get방식에 주소요청을 정의	
	@GetMapping("/memberList")
	public String gtMemberList(Model model) {
		model.addAttribute("memberList", memberservice.MemberList());
		return "/member/memberList";
	
	}
	
	//회원가입화면
	@GetMapping("/memberinsert")
	public String getMemberinsert(Model model) {
		
		return "/member/memberinsert";
		
	}
	
	@PostMapping("/memberinsert")
	public String addMembr(Member member) {
		System.out.println("member-->" + member.toString());
		memberservice.addMember(member);
		
		return "redirect:/memberList";
		
	}
	//수정 화면
	@GetMapping("/updateM")
	public String selectByMember(@RequestParam(value = "memberId") String memberId, Model model) {
		System.out.println("memberId- >"+memberId);
		model.addAttribute("member", memberservice.selectByMember(memberId));
		memberservice.selectByMember(memberId);
		return "/member/updateM";
		
	}
	//수정처리
	@PostMapping("/updateM")
	public String updateM(Member member) {
		System.out.println("member-->" + member.toString());
		memberservice.updateM(member);
		return "redirect:/memberList";
		
	}
	//삭제화면
	@GetMapping("/delet")
	public String delMember(@RequestParam(value="memberId")String memberId, Model model) {
		model.addAttribute("memberId", memberId);
		
		return "/member/delet";
	}
	//삭제처리
	@PostMapping("/delet")
	public String delMember(Member member,Model model) {
		
		int result = memberservice.delMember(member.getMemberId(),member.getMemberPw());

		if(result == 0) {
		model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
		model.addAttribute("memberId", member.getMemberId());
		return "/member/delet";
		}
		
		return "redirect:/memberList";
	}
	
	
	
	
	

	
	
	

}
