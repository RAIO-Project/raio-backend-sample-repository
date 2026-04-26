package raio.board.application.port;

import raio.board.domain.Board;

public interface BoardCommandNetteeClientPort {
    Board save(Board board);
}
