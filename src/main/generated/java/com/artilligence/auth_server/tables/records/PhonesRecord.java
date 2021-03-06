/*
 * This file is generated by jOOQ.
*/
package com.artilligence.auth_server.tables.records;


import com.artilligence.auth_server.tables.Phones;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class PhonesRecord extends UpdatableRecordImpl<PhonesRecord> implements Record9<UInteger, UInteger, String, ULong, Byte, Byte, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = 186559524;

    /**
     * Setter for <code>auth_java.phones.id</code>.
     */
    public PhonesRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>auth_java.phones.user_id</code>.
     */
    public PhonesRecord setUserId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.user_id</code>.
     */
    public UInteger getUserId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>auth_java.phones.oauth</code>. ? ????? ??????? oauth-???????? ?????????
     */
    public PhonesRecord setOauth(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.oauth</code>. ? ????? ??????? oauth-???????? ?????????
     */
    public String getOauth() {
        return (String) get(2);
    }

    /**
     * Setter for <code>auth_java.phones.phone</code>. ????? ????????
     */
    public PhonesRecord setPhone(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.phone</code>. ????? ????????
     */
    public ULong getPhone() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>auth_java.phones.status</code>. ???./????.
     */
    public PhonesRecord setStatus(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.status</code>. ???./????.
     */
    public Byte getStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>auth_java.phones.is_default</code>. ????????
     */
    public PhonesRecord setIsDefault(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.is_default</code>. ????????
     */
    public Byte getIsDefault() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>auth_java.phones.confirm_date</code>. ???????????
     */
    public PhonesRecord setConfirmDate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.confirm_date</code>. ???????????
     */
    public Timestamp getConfirmDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>auth_java.phones.code</code>. ??? ?????????
     */
    public PhonesRecord setCode(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.code</code>. ??? ?????????
     */
    public String getCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>auth_java.phones.created_at</code>. ????? ????????
     */
    public PhonesRecord setCreatedAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.phones.created_at</code>. ????? ????????
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, UInteger, String, ULong, Byte, Byte, Timestamp, String, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UInteger, UInteger, String, ULong, Byte, Byte, Timestamp, String, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return Phones.PHONES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return Phones.PHONES.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Phones.PHONES.OAUTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return Phones.PHONES.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Phones.PHONES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return Phones.PHONES.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Phones.PHONES.CONFIRM_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Phones.PHONES.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Phones.PHONES.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOauth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getConfirmDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOauth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getConfirmDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value2(UInteger value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value3(String value) {
        setOauth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value4(ULong value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value5(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value6(Byte value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value7(Timestamp value) {
        setConfirmDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value8(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord value9(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhonesRecord values(UInteger value1, UInteger value2, String value3, ULong value4, Byte value5, Byte value6, Timestamp value7, String value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhonesRecord
     */
    public PhonesRecord() {
        super(Phones.PHONES);
    }

    /**
     * Create a detached, initialised PhonesRecord
     */
    public PhonesRecord(UInteger id, UInteger userId, String oauth, ULong phone, Byte status, Byte isDefault, Timestamp confirmDate, String code, Timestamp createdAt) {
        super(Phones.PHONES);

        set(0, id);
        set(1, userId);
        set(2, oauth);
        set(3, phone);
        set(4, status);
        set(5, isDefault);
        set(6, confirmDate);
        set(7, code);
        set(8, createdAt);
    }
}
