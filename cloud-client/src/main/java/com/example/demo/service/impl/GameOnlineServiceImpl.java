package com.example.demo.service.impl;

import com.example.demo.dao.GameOnlineMapper;
import com.example.demo.entity.GameOnline;
import com.example.demo.service.GameOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameOnlineServiceImpl implements GameOnlineService {

    @Autowired
    private GameOnlineMapper gameOnlineMapper;

    @Override
    public void gameOnline() {
        GameOnline gameOnline = gameOnlineMapper.selectByPrimaryKey("1");
        System.out.println(gameOnline.getGameId());
    }
}
