package com.example.woowa.delivery.service;

import com.example.woowa.delivery.entity.AreaCode;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AreaCodeServiceTest {

    @Autowired
    AreaCodeService areaCodeService;

    @Test
    @DisplayName("AreaCode ������ �о�ͼ� �ʱ�ȭ �� �� �ִ�.")
    @BeforeEach
    public void init() {
        areaCodeService.init();
    }

    @Test
    @DisplayName("defaultAddress�� ���� AreaCode�� ��ȸ�� �� �ִ�.")
    public void findByDefaultAddress() {
        AreaCode areaCode = areaCodeService.findByAddress("����Ư���� ���α�");
        assertThat(areaCode.getCode()).isEqualTo(1111000000);
        assertThat(areaCode.getDefaultAddress()).isEqualTo("����Ư���� ���α�");
    }


}