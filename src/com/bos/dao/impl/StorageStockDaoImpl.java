package com.bos.dao.impl;

import com.bos.dao.IStorageStockDao;
import com.bos.dao.base.impl.BaseDaoImpl;
import com.bos.domain.Storagestock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Simon
 */
@Repository
public class StorageStockDaoImpl extends BaseDaoImpl<Storagestock> implements IStorageStockDao {
}
