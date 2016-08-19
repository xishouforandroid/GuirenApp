package com.Lbins.GuirenApp.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.Lbins.GuirenApp.module.EmpDianpu;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table EMP_DIANPU.
*/
public class EmpDianpuDao extends AbstractDao<EmpDianpu, String> {

    public static final String TABLENAME = "EMP_DIANPU";

    /**
     * Properties of entity EmpDianpu.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Mm_emp_id = new Property(0, String.class, "mm_emp_id", true, "MM_EMP_ID");
        public final static Property Hxusername = new Property(1, String.class, "hxusername", false, "HXUSERNAME");
        public final static Property Mm_emp_mobile = new Property(2, String.class, "mm_emp_mobile", false, "MM_EMP_MOBILE");
        public final static Property Mm_emp_nickname = new Property(3, String.class, "mm_emp_nickname", false, "MM_EMP_NICKNAME");
        public final static Property Mm_emp_card = new Property(4, String.class, "mm_emp_card", false, "MM_EMP_CARD");
        public final static Property Mm_emp_password = new Property(5, String.class, "mm_emp_password", false, "MM_EMP_PASSWORD");
        public final static Property Mm_emp_cover = new Property(6, String.class, "mm_emp_cover", false, "MM_EMP_COVER");
        public final static Property Mm_emp_company = new Property(7, String.class, "mm_emp_company", false, "MM_EMP_COMPANY");
        public final static Property Mm_emp_provinceId = new Property(8, String.class, "mm_emp_provinceId", false, "MM_EMP_PROVINCE_ID");
        public final static Property Mm_emp_cityId = new Property(9, String.class, "mm_emp_cityId", false, "MM_EMP_CITY_ID");
        public final static Property Mm_emp_countryId = new Property(10, String.class, "mm_emp_countryId", false, "MM_EMP_COUNTRY_ID");
        public final static Property Mm_emp_regtime = new Property(11, String.class, "mm_emp_regtime", false, "MM_EMP_REGTIME");
        public final static Property Is_login = new Property(12, String.class, "is_login", false, "IS_LOGIN");
        public final static Property Is_use = new Property(13, String.class, "is_use", false, "IS_USE");
        public final static Property Lat = new Property(14, String.class, "lat", false, "LAT");
        public final static Property Lng = new Property(15, String.class, "lng", false, "LNG");
        public final static Property Ischeck = new Property(16, String.class, "ischeck", false, "ISCHECK");
        public final static Property Is_upate_profile = new Property(17, String.class, "is_upate_profile", false, "IS_UPATE_PROFILE");
        public final static Property UserId = new Property(18, String.class, "userId", false, "USER_ID");
        public final static Property ChannelId = new Property(19, String.class, "channelId", false, "CHANNEL_ID");
        public final static Property DeviceType = new Property(20, String.class, "deviceType", false, "DEVICE_TYPE");
        public final static Property Mm_emp_email = new Property(21, String.class, "mm_emp_email", false, "MM_EMP_EMAIL");
        public final static Property Mm_emp_sex = new Property(22, String.class, "mm_emp_sex", false, "MM_EMP_SEX");
        public final static Property Mm_emp_birthday = new Property(23, String.class, "mm_emp_birthday", false, "MM_EMP_BIRTHDAY");
        public final static Property Mm_emp_techang = new Property(24, String.class, "mm_emp_techang", false, "MM_EMP_TECHANG");
        public final static Property Mm_emp_xingqu = new Property(25, String.class, "mm_emp_xingqu", false, "MM_EMP_XINGQU");
        public final static Property Mm_emp_detail = new Property(26, String.class, "mm_emp_detail", false, "MM_EMP_DETAIL");
        public final static Property Guiren_card_num = new Property(27, String.class, "guiren_card_num", false, "GUIREN_CARD_NUM");
        public final static Property Mm_hangye_id = new Property(28, String.class, "mm_hangye_id", false, "MM_HANGYE_ID");
        public final static Property Mm_emp_up_emp = new Property(29, String.class, "mm_emp_up_emp", false, "MM_EMP_UP_EMP");
        public final static Property ProvinceName = new Property(30, String.class, "provinceName", false, "PROVINCE_NAME");
        public final static Property CityName = new Property(31, String.class, "cityName", false, "CITY_NAME");
        public final static Property Mm_hangye_name = new Property(32, String.class, "mm_hangye_name", false, "MM_HANGYE_NAME");
        public final static Property AreaName = new Property(33, String.class, "areaName", false, "AREA_NAME");
        public final static Property Top_number = new Property(34, String.class, "top_number", false, "TOP_NUMBER");
        public final static Property Mm_emp_weixin = new Property(35, String.class, "mm_emp_weixin", false, "MM_EMP_WEIXIN");
        public final static Property Mm_emp_qq = new Property(36, String.class, "mm_emp_qq", false, "MM_EMP_QQ");
        public final static Property Mm_emp_age = new Property(37, String.class, "mm_emp_age", false, "MM_EMP_AGE");
        public final static Property Mm_emp_native = new Property(38, String.class, "mm_emp_native", false, "MM_EMP_NATIVE");
        public final static Property Mm_emp_motto = new Property(39, String.class, "mm_emp_motto", false, "MM_EMP_MOTTO");
        public final static Property Mm_emp_type = new Property(40, String.class, "mm_emp_type", false, "MM_EMP_TYPE");
        public final static Property Mm_emp_bg = new Property(41, String.class, "mm_emp_bg", false, "MM_EMP_BG");
        public final static Property Lat_company = new Property(42, String.class, "lat_company", false, "LAT_COMPANY");
        public final static Property Lng_company = new Property(43, String.class, "lng_company", false, "LNG_COMPANY");
        public final static Property Company_address = new Property(44, String.class, "company_address", false, "COMPANY_ADDRESS");
        public final static Property Company_person = new Property(45, String.class, "company_person", false, "COMPANY_PERSON");
        public final static Property Company_tel = new Property(46, String.class, "company_tel", false, "COMPANY_TEL");
        public final static Property Company_detail = new Property(47, String.class, "company_detail", false, "COMPANY_DETAIL");
        public final static Property Company_name = new Property(48, String.class, "company_name", false, "COMPANY_NAME");
        public final static Property Yingye_time_start = new Property(49, String.class, "yingye_time_start", false, "YINGYE_TIME_START");
        public final static Property Yingye_time_end = new Property(50, String.class, "yingye_time_end", false, "YINGYE_TIME_END");
        public final static Property Shouhui = new Property(51, String.class, "shouhui", false, "SHOUHUI");
        public final static Property Company_pic = new Property(52, String.class, "company_pic", false, "COMPANY_PIC");
        public final static Property School_three_pingtai_name = new Property(53, String.class, "school_three_pingtai_name", false, "SCHOOL_THREE_PINGTAI_NAME");
        public final static Property School_three_pingtai_pic = new Property(54, String.class, "school_three_pingtai_pic", false, "SCHOOL_THREE_PINGTAI_PIC");
        public final static Property Pingtai_url = new Property(55, String.class, "pingtai_url", false, "PINGTAI_URL");
        public final static Property Mm_ad_url = new Property(56, String.class, "mm_ad_url", false, "MM_AD_URL");
        public final static Property Mm_ad_pic = new Property(57, String.class, "mm_ad_pic", false, "MM_AD_PIC");
        public final static Property Mm_ad_title = new Property(58, String.class, "mm_ad_title", false, "MM_AD_TITLE");
    };

    private DaoSession daoSession;


    public EmpDianpuDao(DaoConfig config) {
        super(config);
    }
    
    public EmpDianpuDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'EMP_DIANPU' (" + //
                "'MM_EMP_ID' TEXT PRIMARY KEY NOT NULL ," + // 0: mm_emp_id
                "'HXUSERNAME' TEXT NOT NULL ," + // 1: hxusername
                "'MM_EMP_MOBILE' TEXT," + // 2: mm_emp_mobile
                "'MM_EMP_NICKNAME' TEXT," + // 3: mm_emp_nickname
                "'MM_EMP_CARD' TEXT," + // 4: mm_emp_card
                "'MM_EMP_PASSWORD' TEXT," + // 5: mm_emp_password
                "'MM_EMP_COVER' TEXT," + // 6: mm_emp_cover
                "'MM_EMP_COMPANY' TEXT," + // 7: mm_emp_company
                "'MM_EMP_PROVINCE_ID' TEXT," + // 8: mm_emp_provinceId
                "'MM_EMP_CITY_ID' TEXT," + // 9: mm_emp_cityId
                "'MM_EMP_COUNTRY_ID' TEXT," + // 10: mm_emp_countryId
                "'MM_EMP_REGTIME' TEXT," + // 11: mm_emp_regtime
                "'IS_LOGIN' TEXT," + // 12: is_login
                "'IS_USE' TEXT," + // 13: is_use
                "'LAT' TEXT," + // 14: lat
                "'LNG' TEXT," + // 15: lng
                "'ISCHECK' TEXT," + // 16: ischeck
                "'IS_UPATE_PROFILE' TEXT," + // 17: is_upate_profile
                "'USER_ID' TEXT," + // 18: userId
                "'CHANNEL_ID' TEXT," + // 19: channelId
                "'DEVICE_TYPE' TEXT," + // 20: deviceType
                "'MM_EMP_EMAIL' TEXT," + // 21: mm_emp_email
                "'MM_EMP_SEX' TEXT," + // 22: mm_emp_sex
                "'MM_EMP_BIRTHDAY' TEXT," + // 23: mm_emp_birthday
                "'MM_EMP_TECHANG' TEXT," + // 24: mm_emp_techang
                "'MM_EMP_XINGQU' TEXT," + // 25: mm_emp_xingqu
                "'MM_EMP_DETAIL' TEXT," + // 26: mm_emp_detail
                "'GUIREN_CARD_NUM' TEXT," + // 27: guiren_card_num
                "'MM_HANGYE_ID' TEXT," + // 28: mm_hangye_id
                "'MM_EMP_UP_EMP' TEXT," + // 29: mm_emp_up_emp
                "'PROVINCE_NAME' TEXT," + // 30: provinceName
                "'CITY_NAME' TEXT," + // 31: cityName
                "'MM_HANGYE_NAME' TEXT," + // 32: mm_hangye_name
                "'AREA_NAME' TEXT," + // 33: areaName
                "'TOP_NUMBER' TEXT," + // 34: top_number
                "'MM_EMP_WEIXIN' TEXT," + // 35: mm_emp_weixin
                "'MM_EMP_QQ' TEXT," + // 36: mm_emp_qq
                "'MM_EMP_AGE' TEXT," + // 37: mm_emp_age
                "'MM_EMP_NATIVE' TEXT," + // 38: mm_emp_native
                "'MM_EMP_MOTTO' TEXT," + // 39: mm_emp_motto
                "'MM_EMP_TYPE' TEXT," + // 40: mm_emp_type
                "'MM_EMP_BG' TEXT," + // 41: mm_emp_bg
                "'LAT_COMPANY' TEXT," + // 42: lat_company
                "'LNG_COMPANY' TEXT," + // 43: lng_company
                "'COMPANY_ADDRESS' TEXT," + // 44: company_address
                "'COMPANY_PERSON' TEXT," + // 45: company_person
                "'COMPANY_TEL' TEXT," + // 46: company_tel
                "'COMPANY_DETAIL' TEXT," + // 47: company_detail
                "'COMPANY_NAME' TEXT," + // 48: company_name
                "'YINGYE_TIME_START' TEXT," + // 49: yingye_time_start
                "'YINGYE_TIME_END' TEXT," + // 50: yingye_time_end
                "'SHOUHUI' TEXT," + // 51: shouhui
                "'COMPANY_PIC' TEXT," + // 52: company_pic
                "'SCHOOL_THREE_PINGTAI_NAME' TEXT," + // 53: school_three_pingtai_name
                "'SCHOOL_THREE_PINGTAI_PIC' TEXT," + // 54: school_three_pingtai_pic
                "'PINGTAI_URL' TEXT," + // 55: pingtai_url
                "'MM_AD_URL' TEXT," + // 56: mm_ad_url
                "'MM_AD_PIC' TEXT," + // 57: mm_ad_pic
                "'MM_AD_TITLE' TEXT);"); // 58: mm_ad_title
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'EMP_DIANPU'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, EmpDianpu entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getMm_emp_id());
        stmt.bindString(2, entity.getHxusername());
 
        String mm_emp_mobile = entity.getMm_emp_mobile();
        if (mm_emp_mobile != null) {
            stmt.bindString(3, mm_emp_mobile);
        }
 
        String mm_emp_nickname = entity.getMm_emp_nickname();
        if (mm_emp_nickname != null) {
            stmt.bindString(4, mm_emp_nickname);
        }
 
        String mm_emp_card = entity.getMm_emp_card();
        if (mm_emp_card != null) {
            stmt.bindString(5, mm_emp_card);
        }
 
        String mm_emp_password = entity.getMm_emp_password();
        if (mm_emp_password != null) {
            stmt.bindString(6, mm_emp_password);
        }
 
        String mm_emp_cover = entity.getMm_emp_cover();
        if (mm_emp_cover != null) {
            stmt.bindString(7, mm_emp_cover);
        }
 
        String mm_emp_company = entity.getMm_emp_company();
        if (mm_emp_company != null) {
            stmt.bindString(8, mm_emp_company);
        }
 
        String mm_emp_provinceId = entity.getMm_emp_provinceId();
        if (mm_emp_provinceId != null) {
            stmt.bindString(9, mm_emp_provinceId);
        }
 
        String mm_emp_cityId = entity.getMm_emp_cityId();
        if (mm_emp_cityId != null) {
            stmt.bindString(10, mm_emp_cityId);
        }
 
        String mm_emp_countryId = entity.getMm_emp_countryId();
        if (mm_emp_countryId != null) {
            stmt.bindString(11, mm_emp_countryId);
        }
 
        String mm_emp_regtime = entity.getMm_emp_regtime();
        if (mm_emp_regtime != null) {
            stmt.bindString(12, mm_emp_regtime);
        }
 
        String is_login = entity.getIs_login();
        if (is_login != null) {
            stmt.bindString(13, is_login);
        }
 
        String is_use = entity.getIs_use();
        if (is_use != null) {
            stmt.bindString(14, is_use);
        }
 
        String lat = entity.getLat();
        if (lat != null) {
            stmt.bindString(15, lat);
        }
 
        String lng = entity.getLng();
        if (lng != null) {
            stmt.bindString(16, lng);
        }
 
        String ischeck = entity.getIscheck();
        if (ischeck != null) {
            stmt.bindString(17, ischeck);
        }
 
        String is_upate_profile = entity.getIs_upate_profile();
        if (is_upate_profile != null) {
            stmt.bindString(18, is_upate_profile);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(19, userId);
        }
 
        String channelId = entity.getChannelId();
        if (channelId != null) {
            stmt.bindString(20, channelId);
        }
 
        String deviceType = entity.getDeviceType();
        if (deviceType != null) {
            stmt.bindString(21, deviceType);
        }
 
        String mm_emp_email = entity.getMm_emp_email();
        if (mm_emp_email != null) {
            stmt.bindString(22, mm_emp_email);
        }
 
        String mm_emp_sex = entity.getMm_emp_sex();
        if (mm_emp_sex != null) {
            stmt.bindString(23, mm_emp_sex);
        }
 
        String mm_emp_birthday = entity.getMm_emp_birthday();
        if (mm_emp_birthday != null) {
            stmt.bindString(24, mm_emp_birthday);
        }
 
        String mm_emp_techang = entity.getMm_emp_techang();
        if (mm_emp_techang != null) {
            stmt.bindString(25, mm_emp_techang);
        }
 
        String mm_emp_xingqu = entity.getMm_emp_xingqu();
        if (mm_emp_xingqu != null) {
            stmt.bindString(26, mm_emp_xingqu);
        }
 
        String mm_emp_detail = entity.getMm_emp_detail();
        if (mm_emp_detail != null) {
            stmt.bindString(27, mm_emp_detail);
        }
 
        String guiren_card_num = entity.getGuiren_card_num();
        if (guiren_card_num != null) {
            stmt.bindString(28, guiren_card_num);
        }
 
        String mm_hangye_id = entity.getMm_hangye_id();
        if (mm_hangye_id != null) {
            stmt.bindString(29, mm_hangye_id);
        }
 
        String mm_emp_up_emp = entity.getMm_emp_up_emp();
        if (mm_emp_up_emp != null) {
            stmt.bindString(30, mm_emp_up_emp);
        }
 
        String provinceName = entity.getProvinceName();
        if (provinceName != null) {
            stmt.bindString(31, provinceName);
        }
 
        String cityName = entity.getCityName();
        if (cityName != null) {
            stmt.bindString(32, cityName);
        }
 
        String mm_hangye_name = entity.getMm_hangye_name();
        if (mm_hangye_name != null) {
            stmt.bindString(33, mm_hangye_name);
        }
 
        String areaName = entity.getAreaName();
        if (areaName != null) {
            stmt.bindString(34, areaName);
        }
 
        String top_number = entity.getTop_number();
        if (top_number != null) {
            stmt.bindString(35, top_number);
        }
 
        String mm_emp_weixin = entity.getMm_emp_weixin();
        if (mm_emp_weixin != null) {
            stmt.bindString(36, mm_emp_weixin);
        }
 
        String mm_emp_qq = entity.getMm_emp_qq();
        if (mm_emp_qq != null) {
            stmt.bindString(37, mm_emp_qq);
        }
 
        String mm_emp_age = entity.getMm_emp_age();
        if (mm_emp_age != null) {
            stmt.bindString(38, mm_emp_age);
        }
 
        String mm_emp_native = entity.getMm_emp_native();
        if (mm_emp_native != null) {
            stmt.bindString(39, mm_emp_native);
        }
 
        String mm_emp_motto = entity.getMm_emp_motto();
        if (mm_emp_motto != null) {
            stmt.bindString(40, mm_emp_motto);
        }
 
        String mm_emp_type = entity.getMm_emp_type();
        if (mm_emp_type != null) {
            stmt.bindString(41, mm_emp_type);
        }
 
        String mm_emp_bg = entity.getMm_emp_bg();
        if (mm_emp_bg != null) {
            stmt.bindString(42, mm_emp_bg);
        }
 
        String lat_company = entity.getLat_company();
        if (lat_company != null) {
            stmt.bindString(43, lat_company);
        }
 
        String lng_company = entity.getLng_company();
        if (lng_company != null) {
            stmt.bindString(44, lng_company);
        }
 
        String company_address = entity.getCompany_address();
        if (company_address != null) {
            stmt.bindString(45, company_address);
        }
 
        String company_person = entity.getCompany_person();
        if (company_person != null) {
            stmt.bindString(46, company_person);
        }
 
        String company_tel = entity.getCompany_tel();
        if (company_tel != null) {
            stmt.bindString(47, company_tel);
        }
 
        String company_detail = entity.getCompany_detail();
        if (company_detail != null) {
            stmt.bindString(48, company_detail);
        }
 
        String company_name = entity.getCompany_name();
        if (company_name != null) {
            stmt.bindString(49, company_name);
        }
 
        String yingye_time_start = entity.getYingye_time_start();
        if (yingye_time_start != null) {
            stmt.bindString(50, yingye_time_start);
        }
 
        String yingye_time_end = entity.getYingye_time_end();
        if (yingye_time_end != null) {
            stmt.bindString(51, yingye_time_end);
        }
 
        String shouhui = entity.getShouhui();
        if (shouhui != null) {
            stmt.bindString(52, shouhui);
        }
 
        String company_pic = entity.getCompany_pic();
        if (company_pic != null) {
            stmt.bindString(53, company_pic);
        }
 
        String school_three_pingtai_name = entity.getSchool_three_pingtai_name();
        if (school_three_pingtai_name != null) {
            stmt.bindString(54, school_three_pingtai_name);
        }
 
        String school_three_pingtai_pic = entity.getSchool_three_pingtai_pic();
        if (school_three_pingtai_pic != null) {
            stmt.bindString(55, school_three_pingtai_pic);
        }
 
        String pingtai_url = entity.getPingtai_url();
        if (pingtai_url != null) {
            stmt.bindString(56, pingtai_url);
        }
 
        String mm_ad_url = entity.getMm_ad_url();
        if (mm_ad_url != null) {
            stmt.bindString(57, mm_ad_url);
        }
 
        String mm_ad_pic = entity.getMm_ad_pic();
        if (mm_ad_pic != null) {
            stmt.bindString(58, mm_ad_pic);
        }
 
        String mm_ad_title = entity.getMm_ad_title();
        if (mm_ad_title != null) {
            stmt.bindString(59, mm_ad_title);
        }
    }

    @Override
    protected void attachEntity(EmpDianpu entity) {
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
    public EmpDianpu readEntity(Cursor cursor, int offset) {
        EmpDianpu entity = new EmpDianpu( //
            cursor.getString(offset + 0), // mm_emp_id
            cursor.getString(offset + 1), // hxusername
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // mm_emp_mobile
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // mm_emp_nickname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mm_emp_card
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // mm_emp_password
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mm_emp_cover
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // mm_emp_company
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // mm_emp_provinceId
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // mm_emp_cityId
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // mm_emp_countryId
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // mm_emp_regtime
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // is_login
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // is_use
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // lat
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // lng
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ischeck
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // is_upate_profile
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // userId
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // channelId
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // deviceType
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // mm_emp_email
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // mm_emp_sex
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // mm_emp_birthday
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // mm_emp_techang
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // mm_emp_xingqu
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // mm_emp_detail
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // guiren_card_num
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // mm_hangye_id
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // mm_emp_up_emp
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // provinceName
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // cityName
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // mm_hangye_name
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // areaName
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // top_number
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // mm_emp_weixin
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36), // mm_emp_qq
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // mm_emp_age
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38), // mm_emp_native
            cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39), // mm_emp_motto
            cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40), // mm_emp_type
            cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41), // mm_emp_bg
            cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42), // lat_company
            cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43), // lng_company
            cursor.isNull(offset + 44) ? null : cursor.getString(offset + 44), // company_address
            cursor.isNull(offset + 45) ? null : cursor.getString(offset + 45), // company_person
            cursor.isNull(offset + 46) ? null : cursor.getString(offset + 46), // company_tel
            cursor.isNull(offset + 47) ? null : cursor.getString(offset + 47), // company_detail
            cursor.isNull(offset + 48) ? null : cursor.getString(offset + 48), // company_name
            cursor.isNull(offset + 49) ? null : cursor.getString(offset + 49), // yingye_time_start
            cursor.isNull(offset + 50) ? null : cursor.getString(offset + 50), // yingye_time_end
            cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51), // shouhui
            cursor.isNull(offset + 52) ? null : cursor.getString(offset + 52), // company_pic
            cursor.isNull(offset + 53) ? null : cursor.getString(offset + 53), // school_three_pingtai_name
            cursor.isNull(offset + 54) ? null : cursor.getString(offset + 54), // school_three_pingtai_pic
            cursor.isNull(offset + 55) ? null : cursor.getString(offset + 55), // pingtai_url
            cursor.isNull(offset + 56) ? null : cursor.getString(offset + 56), // mm_ad_url
            cursor.isNull(offset + 57) ? null : cursor.getString(offset + 57), // mm_ad_pic
            cursor.isNull(offset + 58) ? null : cursor.getString(offset + 58) // mm_ad_title
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, EmpDianpu entity, int offset) {
        entity.setMm_emp_id(cursor.getString(offset + 0));
        entity.setHxusername(cursor.getString(offset + 1));
        entity.setMm_emp_mobile(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMm_emp_nickname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMm_emp_card(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMm_emp_password(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMm_emp_cover(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setMm_emp_company(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMm_emp_provinceId(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMm_emp_cityId(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setMm_emp_countryId(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setMm_emp_regtime(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setIs_login(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setIs_use(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setLat(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setLng(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setIscheck(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setIs_upate_profile(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setUserId(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setChannelId(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setDeviceType(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setMm_emp_email(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setMm_emp_sex(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setMm_emp_birthday(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setMm_emp_techang(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setMm_emp_xingqu(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setMm_emp_detail(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setGuiren_card_num(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setMm_hangye_id(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setMm_emp_up_emp(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setProvinceName(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setCityName(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setMm_hangye_name(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setAreaName(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setTop_number(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setMm_emp_weixin(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setMm_emp_qq(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
        entity.setMm_emp_age(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setMm_emp_native(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
        entity.setMm_emp_motto(cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39));
        entity.setMm_emp_type(cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40));
        entity.setMm_emp_bg(cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41));
        entity.setLat_company(cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42));
        entity.setLng_company(cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43));
        entity.setCompany_address(cursor.isNull(offset + 44) ? null : cursor.getString(offset + 44));
        entity.setCompany_person(cursor.isNull(offset + 45) ? null : cursor.getString(offset + 45));
        entity.setCompany_tel(cursor.isNull(offset + 46) ? null : cursor.getString(offset + 46));
        entity.setCompany_detail(cursor.isNull(offset + 47) ? null : cursor.getString(offset + 47));
        entity.setCompany_name(cursor.isNull(offset + 48) ? null : cursor.getString(offset + 48));
        entity.setYingye_time_start(cursor.isNull(offset + 49) ? null : cursor.getString(offset + 49));
        entity.setYingye_time_end(cursor.isNull(offset + 50) ? null : cursor.getString(offset + 50));
        entity.setShouhui(cursor.isNull(offset + 51) ? null : cursor.getString(offset + 51));
        entity.setCompany_pic(cursor.isNull(offset + 52) ? null : cursor.getString(offset + 52));
        entity.setSchool_three_pingtai_name(cursor.isNull(offset + 53) ? null : cursor.getString(offset + 53));
        entity.setSchool_three_pingtai_pic(cursor.isNull(offset + 54) ? null : cursor.getString(offset + 54));
        entity.setPingtai_url(cursor.isNull(offset + 55) ? null : cursor.getString(offset + 55));
        entity.setMm_ad_url(cursor.isNull(offset + 56) ? null : cursor.getString(offset + 56));
        entity.setMm_ad_pic(cursor.isNull(offset + 57) ? null : cursor.getString(offset + 57));
        entity.setMm_ad_title(cursor.isNull(offset + 58) ? null : cursor.getString(offset + 58));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(EmpDianpu entity, long rowId) {
        return entity.getMm_emp_id();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(EmpDianpu entity) {
        if(entity != null) {
            return entity.getMm_emp_id();
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
