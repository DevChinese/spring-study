package com.hua.spring10.mapper;

import com.hua.spring10.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        return users;
    }

    @Override
    public void addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.deleteUser(id);
    }

    /**
     * 用于测试事务，测试前，先把mapper文件中的查询语句改错，看插入能不能插入成功
     * @param user 需要插入的user
     */
    public void addAndSelect(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        // 在设置事务的情形下，若后面的查询失败了，插入业会被回滚
        mapper.addUser(user);

        List<User> users = mapper.selectUser();
        for (User u : users) {
            System.out.println(u);
        }
    }
}
