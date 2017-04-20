package me.groove.wind.sql.mybatis.domain.mapper;

import me.groove.wind.sql.mybatis.domain.model.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/4/20.
 */
@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);

}
