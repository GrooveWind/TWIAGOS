package me.groove.wind.sql.mybatis.domain.dao;

import me.groove.wind.sql.mybatis.domain.model.entity.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/20.
 */
@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}
