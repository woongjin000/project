package com.sbs.starter.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@RequestMapping("article/list")
	public String showList(Model model) {
		List<Article> list = articleService.getList();
		model.addAttribute("list", list);
		return "article/list";
	}
	
	@RequestMapping("article/add")
	public String showAdd() {
		return "article/add";
	}
	@RequestMapping("article/doAdd")
	@ResponseBody
	public String doAdd(@RequestParam Map<String, Object> param) {
		long newId = articleService.add(param);
		return newId + "번 게시물이 추가되었습니다.";
	}
}
