package raio.draft.driven.rdb;

import raio.draft.driven.rdb.entity.DraftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DraftJpaRepository extends JpaRepository<DraftEntity, Long> {
}
