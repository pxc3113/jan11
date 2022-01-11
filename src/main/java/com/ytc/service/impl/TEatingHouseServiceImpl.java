package com.ytc.service.impl;

import java.util.List;

import com.ytc.mapper.TEatingHouseMapper;
import com.ytc.model.TEatingHouse;
import com.ytc.service.TEatingHouseService;
import com.ytc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TEatingHouseServiceImpl implements TEatingHouseService {

    @Autowired
	private TEatingHouseMapper tEatingHouseMapper;
	/* (non-Javadoc)    
	 * @see com.ytc.service.TEatingHouseService#queryTEatingHouseList(com.ytc.util.PageUtil)    
	 */
	@Override
	public PageUtil<TEatingHouse> queryTEatingHouseList(PageUtil<TEatingHouse> page) {
		//查询 总条数
		long totalRow=tEatingHouseMapper.queryCount();
		//计算开始的位置
		page=new PageUtil<>(page.getCpage(), totalRow, page.getPageSize());
		//通过开始和每页条数查询集合
		List<TEatingHouse> list=tEatingHouseMapper.queryTEatingHouseList(page.getStart(),page.getPageSize());

		//把查询的结果放到page中
		page.setList(list);
		return page;
	}

}
