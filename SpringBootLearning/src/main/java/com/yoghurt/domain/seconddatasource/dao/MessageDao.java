package com.yoghurt.domain.seconddatasource.dao;

import com.yoghurt.domain.seconddatasource.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by admin on 2017/7/3.
 */
public interface MessageDao extends JpaRepository<Message,Long>{
}
