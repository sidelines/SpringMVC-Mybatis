package com.tg.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.tg.common.Pager;

public interface BaseDao<T,PK extends Serializable> {
	/**
	 * 增加
	 * @param entity
	 */
   public void save(T entity);
   /**
    * 删除
    * @param pk
    */
   public void delete(PK pk);
   /**
    * 修改
    * @param entity
    */
   public void update(T entity);
   /**
    * 查询 按ID
    * @param pk
    */
   public T findById(PK pk);
   /**
    * 查询全部信息
    * @return
    */
   public List<T> findAll();
   /**
    * 分页
    * @param pageNo
    * @param pageSize
    * @return
    */
   public Pager<T> findByPage(int pageNo,int pageSize);
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
    * �?��条件的分�?
    * @param entityClass
    * @param pageNo
    * @param pageSize
    * @param key
    * @return
    */
   public Pager<T> findByPage(int pageNo,int pageSize,Object key);
   /**
    * 多条件的分页查询
    * @param maps
    * @param operate
    * @return
    */
   public Pager<T> findByKey(Map<String, Object> maps,String operate);
   /**
    * 判断某个值是否存�?
    * @param maps
    * @param operate
    * @return
    */
   public int isExist(Map<String, Object> maps,String operate);
   /**
    * 通过�?��参数取到对应的对�?
    * @param maps
    * @param operate
    * @return
    */
   public T findByParam(Map<String, Object> maps,String operate);
   /**
    * 通过条件查询全部内容
    * @param maps
    * @param operate
    * @return
    */
   public List<T> findAllByKey(Map<String, Object> maps,String operate);
   
}
