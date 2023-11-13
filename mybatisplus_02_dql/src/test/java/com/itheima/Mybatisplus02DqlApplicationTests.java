package com.itheima;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        //条件による検索
       // QueryWrapper qw = new QueryWrapper();
       // qw.lt("age",40);
       // List<User> userList = userDao.selectList(qw);
       // System.out.println(userList);

        //ラムダ形式での条件による検索
       // QueryWrapper<User> qw = new QueryWrapper<User>();
       // qw.lambda().lt(user -> user.getAge(),40);
       // List<User> userList = userDao.selectList(qw);
       // System.out.println(userList);

        //ラムダ形式での条件による検索
       // LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
       // lqw.lt(User::getAge, 30);
       // List<User> userList = userDao.selectList(lqw);
       // System.out.println(userList);




        //かつまたは関係
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //かつ 関係：10歳から30歳
//        //lqw.lt(User::getAge, 30).gt(User::getAge, 10);
//        //または 関係：10歳未満または30歳を超える
//        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);




        //ページからのデータの模倣
       // UserQuery uq = new UserQuery();
       // uq.setAge(10);
       // uq.setAge2(30);

        //null判定
//       LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge, uq.getAge2());
//        if( null != uq.getAge()) {
//            lqw.gt(User::getAge, uq.getAge());
//        }
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //最初のパラメータがtrueであるかどうかを判定し、trueであれば現在の条件を連結する
//        lqw.lt(null != uq.getAge2(),User::getAge, uq.getAge2());
//         lqw.gt(null != uq.getAge(),User::getAge, uq.getAge());
//        lqw.lt(null != uq.getAge2(),User::getAge, uq.getAge2())
//           .gt(null != uq.getAge(),User::getAge, uq.getAge());
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);




        //查询投影
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.select(User::getId,User::getName,User::getAge);
//        QueryWrapper<User> lqw = new QueryWrapper<User>();
//        lqw.select("id","name","age","tel");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        QueryWrapper<User> lqw = new QueryWrapper<User>();
//        lqw.select("count(*) as count, tel");
//        lqw.groupBy("tel");
//        List<Map<String, Object>> userList = userDao.selectMaps(lqw);
//        System.out.println(userList);




        //条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //等同于=
//        lqw.eq(User::getName,"Jerry").eq(User::getPassword,"jerry");
//        User loginUser = userDao.selectOne(lqw);
//        System.out.println(loginUser);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //范围查询 lt le gt ge eq between
//        lqw.between(User::getAge,10,30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //模糊匹配 like
//        lqw.likeLeft(User::getName,"J");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);


        // LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        // List<User> userList = userDao.selectList(lqw);
        // System.out.println(userList);












    }

}
