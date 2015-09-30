package com.tg.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.tg.common.GetEntityClassUtil;
import com.tg.common.Pager;
import com.tg.dao.Idao;

public abstract class AbstractBaseDao<T, PK extends Serializable> implements
		BaseDao<T, PK> {
	Class entityClass = GetEntityClassUtil.getEntityClass(getClass());
	@Resource
	private Idao<T, Serializable> idao;

	public void save(T entity) {
		idao.save(entity);
	}

	public void delete(PK pk) {
		idao.delete(entityClass, pk);
	}

	public void update(T entity) {
		idao.update(entity);
	}

	public T findById(PK pk) {
		return idao.findById(entityClass, pk);
	}

	public List<T> findAll() {
		return idao.findAll(entityClass);
	}
	
	public Pager<T> findByPage(int pageNo,int pageSize) {
		return idao.findByPage(entityClass, pageNo, pageSize);
	}
	
	public void updateOrder(T entity) {
		idao.updateOrder(entity);
	}
	
	public T login(T entity) {
		return idao.login(entity);
	}
	
	public Pager<T> findByPage(int pageNo,int pageSize,Object key) {
		return idao.findByPage(entityClass, pageNo, pageSize, key);
	}
	
	public Pager<T> findByKey(Map<String, Object> maps,String operate) {
		return idao.findByKey(entityClass, maps, operate);
	}
	public int isExist(Map<String, Object> maps,String operate) {
		return idao.isExist(entityClass, maps, operate);
	}
	
	public T findByParam(Map<String, Object> maps,String operate) {
		return idao.findByParam(entityClass, maps, operate);
	}
	
	public List<T> findAllByKey(Map<String, Object> maps,String operate) {
		return idao.findAllByKey(entityClass, maps, operate);
	}
}
