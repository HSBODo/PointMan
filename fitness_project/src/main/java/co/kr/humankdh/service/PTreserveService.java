package co.kr.humankdh.service;

import java.util.List;

import co.kr.humankdh.domain.MemberVo;
import co.kr.humankdh.domain.TrainerCareerVo;

public interface PTreserveService {
	// 트레이너 목록 가져오기
	List<MemberVo> getTrainerList();
	
	// 트레이너 id로 경력목록 가져오기
	List<TrainerCareerVo> getCareers(String id);
	
	// 트레이너 id로 최근 comments 가져오기
	String getLastComments(String id);
	
	// 트레이너 경력입력
	void insertCareer(TrainerCareerVo vo);

	// 트레이너 경력 수정
	void updateCareer(TrainerCareerVo vo);

	// 트레이너 경력 삭제
	void deleteCareer(Long cno);
	
	// 트레이너 경력 모두 삭제
	void deleteAllCareer(String id);
}
