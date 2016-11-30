package avto_test.avtoService;

import avto_test.avto.Avto;
import avto_test.avtoRepo.AvtoRepo;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */
public class AvtoServiceImpl implements AvtoService{
    private AvtoRepo avtoRepo;

    public AvtoServiceImpl() {
    }

    public AvtoServiceImpl(AvtoRepo avtoRepo) {
        this.avtoRepo = avtoRepo;
    }

    public List<Avto> getAllAvto() {
        return avtoRepo.getAllAvto();
    }


     public AvtoRepo getAvtoRepo() {
        return avtoRepo;
    }

    public void setAvtoRepo(AvtoRepo avtoRepo) {
        this.avtoRepo = avtoRepo;
    }
}
