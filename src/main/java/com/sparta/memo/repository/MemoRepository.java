package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    // memo 조회 (최신순)
    List<Memo> findAllByOrderByModifiedAtDesc();

    // contents에 keyword가 포함된 memo 조회 (최신순)
    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}
