package com.czx.chapter02.base;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CommonDaoImpl extends JdbcDaoSupport implements ICommonDao {

	@Override
	public void update(String sql) {
		this.getJdbcTemplate().update(sql);
	}

	@Override
	public int insert(String... sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String queryForObject(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int queryForInt(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> queryForList(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void batchUpdate(String[] sql) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> queryForList(String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> queryForMap(String sql, Object... args) {
		// TODO Auto-generated method stub
		return null;
	}

}
