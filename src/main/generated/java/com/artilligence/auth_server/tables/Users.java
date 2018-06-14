/*
 * This file is generated by jOOQ.
*/
package com.artilligence.auth_server.tables;


import com.artilligence.auth_server.AuthJava;
import com.artilligence.auth_server.Indexes;
import com.artilligence.auth_server.Keys;
import com.artilligence.auth_server.enums.UsersGender;
import com.artilligence.auth_server.tables.records.UsersRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = -1630715747;

    /**
     * The reference instance of <code>auth_java.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>auth_java.users.id</code>.
     */
    public final TableField<UsersRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>auth_java.users.created_at</code>. ????? ????????
     */
    public final TableField<UsersRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "????? ????????");

    /**
     * The column <code>auth_java.users.updated_at</code>. ????? ??????????
     */
    public final TableField<UsersRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "????? ??????????");

    /**
     * The column <code>auth_java.users.changed_at</code>. ????? ?????????
     */
    public final TableField<UsersRecord, Timestamp> CHANGED_AT = createField("changed_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "????? ?????????");

    /**
     * The column <code>auth_java.users.last_visit</code>. ????????? ????
     */
    public final TableField<UsersRecord, Timestamp> LAST_VISIT = createField("last_visit", org.jooq.impl.SQLDataType.TIMESTAMP, this, "????????? ????");

    /**
     * The column <code>auth_java.users.creator_id</code>. ????????? ??????
     */
    public final TableField<UsersRecord, UInteger> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "????????? ??????");

    /**
     * The column <code>auth_java.users.editor_id</code>. ???????? ??????
     */
    public final TableField<UsersRecord, UInteger> EDITOR_ID = createField("editor_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "???????? ??????");

    /**
     * The column <code>auth_java.users.status</code>. ???./????.
     */
    public final TableField<UsersRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "???./????.");

    /**
     * The column <code>auth_java.users.merged</code>. ???????????? ????????????
     */
    public final TableField<UsersRecord, String> MERGED = createField("merged", org.jooq.impl.SQLDataType.CLOB, this, "???????????? ????????????");

    /**
     * The column <code>auth_java.users.nickname</code>. ???????????? ???
     */
    public final TableField<UsersRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "???????????? ???");

    /**
     * The column <code>auth_java.users.first_name</code>. ???
     */
    public final TableField<UsersRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "???");

    /**
     * The column <code>auth_java.users.father_name</code>. ????????
     */
    public final TableField<UsersRecord, String> FATHER_NAME = createField("father_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "????????");

    /**
     * The column <code>auth_java.users.last_name</code>. ???????
     */
    public final TableField<UsersRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "???????");

    /**
     * The column <code>auth_java.users.birth_date</code>. ???? ????????
     */
    public final TableField<UsersRecord, Date> BIRTH_DATE = createField("birth_date", org.jooq.impl.SQLDataType.DATE, this, "???? ????????");

    /**
     * The column <code>auth_java.users.gender</code>. ???
     */
    public final TableField<UsersRecord, UsersGender> GENDER = createField("gender", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.artilligence.auth_server.enums.UsersGender.class), this, "???");

    /**
     * The column <code>auth_java.users.language</code>.
     */
    public final TableField<UsersRecord, String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>auth_java.users</code> pojo reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>auth_java.users</code> pojo reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>auth_java.users</code> pojo reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return AuthJava.AUTH_JAVA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_PRIMARY, Indexes.USERS_USERS_CREATOR_ID_INDEX, Indexes.USERS_USERS_EDITOR_ID_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UsersRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this pojo
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this pojo
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }
}