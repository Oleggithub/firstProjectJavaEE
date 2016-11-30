package avto_test.avtoRepo;

import avto_test.avto.Avto;

import java.util.Arrays;
import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public class AvtoRepoImpl1 implements AvtoRepo {
    public List<Avto> getAllAvto() {
        return Arrays.asList(
                new Avto("Chevrolet_Aveo_NEW", 5, "mechanik"),
                new Avto("Chevrolet_Tracker_NEW", 3, "mechanik"),
                new Avto("Chevrolet_Captiva_NEW", 8, "automat"),
                new Avto("Cadillac_Escalade_NEW", 9, "automat"));
    }
}
