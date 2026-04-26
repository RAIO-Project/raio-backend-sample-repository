package raio.board.application.service;

import lombok.RequiredArgsConstructor;
import raio.board.domain.Board;
import raio.board.application.port.BoardCommandRepositoryPort;
import raio.board.application.usecase.BoardCreateUseCase;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardCommandService implements BoardCreateUseCase {
    
    private final BoardCommandRepositoryPort boardCommandRepositoryPort;
    
    @Override
    public Board createBoard(Board board) {
        return boardCommandRepositoryPort.save(board);
    }
}
