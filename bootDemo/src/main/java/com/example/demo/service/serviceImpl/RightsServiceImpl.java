package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Rights;
import com.example.demo.mapper.RightsMapper;
import com.example.demo.service.RightsService;
import com.example.demo.utils.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightsServiceImpl implements RightsService {

    @Autowired
    RightsMapper rightsMapper;

    @Override
    public Object getAllRights(int page, int size, String likeName) {
        PageHelper.startPage(page, size);
        List<Rights> list = rightsMapper.getAllRights(likeName);
        PageInfo pageInfo = new PageInfo(list);
        long total = pageInfo.getTotal();
        return ResultObject.okList(list, page, size, total);
    }
}
