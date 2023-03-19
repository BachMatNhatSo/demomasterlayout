package demohello.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demohello.Entity.Categorys;
import demohello.Entity.Menus;
import demohello.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides();
	@Autowired
	public List<Categorys> GetDataCategorys();
	@Autowired
	public List<Menus> GetDataMenus();
}
