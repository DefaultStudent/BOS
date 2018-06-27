package com.bos.service;

import com.bos.domain.Instorage;

/**
 * @author Simon
 */
public interface InStorageService {

    /**
     * 添加进货信息
     * @param model
     */
    public void saveInstorage(Instorage model);
}
