package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class QuestionController {
	// final 붙은 속성을 포함하는 생성자를 자동으로 만들어 줌
	private final QuestionRepository questionRepository;
	
	@GetMapping("/question/list")
//	@ResponseBody
	public String list(Model model) { //model 데이터를 담기 위한 객체, 그릇
		List<Question> questionList = this.questionRepository.findAll();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}
}
