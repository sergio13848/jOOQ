/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> {

	private static final long serialVersionUID = 47024108;

	/**
	 * Setter for <code>t_book.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_book.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>t_book.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>t_book.AUTHOR_ID</code>. 
	 */
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>t_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>t_book.co_author_id</code>. 
	 */
	public java.lang.Integer getCoAuthorId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>t_book.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>t_book.DETAILS_ID</code>. 
	 */
	public java.lang.Integer getDetailsId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>t_book.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>t_book.TITLE</code>. 
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>t_book.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>t_book.PUBLISHED_IN</code>. 
	 */
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>t_book.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>t_book.LANGUAGE_ID</code>. 
	 */
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>t_book.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>t_book.CONTENT_TEXT</code>. 
	 */
	public java.lang.String getContentText() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>t_book.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>t_book.CONTENT_PDF</code>. 
	 */
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(java.lang.Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(java.lang.Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(java.lang.Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(java.lang.Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(java.lang.Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(java.lang.String value) {
		setContentText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value9(byte[] value) {
		setContentPdf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.String value5, java.lang.Integer value6, java.lang.Integer value7, java.lang.String value8, byte[] value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(java.lang.Integer id, java.lang.Integer authorId, java.lang.Integer coAuthorId, java.lang.Integer detailsId, java.lang.String title, java.lang.Integer publishedIn, java.lang.Integer languageId, java.lang.String contentText, byte[] contentPdf) {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, coAuthorId);
		setValue(3, detailsId);
		setValue(4, title);
		setValue(5, publishedIn);
		setValue(6, languageId);
		setValue(7, contentText);
		setValue(8, contentPdf);
	}
}
