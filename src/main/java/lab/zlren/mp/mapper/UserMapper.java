package lab.zlren.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import lab.zlren.mp.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author zlren
 * @since 2017-11-12
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 测试sql语句
     *
     * @return
     */
    @Select("select * from user where test_id = 1")
    User selectUserSQL();
}