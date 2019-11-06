package com.biz.sec.persistance;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MasterDetailVO {

	private long m_seq;
	private String m_subject;
	
	private List<DetailDTO> deList;
	
	
}
