package order.OrderModule;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailsService {

    @Autowired
    private OrderDetailsRepository repo;

    public List<Order> listAll() {
        return repo.findAll();
    }

    public void save(Order orderdetails) {
        repo.save(orderdetails);
    }

    public Order get(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

    public List<Order> getAllOrders() {
        return repo.findAll();
    }
}

		
	

	