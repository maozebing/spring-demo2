package rhea.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rhea.demo.dao.TestDao;
import rhea.demo.dbentity.TestEntity;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/5/3 10:34
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getTest(long id) {
        return testDao.getTest(id);
    }

    public List<TestEntity> listTest() {
        return testDao.listTest();
    }
}
