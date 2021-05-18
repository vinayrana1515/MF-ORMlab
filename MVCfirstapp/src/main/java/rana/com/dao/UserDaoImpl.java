package rana.com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import rana.com.models.User;
import rana.com.models.UserData;



//class UserMapper implements RowMapper<UserData>{
//	
//	@Override
//	public UserData mapRow(ResultSet rs, int rowNum) throws SQLException {
//		// TODO Auto-generated method stub
//		
//		UserData user = new UserData();
//		 user.setEmail(rs.getString("email"));
//         user.setPwd(rs.getString("pwd"));
//         user.setName(rs.getString("name"));
//         user.setPhone(rs.getString("phone"));
//         user.setAge(rs.getInt("age"));
//		return   user;
//		
//		
//	}
//	
//}

@Repository
public class UserDaoImpl implements UserDao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public void saveOrUpdate(UserData user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserData get(String email) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM user where email='" + email + "'";
	    return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(UserData.class));
	
	}

	@Override
	public List<UserData> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
