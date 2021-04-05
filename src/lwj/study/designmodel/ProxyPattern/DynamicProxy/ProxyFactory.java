package lwj.study.designmodel.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    /**
     * 1.classLoader loader:指定当前目标对象使用的类加载器，获取加载器的方法固定
     * 2.Class<?>[] interfaces:目标对象实现的接口类型,使用泛型方法确认类型
     * 3.InvocationHandler：事情处理，执行目标对象方法时，会触发事情处理方法会把当前执行的目标对象方法作为参数
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK 代理start");
                //反射机制调用目标对象方法
                Object returnVal = method.invoke(target,args);
                System.out.println("JDK 代理end");
                return returnVal;
            }
        });
    }
}
