package raio.board.driven.rdb.mapper;

import raio.board.domain.Board;
import raio.board.driven.rdb.entity.BoardEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardEntityMapper {

    Board toDomain(BoardEntity boardEntity);

    BoardEntity toEntity(Board board);

}
