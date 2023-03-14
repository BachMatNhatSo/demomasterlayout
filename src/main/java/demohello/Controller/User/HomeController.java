package demohello.Controller.User;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demohello.Dao.SlidesDao;
import demohello.Model.Student;

@Controller
public class HomeController {

	@Autowired
	SlidesDao homedao;

	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index(HttpSession session, ModelMap model) {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides",homedao.GetDataSlides());
		return mv;
	}

	@RequestMapping(value = { "/product" }, method = RequestMethod.GET)
	public String IndexProduct(HttpSession session, ModelMap model) {

		return "user/product";
	}
}
