package com.sbs.starter.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	private long id;
	private String regDate;
	private String title;
	private String body;
}
