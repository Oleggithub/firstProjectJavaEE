package avto_test.avtoService;

import avto_test.avto.Avto;
import org.mockito.stubbing.Answer;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public interface AvtoService extends Answer<Object> {
    List<Avto> getAllAvto();
}
