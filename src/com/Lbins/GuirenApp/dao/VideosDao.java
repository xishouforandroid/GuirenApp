package com.Lbins.GuirenApp.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.Lbins.GuirenApp.module.Videos;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table VIDEOS.
*/
public class VideosDao extends AbstractDao<Videos, String> {

    public static final String TABLENAME = "VIDEOS";

    /**
     * Properties of entity Videos.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property PicUrl = new Property(3, String.class, "picUrl", false, "PIC_URL");
        public final static Property VideoUrl = new Property(4, String.class, "videoUrl", false, "VIDEO_URL");
        public final static Property Isdel = new Property(5, String.class, "isdel", false, "ISDEL");
        public final static Property Dateline = new Property(6, String.class, "dateline", false, "DATELINE");
        public final static Property ZanNum = new Property(7, String.class, "zanNum", false, "ZAN_NUM");
        public final static Property PlNum = new Property(8, String.class, "plNum", false, "PL_NUM");
    };

    private DaoSession daoSession;


    public VideosDao(DaoConfig config) {
        super(config);
    }
    
    public VideosDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'VIDEOS' (" + //
                "'ID' TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "'TITLE' TEXT NOT NULL ," + // 1: title
                "'CONTENT' TEXT," + // 2: content
                "'PIC_URL' TEXT," + // 3: picUrl
                "'VIDEO_URL' TEXT," + // 4: videoUrl
                "'ISDEL' TEXT," + // 5: isdel
                "'DATELINE' TEXT," + // 6: dateline
                "'ZAN_NUM' TEXT," + // 7: zanNum
                "'PL_NUM' TEXT);"); // 8: plNum
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'VIDEOS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Videos entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId());
        stmt.bindString(2, entity.getTitle());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String picUrl = entity.getPicUrl();
        if (picUrl != null) {
            stmt.bindString(4, picUrl);
        }
 
        String videoUrl = entity.getVideoUrl();
        if (videoUrl != null) {
            stmt.bindString(5, videoUrl);
        }
 
        String isdel = entity.getIsdel();
        if (isdel != null) {
            stmt.bindString(6, isdel);
        }
 
        String dateline = entity.getDateline();
        if (dateline != null) {
            stmt.bindString(7, dateline);
        }
 
        String zanNum = entity.getZanNum();
        if (zanNum != null) {
            stmt.bindString(8, zanNum);
        }
 
        String plNum = entity.getPlNum();
        if (plNum != null) {
            stmt.bindString(9, plNum);
        }
    }

    @Override
    protected void attachEntity(Videos entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Videos readEntity(Cursor cursor, int offset) {
        Videos entity = new Videos( //
            cursor.getString(offset + 0), // id
            cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // picUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // videoUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // isdel
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // dateline
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // zanNum
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // plNum
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Videos entity, int offset) {
        entity.setId(cursor.getString(offset + 0));
        entity.setTitle(cursor.getString(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPicUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setVideoUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsdel(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDateline(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setZanNum(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPlNum(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(Videos entity, long rowId) {
        return entity.getId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(Videos entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}