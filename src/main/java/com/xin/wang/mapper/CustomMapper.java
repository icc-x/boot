package com.xin.wang.mapper;

import com.xin.wang.domin.PurchaseBillPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by xin.wang on 2016/11/5.
 * 测试
 */
@Mapper
public interface CustomMapper {
    List<PurchaseBillPo> getPurchaseList();
}
