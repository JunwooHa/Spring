package com.itbank.model;

import java.util.List;

import com.itbank.model.dto.BoardDTO;

public interface BoardDAO {

	List<BoardDTO> selectAll();

}
