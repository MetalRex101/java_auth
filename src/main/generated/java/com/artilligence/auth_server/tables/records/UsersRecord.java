/*
 * This file is generated by jOOQ.
*/
package com.artilligence.auth_server.tables.records;


import com.artilligence.auth_server.enums.UsersGender;
import com.artilligence.auth_server.tables.Users;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record16<UInteger, Timestamp, Timestamp, Timestamp, Timestamp, UInteger, UInteger, UByte, String, String, String, String, String, Date, UsersGender, String> {

    private static final long serialVersionUID = -622537757;

    /**
     * Setter for <code>auth_java.users.id</code>.
     */
    public UsersRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>auth_java.users.created_at</code>. ????? ????????
     */
    public UsersRecord setCreatedAt(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.created_at</code>. ????? ????????
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>auth_java.users.updated_at</code>. ????? ??????????
     */
    public UsersRecord setUpdatedAt(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.updated_at</code>. ????? ??????????
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>auth_java.users.changed_at</code>. ????? ?????????
     */
    public UsersRecord setChangedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.changed_at</code>. ????? ?????????
     */
    public Timestamp getChangedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>auth_java.users.last_visit</code>. ????????? ????
     */
    public UsersRecord setLastVisit(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.last_visit</code>. ????????? ????
     */
    public Timestamp getLastVisit() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>auth_java.users.creator_id</code>. ????????? ??????
     */
    public UsersRecord setCreatorId(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.creator_id</code>. ????????? ??????
     */
    public UInteger getCreatorId() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>auth_java.users.editor_id</code>. ???????? ??????
     */
    public UsersRecord setEditorId(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.editor_id</code>. ???????? ??????
     */
    public UInteger getEditorId() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>auth_java.users.status</code>. ???./????.
     */
    public UsersRecord setStatus(UByte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.status</code>. ???./????.
     */
    public UByte getStatus() {
        return (UByte) get(7);
    }

    /**
     * Setter for <code>auth_java.users.merged</code>. ???????????? ????????????
     */
    public UsersRecord setMerged(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.merged</code>. ???????????? ????????????
     */
    public String getMerged() {
        return (String) get(8);
    }

    /**
     * Setter for <code>auth_java.users.nickname</code>. ???????????? ???
     */
    public UsersRecord setNickname(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.nickname</code>. ???????????? ???
     */
    public String getNickname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>auth_java.users.first_name</code>. ???
     */
    public UsersRecord setFirstName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.first_name</code>. ???
     */
    public String getFirstName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>auth_java.users.father_name</code>. ????????
     */
    public UsersRecord setFatherName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.father_name</code>. ????????
     */
    public String getFatherName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>auth_java.users.last_name</code>. ???????
     */
    public UsersRecord setLastName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.last_name</code>. ???????
     */
    public String getLastName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>auth_java.users.birth_date</code>. ???? ????????
     */
    public UsersRecord setBirthDate(Date value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.birth_date</code>. ???? ????????
     */
    public Date getBirthDate() {
        return (Date) get(13);
    }

    /**
     * Setter for <code>auth_java.users.gender</code>. ???
     */
    public UsersRecord setGender(UsersGender value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.gender</code>. ???
     */
    public UsersGender getGender() {
        return (UsersGender) get(14);
    }

    /**
     * Setter for <code>auth_java.users.language</code>.
     */
    public UsersRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>auth_java.users.language</code>.
     */
    public String getLanguage() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UInteger, Timestamp, Timestamp, Timestamp, Timestamp, UInteger, UInteger, UByte, String, String, String, String, String, Date, UsersGender, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UInteger, Timestamp, Timestamp, Timestamp, Timestamp, UInteger, UInteger, UByte, String, String, String, String, String, Date, UsersGender, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Users.USERS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Users.USERS.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Users.USERS.CHANGED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Users.USERS.LAST_VISIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return Users.USERS.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return Users.USERS.EDITOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field8() {
        return Users.USERS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Users.USERS.MERGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Users.USERS.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Users.USERS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Users.USERS.FATHER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Users.USERS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field14() {
        return Users.USERS.BIRTH_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UsersGender> field15() {
        return Users.USERS.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Users.USERS.LANGUAGE;
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
    public Timestamp component2() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getChangedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLastVisit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component6() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component7() {
        return getEditorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMerged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getFatherName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component14() {
        return getBirthDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersGender component15() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getLanguage();
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
    public Timestamp value2() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getChangedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLastVisit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getEditorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMerged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFatherName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value14() {
        return getBirthDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersGender value15() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(Timestamp value) {
        setChangedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(Timestamp value) {
        setLastVisit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(UInteger value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(UInteger value) {
        setEditorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(UByte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value9(String value) {
        setMerged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value10(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value11(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value12(String value) {
        setFatherName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value13(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value14(Date value) {
        setBirthDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value15(UsersGender value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(UInteger value1, Timestamp value2, Timestamp value3, Timestamp value4, Timestamp value5, UInteger value6, UInteger value7, UByte value8, String value9, String value10, String value11, String value12, String value13, Date value14, UsersGender value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(UInteger id, Timestamp createdAt, Timestamp updatedAt, Timestamp changedAt, Timestamp lastVisit, UInteger creatorId, UInteger editorId, UByte status, String merged, String nickname, String firstName, String fatherName, String lastName, Date birthDate, UsersGender gender, String language) {
        super(Users.USERS);

        set(0, id);
        set(1, createdAt);
        set(2, updatedAt);
        set(3, changedAt);
        set(4, lastVisit);
        set(5, creatorId);
        set(6, editorId);
        set(7, status);
        set(8, merged);
        set(9, nickname);
        set(10, firstName);
        set(11, fatherName);
        set(12, lastName);
        set(13, birthDate);
        set(14, gender);
        set(15, language);
    }
}
