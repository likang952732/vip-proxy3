package com.example.vipproxy3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 @Description
 *@author kang.li
 *@date 2021/1/22 10:32   
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public void test() {
        testMapper.insert("bob");
        log.info("插入数据完成.................");
        List<TestModel> list = testMapper.getAll();
        log.info("查询数据......." + list.size());
    }
}
