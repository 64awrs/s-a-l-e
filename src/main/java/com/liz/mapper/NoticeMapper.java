package com.liz.mapper;


import com.liz.entity.Notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;


public class NoticeMapper {
    //开发增删改查
    int inset(Notice notice);
    @Delete("delete from notice where id=#{id}")
    int delete(int id);

    //根据id查询
    @Select("select * from notice where id=#{id}")
    Notice selectById(int id);

    //查询所有
    List<Notice> selectAll();


}
