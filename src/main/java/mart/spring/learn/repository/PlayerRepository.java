package mart.spring.learn.repository;

import mart.spring.learn.entitys.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PlayerRepository extends CrudRepository<Player, Long> {

    List<Player> findByLastName(String lastName);
}
