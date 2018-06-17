/*
 * This file is generated by jOOQ.
*/
package com.artilligence.auth_server.tables;


import com.artilligence.auth_server.AuthJava;
import com.artilligence.auth_server.Indexes;
import com.artilligence.auth_server.Keys;
import com.artilligence.auth_server.tables.records.EmailsRecord;

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
public class Emails extends TableImpl<EmailsRecord> {

    private static final long serialVersionUID = 1485483376;

    /**
     * The reference instance of <code>auth_java.emails</code>
     */
    public static final Emails EMAILS = new Emails();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailsRecord> getRecordType() {
        return EmailsRecord.class;
    }

    /**
     * The column <code>auth_java.emails.id</code>.
     */
    public final TableField<EmailsRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>auth_java.emails.user_id</code>.
     */
    public final TableField<EmailsRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>auth_java.emails.oauth</code>. ? ????? ??????? oauth-???????? ?????????
     */
    public final TableField<EmailsRecord, String> OAUTH = createField("oauth", org.jooq.impl.SQLDataType.VARCHAR(255), this, "? ????? ??????? oauth-???????? ?????????");

    /**
     * The column <code>auth_java.emails.email</code>. ????? e-mail
     */
    public final TableField<EmailsRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "????? e-mail");

    /**
     * The column <code>auth_java.emails.status</code>. ???./????.
     */
    public final TableField<EmailsRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "???./????.");

    /**
     * The column <code>auth_java.emails.is_default</code>. ????????
     */
    public final TableField<EmailsRecord, UByte> IS_DEFAULT = createField("is_default", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "????????");

    /**
     * The column <code>auth_java.emails.confirm_date</code>. ???????????
     */
    public final TableField<EmailsRecord, Timestamp> CONFIRM_DATE = createField("confirm_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "???????????");

    /**
     * The column <code>auth_java.emails.code</code>. ??? ?????????
     */
    public final TableField<EmailsRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(90), this, "??? ?????????");

    /**
     * The column <code>auth_java.emails.created_at</code>. ??????
     */
    public final TableField<EmailsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "??????");

    /**
     * Create a <code>auth_java.emails</code> table reference
     */
    public Emails() {
        this(DSL.name("emails"), null);
    }

    /**
     * Create an aliased <code>auth_java.emails</code> table reference
     */
    public Emails(String alias) {
        this(DSL.name(alias), EMAILS);
    }

    /**
     * Create an aliased <code>auth_java.emails</code> table reference
     */
    public Emails(Name alias) {
        this(alias, EMAILS);
    }

    private Emails(Name alias, Table<EmailsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Emails(Name alias, Table<EmailsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.EMAILS_EMAILS_CONFIRM_DATE_INDEX, Indexes.EMAILS_EMAILS_EMAIL_INDEX, Indexes.EMAILS_EMAILS_OAUTH_INDEX, Indexes.EMAILS_EMAILS_STATUS_INDEX, Indexes.EMAILS_EMAILS_USER_ID_INDEX, Indexes.EMAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmailsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_EMAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailsRecord> getPrimaryKey() {
        return Keys.KEY_EMAILS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailsRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailsRecord>>asList(Keys.KEY_EMAILS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emails as(String alias) {
        return new Emails(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Emails as(Name alias) {
        return new Emails(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Emails rename(String name) {
        return new Emails(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Emails rename(Name name) {
        return new Emails(name, null);
    }
}
