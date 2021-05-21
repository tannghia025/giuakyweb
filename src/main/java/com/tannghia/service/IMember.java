package com.tannghia.service;

import com.tannghia.model.MemberDTO;

import java.util.List;

public interface IMember {
    public MemberDTO save(MemberDTO memberDTO);
    public MemberDTO findOneById(String email);
    public List<MemberDTO> findAll();
}
