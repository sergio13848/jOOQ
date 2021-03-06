/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = 597723096;

	/**
	 * The singleton instance of <code>PUBLIC.T_IDENTITY</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.h2.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY.ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), T_IDENTITY, "");

	/**
	 * The column <code>PUBLIC.T_IDENTITY.VAL</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY, "");

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		this("T_IDENTITY", null);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.h2.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.h2.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
