/*
 * This file is generated by jOOQ.
*/
package com.artilligence.auth_server.tables;


import com.artilligence.auth_server.AuthJava;
import com.artilligence.auth_server.Indexes;
import com.artilligence.auth_server.Keys;
import com.artilligence.auth_server.tables.records.OauthSessionsRecord;

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
public class OauthSessions extends TableImpl<OauthSessionsRecord> {

    private static final long serialVersionUID = 2040538791;

    /**
     * The reference instance of <code>auth_java.oauth_sessions</code>
     */
    public static final OauthSessions OAUTH_SESSIONS = new OauthSessions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthSessionsRecord> getRecordType() {
        return OauthSessionsRecord.class;
    }

    /**
     * The column <code>auth_java.oauth_sessions.id</code>.
     */
    public final TableField<OauthSessionsRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>auth_java.oauth_sessions.client_id</code>. ??????
     */
    public final TableField<OauthSessionsRecord, UInteger> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "??????");

    /**
     * The column <code>auth_java.oauth_sessions.user_id</code>. ????????????
     */
    public final TableField<OauthSessionsRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "????????????");

    /**
     * The column <code>auth_java.oauth_sessions.access_granted_at</code>. ?????? ??????
     */
    public final TableField<OauthSessionsRecord, Timestamp> ACCESS_GRANTED_AT = createField("access_granted_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "?????? ??????");

    /**
     * The column <code>auth_java.oauth_sessions.access_expires_at</code>. ?????? ????????
     */
    public final TableField<OauthSessionsRecord, Timestamp> ACCESS_EXPIRES_AT = createField("access_expires_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "?????? ????????");

    /**
     * The column <code>auth_java.oauth_sessions.offset</code>. ??????? ?? ??????? (???, ?????? - ??????)
     */
    public final TableField<OauthSessionsRecord, Integer> OFFSET = createField("offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "??????? ?? ??????? (???, ?????? - ??????)");

    /**
     * The column <code>auth_java.oauth_sessions.code</code>. ????????? ???
     */
    public final TableField<OauthSessionsRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "????????? ???");

    /**
     * The column <code>auth_java.oauth_sessions.access_token</code>. ??? ???????
     */
    public final TableField<OauthSessionsRecord, String> ACCESS_TOKEN = createField("access_token", org.jooq.impl.SQLDataType.VARCHAR(100), this, "??? ???????");

    /**
     * The column <code>auth_java.oauth_sessions.user_agent</code>. User Agent
     */
    public final TableField<OauthSessionsRecord, String> USER_AGENT = createField("user_agent", org.jooq.impl.SQLDataType.CLOB, this, "User Agent");

    /**
     * The column <code>auth_java.oauth_sessions.remote_addr</code>. REMOTE_ADDR
     */
    public final TableField<OauthSessionsRecord, String> REMOTE_ADDR = createField("remote_addr", org.jooq.impl.SQLDataType.VARCHAR(25), this, "REMOTE_ADDR");

    /**
     * The column <code>auth_java.oauth_sessions.http_referer</code>. HTTP_REFERER
     */
    public final TableField<OauthSessionsRecord, String> HTTP_REFERER = createField("http_referer", org.jooq.impl.SQLDataType.VARCHAR(255), this, "HTTP_REFERER");

    /**
     * Create a <code>auth_java.oauth_sessions</code> table reference
     */
    public OauthSessions() {
        this(DSL.name("oauth_sessions"), null);
    }

    /**
     * Create an aliased <code>auth_java.oauth_sessions</code> table reference
     */
    public OauthSessions(String alias) {
        this(DSL.name(alias), OAUTH_SESSIONS);
    }

    /**
     * Create an aliased <code>auth_java.oauth_sessions</code> table reference
     */
    public OauthSessions(Name alias) {
        this(alias, OAUTH_SESSIONS);
    }

    private OauthSessions(Name alias, Table<OauthSessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthSessions(Name alias, Table<OauthSessionsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.OAUTH_SESSIONS_OAUTH_SESSIONS_ACCESS_EXPIRES_AT_INDEX, Indexes.OAUTH_SESSIONS_OAUTH_SESSIONS_ACCESS_TOKEN_INDEX, Indexes.OAUTH_SESSIONS_OAUTH_SESSIONS_CLIENT_ID_INDEX, Indexes.OAUTH_SESSIONS_OAUTH_SESSIONS_USER_ID_INDEX, Indexes.OAUTH_SESSIONS_PRIMARY, Indexes.OAUTH_SESSIONS_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OauthSessionsRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_OAUTH_SESSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthSessionsRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_SESSIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthSessionsRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthSessionsRecord>>asList(Keys.KEY_OAUTH_SESSIONS_PRIMARY, Keys.KEY_OAUTH_SESSIONS_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthSessions as(String alias) {
        return new OauthSessions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthSessions as(Name alias) {
        return new OauthSessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthSessions rename(String name) {
        return new OauthSessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthSessions rename(Name name) {
        return new OauthSessions(name, null);
    }
}
