package avto_test.avtoRepo;

import avto_test.avto.Avto;

import java.util.Arrays;
import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public class AvtoRepoImpl implements AvtoRepo{
    public List<Avto> getAllAvto() {
        return Arrays.asList(
                new Avto("Chevrolet_Aveo", 10, "mechanik"),
                new Avto("Chevrolet_Tracker", 2, "mechanik"),
                new Avto("Chevrolet_Captiva", 10, "automat"),
                new Avto("Cadillac_Escalade", 10, "automat"));
    }
}
