package algorithms.medium;

import algorithms.medium.Minesweeper529;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Minesweeper529.class)
@RunWith(SpringRunner.class)
class Minesweeper529Test {

	@Autowired
	private Minesweeper529 minesweeper529;

	@Test
	void testUpdateBoard() {
		char[][] board = new char[][] {{'E','E','E','E','E'}, {'E','E','M','E','E'},
				{'E','E','E','E','E'}, {'E','E','E','E','E'}};
		int[] click = new int[] {3,0};

		char[][] updateBoard = minesweeper529.updateBoard(board, click);
		for (int i = 0; i < updateBoard.length; ++i) {
			System.out.println(updateBoard[i]);
		}
	}

}
