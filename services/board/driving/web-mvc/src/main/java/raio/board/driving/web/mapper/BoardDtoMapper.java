package raio.board.driving.web.mapper;

import raio.board.domain.Board;
import raio.board.domain.type.BoardStatus;
import raio.board.driving.web.dto.BoardCommandDto.BoardCreateCommand;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardDtoMapper {

    Board toDomain(BoardCreateCommand command, BoardStatus status);

}
