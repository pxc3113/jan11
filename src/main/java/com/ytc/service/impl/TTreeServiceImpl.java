package com.ytc.service.impl;

import java.util.List;

import com.ytc.mapper.TTreeMapper;
import com.ytc.model.TTree;
import com.ytc.service.TTreeService;

import org.springframework.beans.factory.annotation.Autowired;

public class TTreeServiceImpl implements TTreeService {

    @Autowired
	private TTreeMapper tTreeMapper;

	@Override
	public List<TTree> queryTTreeList() {
		//查询 总条数
		return tTreeMapper.queryTTreeList();
	}
}
