package lab.zlren.mp.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lab.zlren.mp.entity.User;
import lab.zlren.mp.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author zlren
 * @date 2017-11-12
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
