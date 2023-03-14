package demohello.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import demohello.Entity.MapperSlides;
import demohello.Entity.Slides;

@Repository
public class SlidesDao {
	@Autowired
	public JdbcTemplate _jbJdbcTemplate;

	public List<Slides> GetDataSlides() {
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jbJdbcTemplate.query(sql, new MapperSlides());
		return list;
	}

}
