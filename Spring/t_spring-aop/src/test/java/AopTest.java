import com.prim.ProductDao;
import com.prim.UserDao;
import com.prim.UserDaoImpl;
import com.prim.aop.AopImpl;
import com.prim.aop.MyCglibProxy;
import org.junit.Test;

public class AopTest {
    @Test
    public void testCommon() {
        UserDao userDao = new UserDaoImpl();
        AopImpl aop = new AopImpl(new ProductDao());
        Object proxy1 = aop.createProxy();
//        System.out.println("AopTest.testCommon" + proxy1.getClass());
        ProductDao proxy = (ProductDao) aop.createProxy();
        proxy.save();//在save之前进行权限校验
    }

    @Test
    public void testCglib() {
        ProductDao productDao = new ProductDao();
        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();
        proxy.save();
    }

    @Test
    public void testSpringAop1(){

    }
}
