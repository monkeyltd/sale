package com.monkey.application.Payfor;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.monkey.core.entity.Order;
import com.monkey.core.entity.Serial;
import com.monkey.core.mapper.SerialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaohejing
 * @since 2018-09-12
 */
@Service
public class SerialServiceImpl extends ServiceImpl<SerialRepository, Serial> implements ISerialService {

    @Autowired
    SerialRepository _serialRepository;
    @Override
    public void insertBySql(Order order) {
        _serialRepository.insertBySql(order);
    }
}
