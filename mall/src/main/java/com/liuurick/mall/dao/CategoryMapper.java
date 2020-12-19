package com.liuurick.mall.dao;

import com.liuurick.mall.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liubin
 */
public interface CategoryMapper {

    @Select("select * from mall_category where id = #{id}")
    Category findCategoryById(@Param("id")Integer id);

    Category queryById(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> selectAll();
}
