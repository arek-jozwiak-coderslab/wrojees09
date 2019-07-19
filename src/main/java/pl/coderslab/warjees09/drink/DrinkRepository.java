package pl.coderslab.warjees09.drink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.warjees09.drink.Drink;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {

}
