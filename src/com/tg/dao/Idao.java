package com.tg.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.tg.common.Pager;

public interface Idao<T,PK extends Serializable> {
	/**
	 * 增加
	 * @param entity
	 */
   public void save(T entity);
   /**
    * 删除
    * @param pk
    */
   public void delete(Class<T> entityClass,PK pk);
   /**
    * 修改
    * @param entity
    */
   public void update(T entity);
   /**
    * 查询 按ID
    * @param pk
    */
   public T findById(Class<T> entityClass,PK pk);
   /**
    * 查询全部信息
    * @return
    */
   public List<T> findAll(Class<T> entityClass);
   /**
    * 分页信息
    * @param entityClass
    * @param pageNo
    * @param pageSize
    * @return
    */
   public Pager<T> findByPage(Class<T> entityClass,int pageNo,int pageSize);
   /**
    * 排序
    * @param entity
    */
   public void updateOrder(T entity);
   /**
    * 登陆
    * @param entity
    * @return
    */
   public T login(T entity);
   /**
    * 带一个条件的分页
    * @param entityClass
    * @param pageNo
    * @param pageSize
    * @param key
    * @return
    */
   public Pager<T> findByPage(Class<T> entityClass,int pageNo,int pageSize,Object key); 
   /**
    * 带多条件的分�?
    * @param entityClass
    * @param maps
    * @param operate
    * @return
    */
   public Pager<T> findByKey(Class<T> entityClass, Map<String, Object> maps,String operate);
   /**
    * 判断某个值是否存�?
    * @param entityClass
    * @param maps
    * @param operate
    * @return
    */
   public int isExist(Class<T> entityClass,Map<String, Object> maps,String operate);
   /**
    * 通过�?��参数取到对应的对�?
    * @param entityClass
    * @param maps
    * @param operate
    * @return
    */
   public T findByParam(Class<T> entityClass,Map<String, Object> maps,String operate);
   /**
    * 根据条件 查询�?��内容
    * @param entityClass
    * @param maps
    * @param operate
    * @return
    */
   public List<T> findAllByKey(Class<T> entityClass, Map<String, Object> maps,String operate);
}
