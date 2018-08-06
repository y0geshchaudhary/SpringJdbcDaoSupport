package com.yogesh;


import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/*@Repository*/
public class PersonDAO extends JdbcDaoSupport {

	public List<PersonDTO> selectAll() 
	{
		System.out.println("Into DAO");
		List<PersonDTO> list =getJdbcTemplate().query("select * from person", new PersonRowMapper());
		System.out.println("size is : " + list.size());
		
		
		return list;
	}
	
}
