package cn.store.service;

import java.util.List;

import cn.store.domain.PageModel;
import cn.store.domain.Product;

public interface ProductService {

	List<Product> findHots()throws Exception;

	List<Product> findNews()throws Exception;

	Product findProductByPid(String pid)throws Exception;
	
	PageModel findProductsByPnameWithPage(String Pname, int curNum)throws Exception;

	PageModel findProductsByCidWithPage(String cid, int curNum)throws Exception;

	PageModel findAllProductsWithPage(int curNum)throws Exception;

}
