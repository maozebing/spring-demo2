package rhea.demo.api;

import rhea.demo.service.TestService;
import rhea.demo.service.TestServiceImpl;
import rhea.demo.utility.SpringContextUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/5/3 10:36
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@Path("test")
public class TestAPI {

    private TestService testService = (TestService) SpringContextUtil.getBean(TestServiceImpl.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTest(@QueryParam("id") long id){
        return Response.ok(testService.getTest(id)).build();
    }

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listTest(){
        return Response.ok(testService.listTest()).build();
    }


}
