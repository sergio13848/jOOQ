/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq;

/**
 * A listing of clauses that emit events {@link VisitListener}.
 * <p>
 * <h3>Disclaimer</h3> This SPI is still <strong>experimental</strong>! Some SPI
 * elements and/or behavioural elements may change in future minor releases.
 */
public enum Clause {

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model catalog references
    // -------------------------------------------------------------------------

    CATALOG,
    CATALOG_REFERENCE,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model schema references
    // -------------------------------------------------------------------------

    SCHEMA,
    SCHEMA_REFERENCE,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model table references
    // -------------------------------------------------------------------------

    /**
     * A table expression.
     * <p>
     * This clause surrounds an actual table expression as it can be encountered
     * in
     * <ul>
     * <li> {@link #SELECT_FROM}</li>
     * <li> {@link #INSERT_INSERT_INTO}</li>
     * <li> {@link #UPDATE_UPDATE}</li>
     * <li> {@link #DELETE_DELETE}</li>
     * <li> {@link #MERGE_MERGE_INTO}</li>
     * <li> {@link #TRUNCATE_TRUNCATE}</li>
     * </ul>
     */
    TABLE,

    /**
     * A table alias declaration.
     * <p>
     * This clause surrounds a table alias declaration, for instance within the
     * {@link #SELECT_FROM} clause, or within a {@link #TABLE_JOIN} clause,
     * wrapping another {@link #TABLE}.
     * <p>
     * Referenced table aliases emit {@link #TABLE_REFERENCE} clauses.
     */
    TABLE_ALIAS,

    /**
     * A physical or aliased table reference.
     * <p>
     * This is a terminal clause used to reference physical or aliased tables.
     */
    TABLE_REFERENCE,
    TABLE_JOIN,
    TABLE_JOIN_INNER,
    TABLE_JOIN_CROSS,
    TABLE_JOIN_NATURAL,
    TABLE_JOIN_OUTER_LEFT,
    TABLE_JOIN_OUTER_RIGHT,
    TABLE_JOIN_OUTER_FULL,
    TABLE_JOIN_NATURAL_OUTER_LEFT,
    TABLE_JOIN_NATURAL_OUTER_RIGHT,
    TABLE_JOIN_CROSS_APPLY,
    TABLE_JOIN_OUTER_APPLY,
    TABLE_JOIN_ON,
    TABLE_JOIN_USING,
    TABLE_JOIN_PARTITION_BY,

    /**
     * A <code>VALUES</code> table constructor
     * <p>
     * This clause surrounds a
     * <ul>
     * <li>a <code>VALUES</code> keyword</li>
     * <li>a table constructor with several {@link #FIELD_ROW} value expressions
     * </li>
     * </ul>
     */
    TABLE_VALUES,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model column references
    // -------------------------------------------------------------------------

    /**
     * A field expression.
     * <p>
     * This clause surrounds an actual field expression as it can be encountered
     * in various other clauses, such as for instance {@link #SELECT_SELECT}.
     */
    FIELD,

    /**
     * A field alias declaration.
     * <p>
     * This clause surrounds a field alias declaration, for instance within the
     * {@link #SELECT_SELECT} clause, wrapping another {@link #FIELD}.
     * <p>
     * Referenced field aliases emit {@link #FIELD_REFERENCE} clauses.
     */
    FIELD_ALIAS,

    /**
     * A physical or aliased field reference.
     * <p>
     * This is a terminal clause used to reference physical or aliased fields.
     */
    FIELD_REFERENCE,

    FIELD_VALUE,
    FIELD_CASE,
    FIELD_ROW,
    FIELD_FUNCTION,

    // -------------------------------------------------------------------------
    // Clauses used in a any type of statement to model condition references
    // -------------------------------------------------------------------------

    /**
     * A condition expression.
     */
    CONDITION,

    /**
     * A <code>NULL</code> condition.
     * <p>
     * This clause surrounds a {@link #FIELD}.
     */
    CONDITION_IS_NULL,

    /**
     * A <code>NOT NULL</code> condition.
     * <p>
     * This clause surrounds a {@link #FIELD}.
     */
    CONDITION_IS_NOT_NULL,

    // TODO: Should operators be distinguished?
    // - LIKE predicate
    // - Subselect predicates
    // - RVE predicates
    // - Quantified predicates
    CONDITION_COMPARISON,

    /**
     * A <code>BEWEEN</code> condition.
     * <p>
     * This clause surrounds three {@link #FIELD} clauses.
     */
    CONDITION_BETWEEN,

    /**
     * A <code>BEWEEN SYMMETRIC</code> condition.
     * <p>
     * This clause surrounds three {@link #FIELD} clauses.
     */
    CONDITION_BETWEEN_SYMMETRIC,

    /**
     * A <code>NOT BEWEEN</code> condition.
     * <p>
     * This clause surrounds three {@link #FIELD} clauses.
     */
    CONDITION_NOT_BETWEEN,

    /**
     * A <code>NOT BEWEEN SYMMETRIC</code> condition.
     * <p>
     * This clause surrounds three {@link #FIELD} clauses.
     */
    CONDITION_NOT_BETWEEN_SYMMETRIC,

    /**
     * An <code>OVERLAPS</code> condition.
     * <p>
     * This clause surrounds two {@link #FIELD} clauses.
     */
    CONDITION_OVERLAPS,

    /**
     * A combined condition using <code>AND</code>.
     * <p>
     * This clause surrounds several {@link #CONDITION} clauses.
     */
    CONDITION_AND,

    /**
     * A combined condition using <code>OR</code>.
     * <p>
     * This clause surrounds several {@link #CONDITION} clauses.
     */
    CONDITION_OR,

    /**
     * A <code>NOT</code> condition.
     * <p>
     * This clause surrounds a {@link #CONDITION} clause.
     */
    CONDITION_NOT,

    /**
     * An <code>IN</code> condition.
     * <p>
     * This clause surrounds two or more {@link #FIELD} clauses.
     */
    CONDITION_IN,

    /**
     * A <code>NOT IN</code> condition.
     * <p>
     * This clause surrounds two or more {@link #FIELD} clauses.
     */
    CONDITION_NOT_IN,

    /**
     * An <code>EXISTS</code> condition.
     * <p>
     * This clause surrounds a {@link #SELECT} clause.
     */
    CONDITION_EXISTS,

    /**
     * A <code>NOT EXISTS</code> condition.
     * <p>
     * This clause surrounds a {@link #SELECT} clause.
     */
    CONDITION_NOT_EXISTS,

    // -------------------------------------------------------------------------
    // Clauses that are used in a SELECT statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>SELECT</code> statement or a subselect.
     * <p>
     * This clause surrounds a complete <code>SELECT</code> statement, a
     * subselect, or a set operation, such as
     * <ul>
     * <li> {@link #SELECT_UNION}</li>
     * <li> {@link #SELECT_UNION_ALL}</li>
     * <li> {@link #SELECT_INTERSECT}</li>
     * <li> {@link #SELECT_EXCEPT}</li>
     * </ul>
     */
    SELECT,

    /**
     * A <code>UNION</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>UNION</code> set operation.
     */
    SELECT_UNION,

    /**
     * A <code>UNION ALL</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>UNION ALL</code> set operation.
     */
    SELECT_UNION_ALL,

    /**
     * A <code>INTERSECT</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>INTERSECT</code> set operation.
     */
    SELECT_INTERSECT,

    /**
     * A <code>EXCEPT</code> set operation.
     * <p>
     * This clause surrounds two or more subselects (see {@link #SELECT})
     * concatenating them using a <code>EXCEPT</code> set operation.
     */
    SELECT_EXCEPT,

    /**
     * A <code>SELECT</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>SELECT</code> keyword</li>
     * <li>Oracle style hints</li>
     * <li>the T-SQL style <code>TOP .. START AT</code> clause</li>
     * <li>the select field list</li>
     * </ul>
     */
    SELECT_SELECT,

    /**
     * A <code>FROM</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>FROM</code> keyword</li>
     * <li>the table reference list</li>
     * </ul>
     * <p>
     * See {@link #TABLE} and related clauses for possible table references.
     *
     * @see #TABLE
     */
    SELECT_FROM,

    /**
     * A <code>WHERE</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHERE</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     * <p>
     * See {@link #CONDITION} and related clauses for possible conditions
     *
     * @see #CONDITION
     */
    SELECT_WHERE,

    /**
     * A <code>START WITH</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>START WITH</code> keywords</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     * <p>
     * See {@link #CONDITION} and related clauses for possible conditions
     *
     * @see #CONDITION
     */
    SELECT_START_WITH,

    /**
     * A <code>CONNECT BY</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>CONNECT BY</code> keywords</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     * <p>
     * See {@link #CONDITION} and related clauses for possible conditions
     *
     * @see #CONDITION
     */
    SELECT_CONNECT_BY,
    SELECT_GROUP_BY,

    /**
     * A <code>HAVING</code> clause within a {@link #SELECT} statement or
     * subselect.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>HAVING</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     * <p>
     * See {@link #CONDITION} and related clauses for possible conditions
     *
     * @see #CONDITION
     */
    SELECT_HAVING,
    SELECT_WINDOW,
    SELECT_ORDER_BY,

    // -------------------------------------------------------------------------
    // Clauses that are used in an INSERT statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>INSERT</code> statement.
     */
    INSERT,

    /**
     * The <code>INSERT INTO</code> clause within an {@link #INSERT} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>INSERT INTO</code> keywords</li>
     * <li>the table that is being inserted</li>
     * </ul>
     */
    INSERT_INSERT_INTO,

    /**
     * The <code>VALUES</code> clause within an {@link #INSERT} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>VALUES</code> keyword</li>
     * <li>several {@link #FIELD_ROW} clauses</li>
     * </ul>
     */
    INSERT_VALUES,

    /**
     * The <code>SELECT</code> clause within an {@link #INSERT} statement.
     * <p>
     * This clause surrounds a {@link #SELECT} clause.
     */
    INSERT_SELECT,

    /**
     * The <code>ON DUPLICATE KEY UPDATE</code> clause within an {@link #INSERT}
     * statement.
     * <p>
     * This clause surrounds several
     * {@link #INSERT_ON_DUPLICATE_KEY_UPDATE_ASSIGNMENT} clauses.
     * <ul>
     * <li>the <code>ON DUPLICATE KEY UPDATE</code> keywords</li>
     * <li>several {@link #INSERT_ON_DUPLICATE_KEY_UPDATE_ASSIGNMENT} clauses</li>
     * </ul>
     */
    INSERT_ON_DUPLICATE_KEY_UPDATE,

    /**
     * The <code>ON DUPLICATE KEY UPDATE</code> clause within an {@link #INSERT}
     * statement.
     * <p>
     * This clause surrounds two {@link #FIELD} clauses.
     */
    INSERT_ON_DUPLICATE_KEY_UPDATE_ASSIGNMENT,

    /**
     * The <code>RETURNING</code> clause within an {@link #INSERT} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>RETURNING</code> keyword</li>
     * <li>several {@link #FIELD} clauses</li>
     * </ul>
     */
    INSERT_RETURNING,

    // -------------------------------------------------------------------------
    // Clauses that are used in an UPDATE statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>UPDATE</code> statement.
     */
    UPDATE,

    /**
     * An <code>UPDATE</code> clause within an {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>UPDATE</code> keyword</li>
     * <li>the table that is being updated</li>
     * </ul>
     */
    UPDATE_UPDATE,

    /**
     * A <code>SET</code> clause within an {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>SET</code> keyword</li>
     * <li>one or several assignments: {@link #UPDATE_SET_ASSIGNMENT}</li>
     * </ul>
     */
    UPDATE_SET,

    /**
     * An assigment within a {@link #UPDATE_SET} clause within an
     * {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>a {@link #FIELD} receiving the assignment</li>
     * <li>an assigment operator</li>
     * <li>a {@link #FIELD} being assigned</li>
     * </ul>
     */
    UPDATE_SET_ASSIGNMENT,

    /**
     * A vendor-specific <code>FROM</code> clause within an {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>FROM</code> keyword</li>
     * <li>the table reference list</li>
     * </ul>
     * <p>
     * See {@link #TABLE} and related clauses for possible table references.
     */
    UPDATE_FROM,

    /**
     * A <code>WHERE</code> clause within an {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHERE</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     */
    UPDATE_WHERE,

    /**
     * A <code>RETURNING</code> clause within an {@link #UPDATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>RETURNING</code> keyword</li>
     * <li>several {@link #FIELD} clauses</li>
     * </ul>
     */
    UPDATE_RETURNING,

    // -------------------------------------------------------------------------
    // Clauses that are used in an DELETE statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>DELETE</code> statement.
     */
    DELETE,

    /**
     * A <code>DELETE</code> clause within an {@link #DELETE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>DELETE FROM</code> keywords</li>
     * <li>the table that is being deleted</li>
     * </ul>
     */
    DELETE_DELETE,

    /**
     * A <code>WHERE</code> clause within an {@link #DELETE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHERE</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     */
    DELETE_WHERE,

    // -------------------------------------------------------------------------
    // Clauses that are used in an MERGE statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>MERGE</code> statement.
     */
    MERGE,

    /**
     * A <code>MERGE INTO</code> clause within an {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>MERGE INTO</code> keywords</li>
     * <li>the table that is being merged</li>
     * </ul>
     */
    MERGE_MERGE_INTO,

    /**
     * A <code>USING</code> clause within a {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>USING</code> keyword</li>
     * <li>a {@link #TABLE}</li>
     * </ul>
     */
    MERGE_USING,

    /**
     * An <code>ON</code> clause within a {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>ON</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     */
    MERGE_ON,

    /**
     * A <code>WHEN MATCHED THEN UPDATE</code> clause within a {@link #MERGE}
     * statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHEN MATCHED THEN UPDATE</code> keywords</li>
     * <li>a {@link #MERGE_SET} clause</li>
     * <li>a {@link #MERGE_WHERE} clause</li>
     * <li>a {@link #MERGE_DELETE_WHERE} clause</li>
     * </ul>
     */
    MERGE_WHEN_MATCHED_THEN_UPDATE,

    /**
     * A <code>SET</code> clause within a
     * {@link #MERGE_WHEN_MATCHED_THEN_UPDATE} clause within an {@link #MERGE}
     * statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>SET</code> keyword</li>
     * <li>several {@link #MERGE_SET_ASSIGNMENT} clauses</li>
     * </ul>
     */
    MERGE_SET,

    /**
     * An assigment within a {@link #MERGE_SET} clause within an {@link #MERGE}
     * statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>a {@link #FIELD} receiving the assignment</li>
     * <li>an assigment operator</li>
     * <li>a {@link #FIELD} being assigned</li>
     * </ul>
     */
    MERGE_SET_ASSIGNMENT,

    /**
     * A <code>WHERE</code> clause within a
     * {@link #MERGE_WHEN_MATCHED_THEN_UPDATE} clause within a
     * {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHERE</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     */
    MERGE_WHERE,

    /**
     * A <code>DELETE_WHERE</code> clause within a
     * {@link #MERGE_WHEN_MATCHED_THEN_UPDATE} clause within a {@link #MERGE}
     * statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>DELETE WHERE</code> keyword</li>
     * <li>a {@link #CONDITION}</li>
     * </ul>
     */
    MERGE_DELETE_WHERE,

    /**
     * A <code>WHEN NOT MATCHED THEN INSERT</code> clause within a
     * {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>WHEN NOT MATCHED THEN INSERT</code> keywords</li>
     * <li>several {@link #FIELD} clauses</li>
     * </ul>
     */
    MERGE_WHEN_NOT_MATCHED_THEN_INSERT,

    /**
     * A <code>VALUES</code> clause within a {@link #MERGE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>VALUES</code> keyword</li>
     * <li>several {@link #FIELD_ROW} clauses</li>
     * </ul>
     */
    MERGE_VALUES,

    // -------------------------------------------------------------------------
    // Clauses that are used in an TRUNCATE statement
    // -------------------------------------------------------------------------

    /**
     * A complete <code>TRUNCATE</code> statement.
     */
    TRUNCATE,

    /**
     * A <code>TRUNCATE</code> clause within an {@link #TRUNCATE} statement.
     * <p>
     * This clause surrounds
     * <ul>
     * <li>the <code>TRUNCATE TABLE</code> keywords</li>
     * <li>the table that is being truncated</li>
     * </ul>
     */
    TRUNCATE_TRUNCATE,

    // -------------------------------------------------------------------------
    // Other clauses
    // -------------------------------------------------------------------------

    /**
     * A plain SQL template clause.
     */
    TEMPLATE,

    /**
     * A custom {@link QueryPart} clause.
     */
    CUSTOM
}
