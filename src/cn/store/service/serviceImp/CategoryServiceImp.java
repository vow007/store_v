package cn.store.service.serviceImp;

import java.util.List;

import cn.store.dao.CategoryDao;
import cn.store.dao.daoImp.CategoryDaoImp;
import cn.store.domain.Category;
import cn.store.service.CategoryService;
import cn.store.utils.JedisUtils;
import redis.clients.jedis.Jedis;

public class CategoryServiceImp implements CategoryService {

	CategoryDao CategoryDao=new CategoryDaoImp();
	@Override
	public List<Category> getAllCats() throws Exception {
		return CategoryDao.getAllCats();
	}

	@Override
	public void addCategory(Category c) throws Exception {
		//本质是向MYSQL插入一条数据
		CategoryDao.addCategory(c);
		//更新redis缓存
		Jedis jedis = JedisUtils.getJedis();
		jedis.del("allCats");
		JedisUtils.closeJedis(jedis);
	}

}
