package com.bos.service;

import com.bos.domain.MaterialAndSupplier;

import java.util.List;

/**
 * @author Simon
 */

public interface IOutStorageService {

    /**
     * 查询全部出货信息
     * @return
     */
    public List<MaterialAndSupplier> findAllOutStorageInfo();
}