package com.study.board.repository;


import com.study.board.entity.Board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
}

//기본키로 지정한 항목의 타입
