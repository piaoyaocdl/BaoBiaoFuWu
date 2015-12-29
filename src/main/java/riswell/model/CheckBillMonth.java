package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CheckBillMonth generated by hbm2java
 */
public class CheckBillMonth implements java.io.Serializable
{

	private int id;
	private CheckBillMonth checkBillMonth;
	private BigDecimal fee;
	private String hospitalName;
	private String invoiceNo;
	private String invoiceType;
	private String name;
	private Date sendDate;
	private Character status;
	private String remark;
	private String billNo;
	private Set<CheckBillFeeMonth> checkBillFeeMonths = new HashSet<CheckBillFeeMonth>(0);
	//private CheckBillMonth checkBillMonth;

	public CheckBillMonth()
	{
	}

	public CheckBillMonth(CheckBillMonth checkBillMonth, String invoiceNo)
	{
		this.checkBillMonth = checkBillMonth;
		this.invoiceNo = invoiceNo;
	}

	public CheckBillMonth(CheckBillMonth checkBillMonth, BigDecimal fee, String hospitalName, String invoiceNo,
			String invoiceType, String name, Date sendDate, Character status, String remark, String billNo,
			Set<CheckBillFeeMonth> checkBillFeeMonths)
	{
		this.checkBillMonth = checkBillMonth;
		this.fee = fee;
		this.hospitalName = hospitalName;
		this.invoiceNo = invoiceNo;
		this.invoiceType = invoiceType;
		this.name = name;
		this.sendDate = sendDate;
		this.status = status;
		this.remark = remark;
		this.billNo = billNo;
		this.checkBillFeeMonths = checkBillFeeMonths;
		this.checkBillMonth = checkBillMonth;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

//	public CheckBillMonth getCheckBillMonth()
//	{
//		return this.checkBillMonth;
//	}

//	public void setCheckBillMonth(CheckBillMonth checkBillMonth)
//	{
//		this.checkBillMonth = checkBillMonth;
//	}

	public BigDecimal getFee()
	{
		return this.fee;
	}

	public void setFee(BigDecimal fee)
	{
		this.fee = fee;
	}

	public String getHospitalName()
	{
		return this.hospitalName;
	}

	public void setHospitalName(String hospitalName)
	{
		this.hospitalName = hospitalName;
	}

	public String getInvoiceNo()
	{
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo)
	{
		this.invoiceNo = invoiceNo;
	}

	public String getInvoiceType()
	{
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType)
	{
		this.invoiceType = invoiceType;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getSendDate()
	{
		return this.sendDate;
	}

	public void setSendDate(Date sendDate)
	{
		this.sendDate = sendDate;
	}

	public Character getStatus()
	{
		return this.status;
	}

	public void setStatus(Character status)
	{
		this.status = status;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getBillNo()
	{
		return this.billNo;
	}

	public void setBillNo(String billNo)
	{
		this.billNo = billNo;
	}

	public Set<CheckBillFeeMonth> getCheckBillFeeMonths()
	{
		return this.checkBillFeeMonths;
	}

	public void setCheckBillFeeMonths(Set<CheckBillFeeMonth> checkBillFeeMonths)
	{
		this.checkBillFeeMonths = checkBillFeeMonths;
	}

	public CheckBillMonth getCheckBillMonth()
	{
		return this.checkBillMonth;
	}

	public void setCheckBillMonth(CheckBillMonth checkBillMonth)
	{
		this.checkBillMonth = checkBillMonth;
	}

}
