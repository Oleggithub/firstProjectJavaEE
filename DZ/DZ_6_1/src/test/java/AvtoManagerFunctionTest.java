import avto_test.avtoService.AvtoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by b_nop on 30.11.2016.
 */
@RunWith(JUnit4.class)
public class AvtoManagerFunctionTest {
    @Test //mock
    public void chech_sum_method(){

        AvtoService avtoManager = mock(AvtoService.class);
        when(avtoManager.getAllAvto()).then(avtoManager);
        System.out.println("avtoManager = " + avtoManager.getAllAvto());

//        List<Avto> allAvto = avtoManager.getAllAvto();
//        for (Avto avto : allAvto){
//            System.out.println("avto = " + avto);
//        }


    }


}


