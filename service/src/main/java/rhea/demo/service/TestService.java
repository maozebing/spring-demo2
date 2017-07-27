package rhea.demo.service;

import rhea.demo.dbentity.TestEntity;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/5/3 10:27
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public interface TestService {
    TestEntity getTest(long id);

    List<TestEntity> listTest();
}
