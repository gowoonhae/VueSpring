package com.cloudmall.backend;

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
		.title("AMD Radeon RX480")
		.writer("고운산")
		.content("GTX1060과 비슷한 성능입니다.")
		.image_src("/image/rx480.webp")
		.build();

		boardRepository.save(test);
	}
}
