package com.clubBike.repository;

import com.clubBike.domain.MemberDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberDomain, Long> {

    // 회원가입
    MemberDomain save(MemberDomain member);

    // 아이디 찾기

    // 비밀번호 찾기

}
