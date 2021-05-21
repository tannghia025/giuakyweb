package com.tannghia.converter;

import com.tannghia.entity.Member;
import com.tannghia.model.MemberDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberConverter {

    @Autowired
    private ModelMapper modelMapper;

    public MemberDTO convertDTO(Member member) {
        return modelMapper.map(member, MemberDTO.class);
    }
    public Member converEntyties(MemberDTO member) {
        return modelMapper.map(member, Member.class);
    }
}
