package com.tannghia.service.imp;

import com.tannghia.converter.MemberConverter;
import com.tannghia.entity.Member;
import com.tannghia.model.MemberDTO;
import com.tannghia.repository.MemberRepository;
import com.tannghia.service.IMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService implements IMember {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberConverter converter;


    @Override
    public MemberDTO save(MemberDTO memberDTO) {
        Member member = converter.converEntyties(memberDTO);
        if(memberDTO != null){
           return converter.convertDTO(memberRepository.save(member)) ;
        }
        return null;
    }

    @Override
    public MemberDTO findOneById(String email) {
        ;
        return converter.convertDTO(memberRepository.findById(email).orElse(new Member()));
    }

    @Override
    public List<MemberDTO> findAll() {
        List<Member> listme =memberRepository.findAll();
        List<MemberDTO> listResult = new ArrayList<>();
        for (Member mem:
             listme) {
            listResult.add(converter.convertDTO(mem));
        }
        return listResult;
    }
}
