package demohello.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demohello.Model.Student;

@Controller
public class HomeController {
	
	@RequestMapping(value={"/","/trang-chu"},method=RequestMethod.GET)
	public String Index(HttpSession session,ModelMap model) {
//		session.setAttribute("fname","Bách Mật Nhất Sơ");
//		model.addAttribute("salary","2000");
//		
//		Student st =new Student("Vĩnh Dạ",10);
//		model.addAttribute("student",st);
//		
//		List<String> list=new ArrayList<String>();
//		list.add("Lâm");
//		list.add("Binh");
//		list.add("Đấu");
//		list.add("Giả");
//		list.add("Giai");
//		list.add("Trận");
//		list.add("Liệt");
//		list.add("Tiền");
//		list.add("Hành");
//		model.addAttribute("items",list);
		return "user/index";
	}@RequestMapping(value={"/product"},method=RequestMethod.GET)
	public String IndexProduct(HttpSession session,ModelMap model) {
//		
		return "user/product";
	}
}
