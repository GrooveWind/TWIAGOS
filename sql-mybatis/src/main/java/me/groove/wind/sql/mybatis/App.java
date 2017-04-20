package me.groove.wind.sql.mybatis;

import me.groove.wind.sql.mybatis.domain.dao.CityDao;
import me.groove.wind.sql.mybatis.domain.mapper.CityMapper;
import me.groove.wind.sql.mybatis.domain.mapper.HotelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by Administrator on 2017/4/20.
 */
@SpringBootApplication
@ServletComponentScan
public class App implements CommandLineRunner{

    private final CityMapper cityMapper;
    private final CityDao cityDao;
    private final HotelMapper hotelMapper;


    public App(CityDao cityDao, CityMapper cityMapper, HotelMapper hotelMapper) {
        this.cityDao = cityDao;
        this.cityMapper = cityMapper;
        this.hotelMapper = hotelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>> 服务启动执行 >>>>>>>>>>>>>>>>>>");
        System.out.println(this.cityMapper.findByState("CA"));
        System.out.println(this.cityDao.selectCityById(1));
        System.out.println(this.hotelMapper.selectByCityId(1));
        System.out.println(">>>>>>>>>>>>>>>>>> 启动执行完毕 >>>>>>>>>>>>>>>>>>");
    }
}
