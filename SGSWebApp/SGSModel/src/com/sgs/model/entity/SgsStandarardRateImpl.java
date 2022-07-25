package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 07 09:45:50 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsStandarardRateImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        StandardRateId,
        ExpenseType,
        SubExpenseType,
        GlAccount,
        SrGeography,
        EmployeeGradeLevel,
        StandardCost,
        EffectiveStartDate,
        EffectiveEndDate,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        Currency,
        DepartmentCostCenter;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsStandarardRateImpl.class);

    public static final int STANDARDRATEID = AttributesEnum.StandardRateId.index();
    public static final int EXPENSETYPE = AttributesEnum.ExpenseType.index();
    public static final int SUBEXPENSETYPE = AttributesEnum.SubExpenseType.index();
    public static final int GLACCOUNT = AttributesEnum.GlAccount.index();
    public static final int SRGEOGRAPHY = AttributesEnum.SrGeography.index();
    public static final int EMPLOYEEGRADELEVEL = AttributesEnum.EmployeeGradeLevel.index();
    public static final int STANDARDCOST = AttributesEnum.StandardCost.index();
    public static final int EFFECTIVESTARTDATE = AttributesEnum.EffectiveStartDate.index();
    public static final int EFFECTIVEENDDATE = AttributesEnum.EffectiveEndDate.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int CURRENCY = AttributesEnum.Currency.index();
    public static final int DEPARTMENTCOSTCENTER = AttributesEnum.DepartmentCostCenter.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsStandarardRateImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsStandarardRate");
    }

    /**
     * Gets the attribute value for StandardRateId, using the alias name StandardRateId.
     * @return the value of StandardRateId
     */
    public Integer getStandardRateId() {
        return (Integer) getAttributeInternal(STANDARDRATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StandardRateId.
     * @param value value to set the StandardRateId
     */
    public void setStandardRateId(Integer value) {
        setAttributeInternal(STANDARDRATEID, value);
    }

    /**
     * Gets the attribute value for ExpenseType, using the alias name ExpenseType.
     * @return the value of ExpenseType
     */
    public String getExpenseType() {
        return (String) getAttributeInternal(EXPENSETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExpenseType.
     * @param value value to set the ExpenseType
     */
    public void setExpenseType(String value) {
        setAttributeInternal(EXPENSETYPE, value);
    }

    /**
     * Gets the attribute value for SubExpenseType, using the alias name SubExpenseType.
     * @return the value of SubExpenseType
     */
    public String getSubExpenseType() {
        return (String) getAttributeInternal(SUBEXPENSETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubExpenseType.
     * @param value value to set the SubExpenseType
     */
    public void setSubExpenseType(String value) {
        setAttributeInternal(SUBEXPENSETYPE, value);
    }

    /**
     * Gets the attribute value for GlAccount, using the alias name GlAccount.
     * @return the value of GlAccount
     */
    public String getGlAccount() {
        return (String) getAttributeInternal(GLACCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlAccount.
     * @param value value to set the GlAccount
     */
    public void setGlAccount(String value) {
        setAttributeInternal(GLACCOUNT, value);
    }

    /**
     * Gets the attribute value for SrGeography, using the alias name SrGeography.
     * @return the value of SrGeography
     */
    public String getSrGeography() {
        return (String) getAttributeInternal(SRGEOGRAPHY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrGeography.
     * @param value value to set the SrGeography
     */
    public void setSrGeography(String value) {
        setAttributeInternal(SRGEOGRAPHY, value);
    }

    /**
     * Gets the attribute value for EmployeeGradeLevel, using the alias name EmployeeGradeLevel.
     * @return the value of EmployeeGradeLevel
     */
    public String getEmployeeGradeLevel() {
        return (String) getAttributeInternal(EMPLOYEEGRADELEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeGradeLevel.
     * @param value value to set the EmployeeGradeLevel
     */
    public void setEmployeeGradeLevel(String value) {
        setAttributeInternal(EMPLOYEEGRADELEVEL, value);
    }

    /**
     * Gets the attribute value for StandardCost, using the alias name StandardCost.
     * @return the value of StandardCost
     */
    public BigDecimal getStandardCost() {
        return (BigDecimal) getAttributeInternal(STANDARDCOST);
    }

    /**
     * Sets <code>value</code> as the attribute value for StandardCost.
     * @param value value to set the StandardCost
     */
    public void setStandardCost(BigDecimal value) {
        setAttributeInternal(STANDARDCOST, value);
    }

    /**
     * Gets the attribute value for EffectiveStartDate, using the alias name EffectiveStartDate.
     * @return the value of EffectiveStartDate
     */
    public Date getEffectiveStartDate() {
        return (Date) getAttributeInternal(EFFECTIVESTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveStartDate.
     * @param value value to set the EffectiveStartDate
     */
    public void setEffectiveStartDate(Date value) {
        setAttributeInternal(EFFECTIVESTARTDATE, value);
    }

    /**
     * Gets the attribute value for EffectiveEndDate, using the alias name EffectiveEndDate.
     * @return the value of EffectiveEndDate
     */
    public Date getEffectiveEndDate() {
        return (Date) getAttributeInternal(EFFECTIVEENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveEndDate.
     * @param value value to set the EffectiveEndDate
     */
    public void setEffectiveEndDate(Date value) {
        setAttributeInternal(EFFECTIVEENDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }


    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }


    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }


    /**
     * Gets the attribute value for Currency, using the alias name Currency.
     * @return the value of Currency
     */
    public BigDecimal getCurrency() {
        return (BigDecimal) getAttributeInternal(CURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Currency.
     * @param value value to set the Currency
     */
    public void setCurrency(BigDecimal value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**
     * Gets the attribute value for DepartmentCostCenter, using the alias name DepartmentCostCenter.
     * @return the value of DepartmentCostCenter
     */
    public String getDepartmentCostCenter() {
        return (String) getAttributeInternal(DEPARTMENTCOSTCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentCostCenter.
     * @param value value to set the DepartmentCostCenter
     */
    public void setDepartmentCostCenter(String value) {
        setAttributeInternal(DEPARTMENTCOSTCENTER, value);
    }


    /**
     * @param standardRateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer standardRateId) {
        return new Key(new Object[] { standardRateId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setStandardRateId(am.getDBSequence("SGS_STANDARARD_RATE_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

