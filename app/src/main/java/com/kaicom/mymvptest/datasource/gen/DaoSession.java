package com.kaicom.mymvptest.datasource.gen;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.kaicom.mymvptest.datasource.entity.TraceRecordsEntity;

import com.kaicom.mymvptest.datasource.gen.TraceRecordsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig traceRecordsDaoConfig;

    private final TraceRecordsDao traceRecordsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        traceRecordsDaoConfig = daoConfigMap.get(TraceRecordsDao.class).clone();
        traceRecordsDaoConfig.initIdentityScope(type);

        traceRecordsDao = new TraceRecordsDao(traceRecordsDaoConfig, this);

        registerDao(TraceRecordsEntity.class, traceRecordsDao);
    }
    
    public void clear() {
        traceRecordsDaoConfig.getIdentityScope().clear();
    }

    public TraceRecordsDao getTraceRecordsDao() {
        return traceRecordsDao;
    }

}