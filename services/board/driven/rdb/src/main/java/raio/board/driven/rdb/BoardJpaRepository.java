package raio.board.driven.rdb;

import raio.board.driven.rdb.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> { }