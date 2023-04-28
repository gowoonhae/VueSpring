package com.cloudmall.backend;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cloudmall.backend.board.BoardEntity;
import com.cloudmall.backend.board.BoardRepository;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void testJpa() {
		BoardEntity test = BoardEntity.builder()
		.id(1)
		.title("AMD Radeon 290X")
		.content("본문 수정 완료.")
		.image_src("/image/290x.webp")
		.price(20000)
		.updated_date(LocalDate.now())
		.build();

		boardRepository.save(test);
	}
}
