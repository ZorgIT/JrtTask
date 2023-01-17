
package com.game.repository;

import com.game.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> , JpaSpecificationExecutor<Player> {
  /*  List<Player> findByName(String name); //пример касмтомного поиска по полю.
    List<Player> findByNameOrderByAge(String name); //поиск по имени и сортировка по возрасту
    List<Player> findByNameStartingWith(String startingWith); //поиск по имение начинающемуся с строки ...
    List<Player> findByNameOrEmail(String name,String email);  //поиск по имени или почте
*/

}



