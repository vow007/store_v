package cn.store.service.serviceImp;

import java.util.List;

import cn.store.dao.ProductDao;
import cn.store.dao.daoImp.ProductDaoImp;
import cn.store.domain.PageModel;
import cn.store.domain.Product;
import cn.store.service.ProductService;

public class ProductServiceImp implements ProductService {

	ProductDao ProductDao=new ProductDaoImp();
	
	@Override
	public Product findProductByPid(String pid) throws Exception {
		return ProductDao.findProductByPid(pid);
	}

	
/*	@Override
	public PageModel findProductsByPnameWithPage(String pname, int curNum) throws Exception {
		//1_创建PageModel对象 目的:计算分页参数
		//统计当前分类下商品个数  select count(*) from product where pname=?
		int totalRecords2=ProductDao.findTotalRecordsByPname(pname);
		PageModel pm2=new PageModel(curNum,totalRecords2,12);
		//2_关联集合 select * from product where pname =? limit ? ,?
		List list=ProductDao.findProductsByPnameWithPage(pname,pm2.getStartIndex(),pm2.getPageSize());
		pm2.setList(list);
		//3_关联url
		pm2.setUrl("ProductServlet?method=findProductsByPnameWithPage&pname="+pname);
		return pm2;
	}*/
     
	//搜索：
	
	
	public PageModel findProductsByPnameWithPage(String pname, int curNum) throws Exception {
		//1_创建PageModel对象 目的:计算分页参数
		//统计当前分类下商品个数  select count(*) from product where pname=?
		int totalRecords=ProductDao.findTotalRecordsByPname(pname);
		PageModel pm=new PageModel(curNum,totalRecords,12);
		//2_关联集合 select * from product where cid =? limit ? ,?
		List list=ProductDao.findProductsByPnameWithPage(pname,pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		//3_关联url
		pm.setUrl("ProductServlet?method=findProductsByCidWithPage&pname="+pname);
		return pm;
	}

	
	@Override
	public List<Product> findHots() throws Exception {
		return ProductDao.findHots();
	}

	@Override
	public List<Product> findNews() throws Exception {
		return ProductDao.findNews();
	}

	@Override
	public PageModel findProductsByCidWithPage(String cid, int curNum) throws Exception {
		//1_创建PageModel对象 目的:计算分页参数
		//统计当前分类下商品个数  select count(*) from product where cid=?
		int totalRecords=ProductDao.findTotalRecords(cid);
		PageModel pm=new PageModel(curNum,totalRecords,12);
		System.out.println("sevcice实现执行了");
		//2_关联集合 select * from product where cid =? limit ? ,?
		List list=ProductDao.findProductsByCidWithPage(cid,pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		System.out.println(pm);
		//3_关联url
		pm.setUrl("ProductServlet?method=findProductsByCidWithPage&cid="+cid);
		return pm;
	}

	@Override
	public PageModel findAllProductsWithPage(int curNum) throws Exception {
		//1_创建对象
		int totalRecords=ProductDao.findTotalRecords();
		PageModel pm=new PageModel(curNum,totalRecords,5);
		//2_关联集合 select * from product limit ? , ?
		List<Product> list=ProductDao.findAllProductsWithPage(pm.getStartIndex(),pm.getPageSize());
		pm.setList(list);
		//3_关联url
		pm.setUrl("AdminProductServlet?method=findAllProductsWithPage");
		return pm;
	}



}
