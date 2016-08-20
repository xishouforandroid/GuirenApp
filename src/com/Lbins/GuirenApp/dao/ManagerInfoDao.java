package com.Lbins.GuirenApp.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.Lbins.GuirenApp.module.ManagerInfo;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MANAGER_INFO.
*/
public class ManagerInfoDao extends AbstractDao<ManagerInfo, String> {

    public static final String TABLENAME = "MANAGER_INFO";

    /**
     * Properties of entity ManagerInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property ManagerId = new Property(1, String.class, "managerId", false, "MANAGER_ID");
        public final static Property RealName = new Property(2, String.class, "realName", false, "REAL_NAME");
        public final static Property Idcard = new Property(3, String.class, "idcard", false, "IDCARD");
        public final static Property IdcardUrl = new Property(4, String.class, "idcardUrl", false, "IDCARD_URL");
        public final static Property PayNumber = new Property(5, String.class, "payNumber", false, "PAY_NUMBER");
        public final static Property CheckName = new Property(6, String.class, "checkName", false, "CHECK_NAME");
        public final static Property BankCard = new Property(7, String.class, "bankCard", false, "BANK_CARD");
        public final static Property BankType = new Property(8, String.class, "bankType", false, "BANK_TYPE");
        public final static Property BankAddress = new Property(9, String.class, "bankAddress", false, "BANK_ADDRESS");
        public final static Property BankName = new Property(10, String.class, "bankName", false, "BANK_NAME");
        public final static Property Mobile = new Property(11, String.class, "mobile", false, "MOBILE");
        public final static Property Lat_company = new Property(12, String.class, "lat_company", false, "LAT_COMPANY");
        public final static Property Lng_company = new Property(13, String.class, "lng_company", false, "LNG_COMPANY");
        public final static Property Company_address = new Property(14, String.class, "company_address", false, "COMPANY_ADDRESS");
        public final static Property Company_person = new Property(15, String.class, "company_person", false, "COMPANY_PERSON");
        public final static Property Company_detail = new Property(16, String.class, "company_detail", false, "COMPANY_DETAIL");
        public final static Property Company_tel = new Property(17, String.class, "company_tel", false, "COMPANY_TEL");
        public final static Property Company_name = new Property(18, String.class, "company_name", false, "COMPANY_NAME");
        public final static Property Yingye_time_start = new Property(19, String.class, "yingye_time_start", false, "YINGYE_TIME_START");
        public final static Property Yingye_time_end = new Property(20, String.class, "yingye_time_end", false, "YINGYE_TIME_END");
        public final static Property Shouhui = new Property(21, String.class, "shouhui", false, "SHOUHUI");
        public final static Property Company_pic = new Property(22, String.class, "company_pic", false, "COMPANY_PIC");
        public final static Property Emp_id = new Property(23, String.class, "emp_id", false, "EMP_ID");
        public final static Property Emp_cover = new Property(24, String.class, "emp_cover", false, "EMP_COVER");
    };

    private DaoSession daoSession;


    public ManagerInfoDao(DaoConfig config) {
        super(config);
    }
    
    public ManagerInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MANAGER_INFO' (" + //
                "'ID' TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "'MANAGER_ID' TEXT," + // 1: managerId
                "'REAL_NAME' TEXT," + // 2: realName
                "'IDCARD' TEXT," + // 3: idcard
                "'IDCARD_URL' TEXT," + // 4: idcardUrl
                "'PAY_NUMBER' TEXT," + // 5: payNumber
                "'CHECK_NAME' TEXT," + // 6: checkName
                "'BANK_CARD' TEXT," + // 7: bankCard
                "'BANK_TYPE' TEXT," + // 8: bankType
                "'BANK_ADDRESS' TEXT," + // 9: bankAddress
                "'BANK_NAME' TEXT," + // 10: bankName
                "'MOBILE' TEXT," + // 11: mobile
                "'LAT_COMPANY' TEXT," + // 12: lat_company
                "'LNG_COMPANY' TEXT," + // 13: lng_company
                "'COMPANY_ADDRESS' TEXT," + // 14: company_address
                "'COMPANY_PERSON' TEXT," + // 15: company_person
                "'COMPANY_DETAIL' TEXT," + // 16: company_detail
                "'COMPANY_TEL' TEXT," + // 17: company_tel
                "'COMPANY_NAME' TEXT," + // 18: company_name
                "'YINGYE_TIME_START' TEXT," + // 19: yingye_time_start
                "'YINGYE_TIME_END' TEXT," + // 20: yingye_time_end
                "'SHOUHUI' TEXT," + // 21: shouhui
                "'COMPANY_PIC' TEXT," + // 22: company_pic
                "'EMP_ID' TEXT," + // 23: emp_id
                "'EMP_COVER' TEXT);"); // 24: emp_cover
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MANAGER_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ManagerInfo entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getId());
 
        String managerId = entity.getManagerId();
        if (managerId != null) {
            stmt.bindString(2, managerId);
        }
 
        String realName = entity.getRealName();
        if (realName != null) {
            stmt.bindString(3, realName);
        }
 
        String idcard = entity.getIdcard();
        if (idcard != null) {
            stmt.bindString(4, idcard);
        }
 
        String idcardUrl = entity.getIdcardUrl();
        if (idcardUrl != null) {
            stmt.bindString(5, idcardUrl);
        }
 
        String payNumber = entity.getPayNumber();
        if (payNumber != null) {
            stmt.bindString(6, payNumber);
        }
 
        String checkName = entity.getCheckName();
        if (checkName != null) {
            stmt.bindString(7, checkName);
        }
 
        String bankCard = entity.getBankCard();
        if (bankCard != null) {
            stmt.bindString(8, bankCard);
        }
 
        String bankType = entity.getBankType();
        if (bankType != null) {
            stmt.bindString(9, bankType);
        }
 
        String bankAddress = entity.getBankAddress();
        if (bankAddress != null) {
            stmt.bindString(10, bankAddress);
        }
 
        String bankName = entity.getBankName();
        if (bankName != null) {
            stmt.bindString(11, bankName);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(12, mobile);
        }
 
        String lat_company = entity.getLat_company();
        if (lat_company != null) {
            stmt.bindString(13, lat_company);
        }
 
        String lng_company = entity.getLng_company();
        if (lng_company != null) {
            stmt.bindString(14, lng_company);
        }
 
        String company_address = entity.getCompany_address();
        if (company_address != null) {
            stmt.bindString(15, company_address);
        }
 
        String company_person = entity.getCompany_person();
        if (company_person != null) {
            stmt.bindString(16, company_person);
        }
 
        String company_detail = entity.getCompany_detail();
        if (company_detail != null) {
            stmt.bindString(17, company_detail);
        }
 
        String company_tel = entity.getCompany_tel();
        if (company_tel != null) {
            stmt.bindString(18, company_tel);
        }
 
        String company_name = entity.getCompany_name();
        if (company_name != null) {
            stmt.bindString(19, company_name);
        }
 
        String yingye_time_start = entity.getYingye_time_start();
        if (yingye_time_start != null) {
            stmt.bindString(20, yingye_time_start);
        }
 
        String yingye_time_end = entity.getYingye_time_end();
        if (yingye_time_end != null) {
            stmt.bindString(21, yingye_time_end);
        }
 
        String shouhui = entity.getShouhui();
        if (shouhui != null) {
            stmt.bindString(22, shouhui);
        }
 
        String company_pic = entity.getCompany_pic();
        if (company_pic != null) {
            stmt.bindString(23, company_pic);
        }
 
        String emp_id = entity.getEmp_id();
        if (emp_id != null) {
            stmt.bindString(24, emp_id);
        }
 
        String emp_cover = entity.getEmp_cover();
        if (emp_cover != null) {
            stmt.bindString(25, emp_cover);
        }
    }

    @Override
    protected void attachEntity(ManagerInfo entity) {
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
    public ManagerInfo readEntity(Cursor cursor, int offset) {
        ManagerInfo entity = new ManagerInfo( //
            cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // managerId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // realName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // idcard
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // idcardUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // payNumber
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // checkName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // bankCard
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // bankType
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // bankAddress
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // bankName
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // mobile
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // lat_company
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // lng_company
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // company_address
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // company_person
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // company_detail
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // company_tel
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // company_name
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // yingye_time_start
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // yingye_time_end
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // shouhui
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // company_pic
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // emp_id
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24) // emp_cover
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ManagerInfo entity, int offset) {
        entity.setId(cursor.getString(offset + 0));
        entity.setManagerId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setRealName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIdcard(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIdcardUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPayNumber(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCheckName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBankCard(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setBankType(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setBankAddress(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setBankName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setMobile(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLat_company(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setLng_company(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCompany_address(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCompany_person(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setCompany_detail(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setCompany_tel(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setCompany_name(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setYingye_time_start(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setYingye_time_end(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setShouhui(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setCompany_pic(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setEmp_id(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setEmp_cover(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(ManagerInfo entity, long rowId) {
        return entity.getId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(ManagerInfo entity) {
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