package com.lezijie.note;

import com.lezijie.note.dao.UserDao;
import com.lezijie.note.po.User;
import com.lezijie.note.util.DBUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDB {
    //使用日志工厂类，记录日志
    private Logger logger= LoggerFactory.getLogger(TestDB.class);
/**
 * 单元测试
 * 1.方法的返回值建议使用void，一般没有返回值
 * 2.参数列表，建议空参，一般没有参数
 * 3.方法上需要设置@Test注解
 * 每个方法都能独立运行
 *
 * 判定结果
 * 绿色：表示成功；红色：表示失败
 */
@Test
    public void testDB(){
        System.out.println(DBUtil.getConnetion());
        //使用日志
    logger.info("获取数据库连接:"+DBUtil.getConnetion());
    logger.info("获取数据库连接:{}",DBUtil.getConnetion());
    }
    @Test
    public void testQueryUserByName(){
        UserDao userDao= new UserDao();
        User user= userDao.queryUserByName02("admin");
        System.out.println(user.getUpwd());
    }
}
