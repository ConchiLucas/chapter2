package com.example.demo.dao;


import com.example.demo.entity.GameOnline;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GameOnlineMapper extends Mapper<GameOnline> {
	
	public List<GameOnline> getOnlineCount(String time);
	
}