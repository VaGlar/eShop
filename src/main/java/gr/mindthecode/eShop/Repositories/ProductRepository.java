package gr.mindthecode.eShop.Repositories;

import gr.mindthecode.eShop.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
