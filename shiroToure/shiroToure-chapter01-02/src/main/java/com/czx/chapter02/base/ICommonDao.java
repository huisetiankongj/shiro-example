package com.czx.chapter02.base;

import java.util.List;
import java.util.Map;

public interface ICommonDao {

	public void update(String sql);
	public int insert(String... sql);
	public String queryForObject(String sql);
	public int queryForInt(String sql);
	public List<Map<String, Object>> queryForList(String sql);
	public void batchUpdate(String[] sql);
	public List<String> queryForList(String sql, Object ...args);
	public Map<String, Object> queryForMap(String sql,Object ...args);
}
