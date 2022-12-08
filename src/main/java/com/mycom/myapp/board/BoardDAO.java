package com.mycom.myapp.board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo) {
        int result = sqlSession.insert("Board.insertBoard", vo);
        return result;
    }
    public int deleteBoard(int seq){
        int result = sqlSession.delete("Board.deleteBoard");
        return result;
    }
    public int updateBoard(BoardVO vo){
        int result = sqlSession.update("Board.updateeteBoard",vo);
        return result;
    }
    public BoardVO getBoard(int seq){
        BoardVO one=sqlSession.selectOne("Board.getBoard",seq);
        return one;
    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> list=sqlSession.selectList("Board.getBoardList");
        return list;
    }
}