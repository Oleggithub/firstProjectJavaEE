package avto_test_annotation.avtoService;

import avto_test_annotation.avto.Avto;
import avto_test_annotation.avtoRepo.AvtoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by b_nop on 30.11.2016.
 */

@Service(value = "avtoService")
public class AvtoServiceImpl implements AvtoService {
        @Autowired // delaet to chto napisano v Qualifier
    @Qualifier(value = "avtoRepo1")// mojem menyat userRepo na userRepo1

//    @Resource// ignoriruet Qualifier
//    @Qualifier(value = "avtoRepo")// mojem menyat avtoRepo1 na avtoRepo1
    private AvtoRepo avtoRepo1;

    public AvtoServiceImpl() {
    }

    public AvtoServiceImpl(AvtoRepo avtoRepo) {
        this.avtoRepo1 = avtoRepo;
    }

    public List<Avto> getAllAvto() {
        return avtoRepo1.getAllAvto();
    }


     public AvtoRepo getAvtoRepo() {
        return avtoRepo1;
    }

    public void setAvtoRepo(AvtoRepo avtoRepo) {
        this.avtoRepo1 = avtoRepo;
    }
}
