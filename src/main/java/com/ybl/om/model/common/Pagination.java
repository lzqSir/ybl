package com.ybl.om.model.common;

import org.apache.ibatis.session.RowBounds;

/**
 * 一个分页对象默认实现
 * 
 * 使用方法:
 * 
 * 
 *********************************** 跳转到指定页数 ************************** Pagination p=new Pagination();
 * p.setPageSize(2); //每一页显示记录数为2 p.setGotoPage(3); //跳转到第3页 List<?> queryList=
 * SqlMapClientFactory
 * .getServerDBSqlMapProxy().queryForPaginatedList("selectAllChannels",param,p);
 * 调用 p.getRecordsCount()、p.getCurrentPage()、p.getTotalPages()等所有get方法返回分页结果
 * 调用queryList的到查询结果 ,0<=queryList.size()<=pageSize;
 * 
 *************************************** 跳转到第一页 ************************** Pagination p=new Pagination();
 * p.setPageSize(2); //每一页显示记录数为2 p.setGotoFirstPage(true); //设置为跳转第一页，等同于
 * p.setGotoPage(1); List<?> queryList=
 * SqlMapClientFactory.getServerDBSqlMapProxy
 * ().queryForPaginatedList("selectAllChannels",param,p); 调用
 * p.getRecordsCount()、p.getCurrentPage()、p.getTotalPages()等所有get方法返回分页结果
 * 调用queryList的到查询结果 ,0<=queryList.size()<=pageSize;
 * 
 ************************************** 跳转到最后一页 ************************* Pagination p=new Pagination();
 * p.setPageSize(2); //每一页显示记录数为2 p.setGotoLastPage(true); //设置为跳转最后一页，注意最好
 * 不要设置为 p.setGotoPage(上一次查询分页的totalPages);因为不准确 List<?> queryList=
 * SqlMapClientFactory
 * .getServerDBSqlMapProxy().queryForPaginatedList("selectAllChannels",param,p);
 * 调用 p.getRecordsCount()、p.getCurrentPage()、p.getTotalPages()等所有get方法返回分页结果
 * 调用queryList的到查询结果 ,0<=queryList.size()<=pageSize;
 * 
 *************************************注意********************************* 如果参数同时设置了
 * p.setGotoPage(3),p.setGotoFirstPage(true),p.setGotoLastPage(true), 将按照由高到底
 * p.setGotoFirstPage(true)、p.setGotoLastPage(true)、p.setGotoPage(3) 处理 ,将返回第一页
 * 也就是 setGotoFirstPage 优先级最高,然后是 setGotoLastPage， 然后是 setGotoPage。
 * 
 * 如果不设置参数,默认参数是 跳转到第一页,每页10条 Pagination p=new Pagination(); List<?> queryList=
 * SqlMapClientFactory
 * .getServerDBSqlMapProxy().queryForPaginatedList("selectAllChannels",param,p);
 * 
 * Pagination 不是一个线程安全的类
 * 
 * 重用Pagination ,如果 Pagination p=xxx.getPagination(); //从某个对象缓存中取得, 注意配置参数前
 * 必须重置参数 p.resetParameters(); //调用重置参数 p.setPageSize(2);
 * p.setGotoLastPage(true); List<?> queryList=
 * SqlMapClientFactory.getServerDBSqlMapProxy
 * ().queryForPaginatedList("selectAllChannels",param,p);
 * 
 * 
 * @author HuangFu
 * 
 */
public class Pagination extends RowBounds implements java.io.Serializable, Cloneable{

	private static final long serialVersionUID = 6950405057616153833L;
	/********************************** 分页参数 *********************************/
	private int pageSize = 10; // 一页显示的记录数
	private int gotoPage = 1; // 跳转到页数
	private boolean gotoFirstPage; // 是否跳转第一页 true 跳转到第一页,false 不跳转第一页
	private boolean gotoLastPage; // 是否跳转最后一页 true 跳转最后一页,false 不跳转最后一页

	/********************************** 分页结果 *********************************/

	private long recordsCount; // 总记录数

	private int limitCount;
	private int offset;

	private int currentPage; // 当前页
	private int previousPage;// 上一页
	private int nextPage; // 下一页
	private int totalPages; // 总页数

	private boolean havePrevious; // 是否有上一页 true,有上一页 ,false 没有上一页
	private boolean haveNext; // 是否有下一页 true 有下一页 ,false 没有下一页

	private boolean needQueryCount = true; // 是否需要查询刷新count,如果为true，查询前会先去查找count,如果为false,一般cout已经设置,查询前不会去找count

	public void resetParameters() {
		pageSize = 10;
		gotoPage = 1;
		gotoFirstPage = false;
		gotoLastPage = false;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("总记录数:").append(recordsCount).append(' ').append(
				"是否有上一页 :").append(havePrevious).append(' ');
		builder.append("是否有下一页 :").append(haveNext).append(' ').append("当前页 :")
				.append(currentPage).append(' ');
		builder.append("上一页 :").append(previousPage).append(' ')
				.append("下一页 :").append(nextPage).append(' ');
		builder.append("总页数 :").append(totalPages).append(' ').append(
				"一页显示的记录数 :").append(pageSize).append(' ');
		builder.append("跳转到页数 :").append(gotoPage).append(' ').append(
				"是否跳转第一页 :").append(gotoFirstPage).append(' ').append(
				"是否跳转最后一页 :").append(gotoLastPage).append(' ');
		return builder.toString();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isHavePrevious() {
		return havePrevious;
	}

	public void setHavePrevious(boolean havePrevious) {
		this.havePrevious = havePrevious;
	}

	public boolean isHaveNext() {
		return haveNext;
	}

	public void setHaveNext(boolean haveNext) {
		this.haveNext = haveNext;
	}

	public boolean isGotoFirstPage() {
		return gotoFirstPage;
	}

	public void setGotoFirstPage(boolean gotoFirstPage) {
		this.gotoFirstPage = gotoFirstPage;
	}

	public boolean isGotoLastPage() {
		return gotoLastPage;
	}

	public void setGotoLastPage(boolean gotoLastPage) {
		this.gotoLastPage = gotoLastPage;
	}

	public int getGotoPage() {
		return gotoPage;
	}

	public void setGotoPage(int gotoPage) {
		this.gotoPage = gotoPage;
	}

	public long getRecordsCount() {
		return recordsCount;
	}

	public void setRecordsCount(long recordsCount) {
		this.recordsCount = recordsCount;
	}

	public int getLimitCount() {
		return limitCount;
	}

	public void setLimitCount(int limitCount) {
		this.limitCount = limitCount;
	}

	public int getLimit(){
		return getLimitCount();
	}


	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * 计算分页,这个一般是设置recordsCount数后调用
	 */
	public void calculatePage() {
		if (recordsCount <= 0) {
			recordsCount = 0;
			currentPage = 1;
			previousPage = 1;
			nextPage = 1;
			totalPages = 1;
			limitCount = 1;
			offset = 0;
			havePrevious = false;
			haveNext = false;
			return;
		}

		if (pageSize < 0)
			pageSize = 1;

		// 计算总页数
		totalPages = (int) (recordsCount % pageSize == 0 ? recordsCount
				/ pageSize : recordsCount / pageSize + 1);

		int go = gotoPage;

		if (go < 1)
			go = 1;
		else if (go > totalPages) {
			go = totalPages;
		}

		if (gotoLastPage) {
			go = totalPages;
		}

		if (gotoFirstPage) {
			go = 1;
		}

		currentPage = go;
		previousPage = go;
		nextPage = go;

		if (go == 1) {
			havePrevious = false;
			if (go < totalPages) {
				haveNext = true;
			}
		}

		if (go == totalPages) {
			haveNext = false;
			if (totalPages > 1)
				havePrevious = true;
		}

		if (go > 1 && go < totalPages) {
			havePrevious = true;
			haveNext = true;
		}

		if (havePrevious) {
			previousPage = go - 1;
		}

		if (haveNext) {
			nextPage = go + 1;
		}

		limitCount = pageSize;

		offset = limitCount * (go - 1);
	}

	public boolean isNeedQueryCount() {
		return needQueryCount;
	}

	public void setNeedQueryCount(boolean needQueryCount) {
		this.needQueryCount = needQueryCount;
	}

	@Override
	public Pagination clone() {
		try {
			return (Pagination) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

}
