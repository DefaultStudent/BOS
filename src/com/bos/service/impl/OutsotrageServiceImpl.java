package com.bos.service.impl;

import com.bos.dao.IOutstorageDao;
import com.bos.domain.MaterialAndSupplier;
import com.bos.service.IOutStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Simon
 */
@Service
public class OutsotrageServiceImpl implements IOutStorageService {

    @Autowired
    private IOutstorageDao outstorageDao;

    /**
     * 查询全部出货信息
     *
     * @return
     */
    @Override
    public List<MaterialAndSupplier> findAllOutStorageInfo() {
        List<MaterialAndSupplier> list = outstorageDao.findAllOutStorage();
        if (list.size() > 0) {
            return list;
        }
        return null;
    }
}
