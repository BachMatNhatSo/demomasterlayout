package demohello.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demohello.Dao.SlidesDao;
import demohello.Entity.Slides;

@Service
public class HomeImplService implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;

	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

}
