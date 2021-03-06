package com.ejlchina.searcher.bean;


/**
 * 用户Bean可选实现接口，
 * 当用户bean 实现这个接口时，可以在 afterAssembly 方法里添加 bean 装配完之后的自定义逻辑
 * 
 * @author Troy.Zhou @ 2017-03-21
 * 
 * */
public interface BeanAware {

	/**
	 * 装配之后
	 * */
	public void afterAssembly();
	
	
}
