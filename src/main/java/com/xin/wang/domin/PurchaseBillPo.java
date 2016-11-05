package com.xin.wang.domin;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xin.wang on 2016/9/22.
 * 采购单、退款单、退货单
 */
public class PurchaseBillPo {

    //主键
    private Long pkId;

    //单据ID
    private Long billId;

    //单据号码
    private String billCode;

    //单据类型
    private Short billType;

    //应付
    private BigDecimal actualPayables;

    //已付
    private BigDecimal actualPayment;

    //补款金额
    private BigDecimal supplementPrice;

    //合同ID
    private Long contractId;

    //合同号码
    private String outContractCode;

    //产品线ID
    private Long productLineId;

    //产品线name
    private String productLineName;

    //供应商ID
    private Long supplierId;

    //供应商名称
    private String supplierName;

    //部门ID
    private Long departmentId;

    //部门名称
    private String departmentName;

    //最后修改时间
    private Date lastModifiedTime;

    //下单时间
    private Date orderTime;

    //交易员ID
    private Long traderId;

    //交易员名称
    private String traderName;


    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Short getBillType() {
        return billType;
    }

    public void setBillType(Short billType) {
        this.billType = billType;
    }

    public BigDecimal getActualPayables() {
        return actualPayables;
    }

    public void setActualPayables(BigDecimal actualPayables) {
        this.actualPayables = actualPayables;
    }

    public BigDecimal getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(BigDecimal actualPayment) {
        this.actualPayment = actualPayment;
    }

    public BigDecimal getSupplementPrice() {
        return supplementPrice;
    }

    public void setSupplementPrice(BigDecimal supplementPrice) {
        this.supplementPrice = supplementPrice;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getOutContractCode() {
        return outContractCode;
    }

    public void setOutContractCode(String outContractCode) {
        this.outContractCode = outContractCode;
    }

    public Long getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(Long productLineId) {
        this.productLineId = productLineId;
    }

    public String getProductLineName() {
        return productLineName;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Long getTraderId() {
        return traderId;
    }

    public void setTraderId(Long traderId) {
        this.traderId = traderId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }
}
