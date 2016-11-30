package avto_test_annotation.avtoRepo;

import avto_test_annotation.avto.Avto;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
@Repository(value = "avtoRepo")
public class AvtoRepoImpl implements AvtoRepo {
    public List<Avto> getAllAvto() {
        return Arrays.asList(
                new Avto("Chevrolet_Aveo", 10, "mechanik"),
                new Avto("Chevrolet_Tracker", 2, "mechanik"),
                new Avto("Chevrolet_Captiva", 10, "automat"),
                new Avto("Cadillac_Escalade", 10, "automat"));
    }
}
