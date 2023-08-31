package com.yoong.web.repository;

import org.springframework.data.repository.Repository;

import com.yoong.web.JBoard;

public interface BoardRepository extends Repository<JBoard, Long> {

	 void save(JBoard jBoard);

}
