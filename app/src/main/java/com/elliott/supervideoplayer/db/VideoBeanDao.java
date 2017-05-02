package com.elliott.supervideoplayer.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.elliott.supervideoplayer.model.VideoBean;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table VIDEO_BEAN.
 */
public class VideoBeanDao extends AbstractDao<VideoBean, Long> {

    public static final String TABLENAME = "VIDEO_BEAN";

    /**

     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property VideoName = new Property(1, String.class, "VideoName", false, "VIDEO_NAME");
        public final static Property VideoLink = new Property(2, String.class, "VideoLink", false, "VIDEO_LINK");
        public final static Property ThumbnailPath = new Property(3, String.class, "thumbnailPath", false, "THUMBNAIL_PATH");
        public final static Property Totalsize = new Property(4, String.class, "totalsize", false, "TOTALSIZE");
        public final static Property Totalduration = new Property(5, String.class, "totalduration", false, "TOTALDURATION");
        public final static Property Type = new Property(6, Integer.class, "type", false, "TYPE");
        public final static Property Time = new Property(7, Long.class, "time", false, "TIME");
    }

    ;


    public VideoBeanDao(DaoConfig config) {
        super(config);
    }

    public VideoBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'VIDEO_BEAN' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'VIDEO_NAME' TEXT NOT NULL ," + // 1: VideoName
                "'VIDEO_LINK' TEXT," + // 2: VideoLink
                "'THUMBNAIL_PATH' TEXT," + // 3: thumbnailPath
                "'TOTALSIZE' TEXT," + // 4: totalsize
                "'TOTALDURATION' TEXT," + // 5: totalduration
                "'TYPE' INTEGER," +
                "'TIME' LONG);"); // 6: type
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'VIDEO_BEAN'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, VideoBean entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getVideoName());

        String VideoLink = entity.getVideoLink();
        if (VideoLink != null) {
            stmt.bindString(3, VideoLink);
        }

        String thumbnailPath = entity.getThumbnailPath();
        if (thumbnailPath != null) {
            stmt.bindString(4, thumbnailPath);
        }

        String totalsize = entity.getTotalsize();
        if (totalsize != null) {
            stmt.bindString(5, totalsize);
        }

        String totalduration = entity.getTotalduration();
        if (totalduration != null) {
            stmt.bindString(6, totalduration);
        }

        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(7, type);
        }

        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(8, time);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public VideoBean readEntity(Cursor cursor, int offset) {
        VideoBean entity = new VideoBean( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getString(offset + 1), // VideoName
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // VideoLink
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // thumbnailPath
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // totalsize
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // totalduration
                cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // type
                cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7)
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, VideoBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVideoName(cursor.getString(offset + 1));
        entity.setVideoLink(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setThumbnailPath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTotalsize(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTotalduration(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(VideoBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(VideoBean entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
