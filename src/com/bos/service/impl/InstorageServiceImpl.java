package com.bos.service.impl;

import com.bos.dao.IMaterialDao;
import com.bos.dao.InstorageDao;
import com.bos.domain.Instorage;
import com.bos.service.InStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Simon
 */
@Service
@Transactional
public class InstorageServiceImpl implements InStorageService {

    @Autowired
    private InstorageDao instorageDao;

    @Autowired
    private IMaterialDao materialDao;

    /**
     * 添加进货信息
     *
     * @param instorage
     */
    @Override
    public void saveInstorage(Instorage instorage) {
        int id = instorage.getMaterialid();

    }
}
