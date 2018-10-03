package br.com.apiproducts.repository;

import br.com.apiproducts.model.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsModel, Long> {

    ProductsModel findById(long id);
}
