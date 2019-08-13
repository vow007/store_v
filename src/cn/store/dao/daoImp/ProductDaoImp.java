package cn.store.dao.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.store.dao.ProductDao;
import cn.store.domain.Product;
import cn.store.utils.JDBCUtils;
import cn.store.utils.StringUtil;

public class ProductDaoImp implements ProductDao {

	@Override
	public List<Product> findAllProductsWithPage(int startIndex, int pageSize) throws Exception {
		String sql="select * from product limit  ? , ?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanListHandler<Product>(Product.class),startIndex,pageSize);
	}

	@Override
	public int findTotalRecords() throws Exception {
		String sql="select count(*) from product";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		Long num=(Long)qr.query(sql, new ScalarHandler());
		return num.intValue();
	}

	@Override
	public Product findProductByPid(String pid) throws Exception {
		String sql="select * from product where pid=?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanHandler<Product>(Product.class),pid);
	}

	
	
	@Override
	public List<Product> findHots() throws Exception {
		String sql="SELECT * FROM product WHERE pflag=0 AND is_hot=1 ORDER BY pdate DESC LIMIT 0 ,11 ";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanListHandler<Product>(Product.class));
	}

	@Override
	public List<Product> findNews() throws Exception {
		String sql="SELECT * FROM product WHERE pflag=0 ORDER BY pdate DESC LIMIT 0 , 11 ";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanListHandler<Product>(Product.class));
		
	}

	@Override
	public List findProductsByCidWithPage(String cid, int startIndex, int pageSize) throws Exception {
		String sql="select * from product where cid=? limit ? , ?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanListHandler<Product>(Product.class),cid,startIndex,pageSize);
	}

	
	@Override
	public List findProductsByPnameWithPage(String pname, int startIndex, int pageSize) throws Exception {
		// TODO Auto-generated method stub
	/*	StringBuffer sql=new StringBuffer("select * from product where pname  ");
				if(StringUtil.isNotEmpty(pname)){
					sql.append("like '%"+"?"+"%'+limit ?,?");
						}
          */
		/*List <String>list=new ArrayList<String>(); 
		if (pname != "") {
            //如果用户输入的pname不为空，那需要进行字符串拼接
            sql += "pname like ? ";
            //将用户输入的参数添加到集合
            list.add("%" + pname + "%"+"limit ?,?");
        }*/
		String sql="select * from product where pname =? limt ? ,?" ;
        System.out.println(sql);
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		//List list= qr.query(sql.toString(), new BeanListHandler<Product>(Product.class),pname,startIndex,pageSize);
        List list=qr.query(sql,new BeanListHandler<Product>(Product.class),pname,startIndex,pageSize);
		System.out.println("搜索的结果："+list);
		return list;
	}

	

	
	//查询该类别下的总数
	@Override
	public int findTotalRecords(String cid) throws Exception {
		String sql="select count(*) from product where cid =?";
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		Long num=(Long)qr.query(sql, new ScalarHandler(),cid);
		return num.intValue();
	}
 
    //查询搜索的总数
	@Override
	public int findTotalRecordsByPname(String pname) throws Exception {
		//String sql="select count(*) from product where pname=?";
		/*List <String>list=new ArrayList<String>(); 
		if (pname != "") {
            //如果用户输入的pname不为空，那需要进行字符串拼接
            sql += "pname like ? ";
            //将用户输入的参数添加到集合
            list.add("%" + pname + "%");
        }*/

//		StringBuffer sql=new StringBuffer("select * from product where pname  ");
//		if(StringUtil.isNotEmpty(pname)){
//			sql.append("like '%"+"?"+"%'+limit ?,?");
//				}
		String sql="select count(*) from product where pname=?";
		System.out.println(sql);
		QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
		Long num=(Long)qr.query(sql.toString(), new ScalarHandler(),pname);
		System.out.println("搜索的结果：个数"+num);
		System.out.println("搜索的结果："+num.intValue());
		return num.intValue();
	}

}
