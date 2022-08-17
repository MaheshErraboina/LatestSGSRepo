package com.sgs.model.entity;

import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 21 10:51:21 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsStatisticalDataImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        SgsStatId,
        LineId,
        Month,
        StatisticalDataCategory,
        BusinessUnit,
        JobCode,
        OperationalUnit,
        DepartmentId,
        UnitOfMeasure,
        DataStatus,
        Status,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        StatisticalData,
        CURRENCY,
        DEPARTMENT,
        EMPLOYEEID;
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

    public static final int SGSSTATID = AttributesEnum.SgsStatId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int MONTH = AttributesEnum.Month.index();
    public static final int STATISTICALDATACATEGORY = AttributesEnum.StatisticalDataCategory.index();
    public static final int BUSINESSUNIT = AttributesEnum.BusinessUnit.index();
    public static final int JOBCODE = AttributesEnum.JobCode.index();
    public static final int OPERATIONALUNIT = AttributesEnum.OperationalUnit.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int UNITOFMEASURE = AttributesEnum.UnitOfMeasure.index();
    public static final int DATASTATUS = AttributesEnum.DataStatus.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int STATISTICALDATA = AttributesEnum.StatisticalData.index();
    public static final int CURRENCY = AttributesEnum.CURRENCY.index();
    public static final int DEPARTMENT = AttributesEnum.DEPARTMENT.index();
    public static final int EMPLOYEEID = AttributesEnum.EMPLOYEEID.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsStatisticalDataImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsStatisticalData");
    }

    /**
     * Gets the attribute value for SgsStatId, using the alias name SgsStatId.
     * @return the value of SgsStatId
     */
    public Integer getSgsStatId() {
        return (Integer) getAttributeInternal(SGSSTATID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SgsStatId.
     * @param value value to set the SgsStatId
     */
    public void setSgsStatId(Integer value) {
        setAttributeInternal(SGSSTATID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the value of LineId
     */
    public String getLineId() {
        return (String) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(String value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for Month, using the alias name Month.
     * @return the value of Month
     */
    public Date getMonth() {
        return (Date) getAttributeInternal(MONTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for Month.
     * @param value value to set the Month
     */
    public void setMonth(Date value) {
        setAttributeInternal(MONTH, value);
    }

    /**
     * Gets the attribute value for StatisticalDataCategory, using the alias name StatisticalDataCategory.
     * @return the value of StatisticalDataCategory
     */
    public String getStatisticalDataCategory() {
        return (String) getAttributeInternal(STATISTICALDATACATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for StatisticalDataCategory.
     * @param value value to set the StatisticalDataCategory
     */
    public void setStatisticalDataCategory(String value) {
        setAttributeInternal(STATISTICALDATACATEGORY, value);
    }

    /**
     * Gets the attribute value for BusinessUnit, using the alias name BusinessUnit.
     * @return the value of BusinessUnit
     */
    public String getBusinessUnit() {
        return (String) getAttributeInternal(BUSINESSUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for BusinessUnit.
     * @param value value to set the BusinessUnit
     */
    public void setBusinessUnit(String value) {
        setAttributeInternal(BUSINESSUNIT, value);
    }

    /**
     * Gets the attribute value for JobCode, using the alias name JobCode.
     * @return the value of JobCode
     */
    public String getJobCode() {
        return (String) getAttributeInternal(JOBCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobCode.
     * @param value value to set the JobCode
     */
    public void setJobCode(String value) {
        setAttributeInternal(JOBCODE, value);
    }

    /**
     * Gets the attribute value for OperationalUnit, using the alias name OperationalUnit.
     * @return the value of OperationalUnit
     */
    public String getOperationalUnit() {
        return (String) getAttributeInternal(OPERATIONALUNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OperationalUnit.
     * @param value value to set the OperationalUnit
     */
    public void setOperationalUnit(String value) {
        setAttributeInternal(OPERATIONALUNIT, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public String getDepartmentId() {
        return (String) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(String value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for UnitOfMeasure, using the alias name UnitOfMeasure.
     * @return the value of UnitOfMeasure
     */
    public String getUnitOfMeasure() {
        return (String) getAttributeInternal(UNITOFMEASURE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitOfMeasure.
     * @param value value to set the UnitOfMeasure
     */
    public void setUnitOfMeasure(String value) {
        setAttributeInternal(UNITOFMEASURE, value);
    }

    /**
     * Gets the attribute value for DataStatus, using the alias name DataStatus.
     * @return the value of DataStatus
     */
    public String getDataStatus() {
        return (String) getAttributeInternal(DATASTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DataStatus.
     * @param value value to set the DataStatus
     */
    public void setDataStatus(String value) {
        setAttributeInternal(DATASTATUS, value);
    }

    /**
     * Gets the attribute value for Status, using the alias name Status.
     * @return the value of Status
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Status.
     * @param value value to set the Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Date value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(String value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for StatisticalData, using the alias name StatisticalData.
     * @return the value of StatisticalData
     */
    public String getStatisticalData() {
        return (String) getAttributeInternal(STATISTICALDATA);
    }

    /**
     * Sets <code>value</code> as the attribute value for StatisticalData.
     * @param value value to set the StatisticalData
     */
    public void setStatisticalData(String value) {
        setAttributeInternal(STATISTICALDATA, value);
    }

    /**
     * Gets the attribute value for CURRENCY, using the alias name CURRENCY.
     * @return the value of CURRENCY
     */
    public String getCURRENCY() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CURRENCY.
     * @param value value to set the CURRENCY
     */
    public void setCURRENCY(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT, using the alias name DEPARTMENT.
     * @return the value of DEPARTMENT
     */
    public String getDEPARTMENT() {
        return (String) getAttributeInternal(DEPARTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for DEPARTMENT.
     * @param value value to set the DEPARTMENT
     */
    public void setDEPARTMENT(String value) {
        setAttributeInternal(DEPARTMENT, value);
    }

    /**
     * Gets the attribute value for EMPLOYEEID, using the alias name EMPLOYEEID.
     * @return the value of EMPLOYEEID
     */
    public String getEMPLOYEEID() {
        return (String) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EMPLOYEEID.
     * @param value value to set the EMPLOYEEID
     */
    public void setEMPLOYEEID(String value) {
        setAttributeInternal(EMPLOYEEID, value);
    }


    /**
     * @param sgsStatId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer sgsStatId) {
        return new Key(new Object[] { sgsStatId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }
}

