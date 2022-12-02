package com.mycom.myapp.board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    private final String BOARD_INSERT = "insert into BOARD (title, writer, content) values (?,?,?)";
    private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=? where seq=?";
    private final String BOARD_DELETE = "delete from BOARD  where seq=?";
    private final String BOARD_GET = "select * from BOARD  where seq=?";
    private final String BOARD_LIST = "select * from BOARD order by seq desc";

    public int insertBoard(BoardVO vo) {
        String sql="insert into BOARD (title,writer,content,category) values("
                +"'"+vo.getTitle()+"',"
                +"'"+vo.getWriter()+"',"
                +"'"+vo.getContent()+"',"
                +"'"+vo.getCategory()+"')";
        return jdbcTemplate.update(sql);
    }

    // 글 삭제
    public int deleteBoard(int seq) {
        String sql="delete from BOARD where seq="+seq;
        return jdbcTemplate.update(sql);
    }
    public int updateBoard(BoardVO vo) {
        String sql="update BOARD set title='"+vo.getTitle()+"',"
                +"writer='"+vo.getWriter()+"',"
                +"content='"+vo.getContent()+"',"
                +"category='"+vo.getCategory()+"' where seq="+vo.getSeq();
        return jdbcTemplate.update(sql);
    }
    //원하는 데이터 하나 가져오기
    public BoardVO getBoard(int seq) {
        String sql="select* from BOARD where seq="+seq;
        return jdbcTemplate.queryForObject(sql,new BoardRowMapper());
    }

    //원하는 데이터 목록 가져오기
    public List<BoardVO> getBoardList(){
        String sql="select* from BOARD order by regdate desc";
        return jdbcTemplate.query(sql,new BoardRowMapper());

    }
}