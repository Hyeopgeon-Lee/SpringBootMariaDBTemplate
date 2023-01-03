package kopo.poly.service;

import kopo.poly.dto.NoticeDTO;

import java.util.List;

public interface INoticeService {

    /**
     * 공지사항 리스트
     */
    List<NoticeDTO> getNoticeList() throws Exception;

    /**
     * 공지사항 상세 내역 조회(조회되는 레코드는 1개)
     */
    NoticeDTO getNoticeInfo(NoticeDTO pDTO) throws Exception;
    
    /**
     * 공지사항 등록
     */
    void InsertNoticeInfo(NoticeDTO pDTO) throws Exception;

    /**
     * 공지사항 수정
     */
    void updateNoticeInfo(NoticeDTO pDTO) throws Exception;

    /**
     * 공지사항 삭제
     */
    void deleteNoticeInfo(NoticeDTO pDTO) throws Exception;

}

