package raio.board.application.port;

import raio.board.domain.Board;

public interface BoardCommandRepositoryPort {
    Board save(Board board);
}
