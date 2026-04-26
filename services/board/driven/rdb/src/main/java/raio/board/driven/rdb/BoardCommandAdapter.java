package raio.board.driven.rdb;

import lombok.RequiredArgsConstructor;
import raio.board.domain.Board;
import raio.board.driven.rdb.mapper.BoardEntityMapper;
import raio.board.application.port.BoardCommandRepositoryPort;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import static raio.board.exception.BoardErrorCode.DEFAULT;

@Repository
@RequiredArgsConstructor
public class BoardCommandAdapter implements BoardCommandRepositoryPort {

    private final BoardJpaRepository boardJpaRepository;
    private final BoardEntityMapper boardEntityMapper;

    @Override
    public Board save(Board board) {
        var boardEntity = boardEntityMapper.toEntity(board);
        try {
            var newBoard = boardJpaRepository.save(boardEntity);
            boardJpaRepository.flush();
            return boardEntityMapper.toDomain(newBoard);
        } catch (DataAccessException e) {
            throw DEFAULT.exception(e);
        }
    }

}