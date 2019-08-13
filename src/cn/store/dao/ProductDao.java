package cn.store.dao;

import java.util.List;

import cn.store.domain.Product;

public interface ProductDao {

	List<Product> findHots()throws Exception;

	List<Product> findNews()throws Exception;

	Product findProductByPid(String pid)throws Exception;
	

	int findTotalRecords(String cid)throws Exception;

	List findProductsByCidWithPage(String cid, int startIndex, int pageSize)throws Exception;
	
	List findProductsByPnameWithPage(String pname, int startIndex, int pageSize)throws Exception;

	int findTotalRecords()throws Exception;
	

	List<Product> findAllProductsWithPage(int startIndex, int pageSize)throws Exception;

	//搜索的结果总数：
	int findTotalRecordsByPname(String pname) throws Exception;


}
