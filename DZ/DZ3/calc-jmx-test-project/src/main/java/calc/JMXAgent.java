package calc;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXAgent {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        //������ ��� ����������� mbeans
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        //�������� ������ ����� - c ������� ��������� ���������(1 � 2)
        CalculatorModelMBean calculatorMBean = new CalculatorModel(1, 2);
        //����������� ����� ��� ������ ����� �� ������ JMX ���������(catalog, folder, format - standard; %catalog%:name=%folder%)
        ObjectName objectName = new ObjectName("calc-test-mbean:name=first-mbean");
        //����� ��������, ��� ���� ��������� ������ ���-�� ����������, ��� ����, ����� �� ������ � ��� ���������� � ������� ���������
        //������� -- ���������� "���������" � ������� ������������ �����, ���� �������� ����� � ���������� ������-���� �����
        //����������� �����
        platformMBeanServer.registerMBean(calculatorMBean, objectName);
        for (; ; ) {

        }
    }
}
