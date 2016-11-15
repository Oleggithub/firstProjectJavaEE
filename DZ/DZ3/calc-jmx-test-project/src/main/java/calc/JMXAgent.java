package calc;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXAgent {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        //сервер для регистрации mbeans
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        //создание самого мбина - c числами заданными хардкодом(1 и 2)
        CalculatorModelMBean calculatorMBean = new CalculatorModel(1, 2);
        //определение имени для нашего мбина на уровне JMX менеджера(catalog, folder, format - standard; %catalog%:name=%folder%)
        ObjectName objectName = new ObjectName("calc-test-mbean:name=first-mbean");
        //важно понимать, что наша программа должна как-бы подвиснуть, для того, чтобы мы смогли к ней обратиться с помощью менеджера
        //поэтому -- симитируем "зависание" с помощью бесконечного цикла, либо ожидания ввода с клавиатуры какого-либо числа
        //регистрация мбина
        platformMBeanServer.registerMBean(calculatorMBean, objectName);
        for (; ; ) {

        }
    }
}
