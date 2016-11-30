package avto_test_annotation.avtoService;

import avto_test_annotation.avto.Avto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
@Service (value = "")
public interface AvtoService {
    List<Avto> getAllAvto();
}
