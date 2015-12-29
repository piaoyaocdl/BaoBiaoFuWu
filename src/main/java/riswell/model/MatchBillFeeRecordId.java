package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * MatchBillFeeRecordId generated by hbm2java
 */
public class MatchBillFeeRecordId implements java.io.Serializable
{

	private int id;
	private Date recDate;
	private int feeId;
	private int billId;
	private BigDecimal recFee;
	private String remark;
	private Date recordTime;
	private String recordName;

	public MatchBillFeeRecordId()
	{
	}

	public MatchBillFeeRecordId(int id, Date recDate, int feeId, int billId)
	{
		this.id = id;
		this.recDate = recDate;
		this.feeId = feeId;
		this.billId = billId;
	}

	public MatchBillFeeRecordId(int id, Date recDate, int feeId, int billId, BigDecimal recFee, String remark,
			Date recordTime, String recordName)
	{
		this.id = id;
		this.recDate = recDate;
		this.feeId = feeId;
		this.billId = billId;
		this.recFee = recFee;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getRecDate()
	{
		return this.recDate;
	}

	public void setRecDate(Date recDate)
	{
		this.recDate = recDate;
	}

	public int getFeeId()
	{
		return this.feeId;
	}

	public void setFeeId(int feeId)
	{
		this.feeId = feeId;
	}

	public int getBillId()
	{
		return this.billId;
	}

	public void setBillId(int billId)
	{
		this.billId = billId;
	}

	public BigDecimal getRecFee()
	{
		return this.recFee;
	}

	public void setRecFee(BigDecimal recFee)
	{
		this.recFee = recFee;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MatchBillFeeRecordId))
			return false;
		MatchBillFeeRecordId castOther = (MatchBillFeeRecordId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getRecDate() == castOther.getRecDate()) || (this.getRecDate() != null
						&& castOther.getRecDate() != null && this.getRecDate().equals(castOther.getRecDate())))
				&& (this.getFeeId() == castOther.getFeeId()) && (this.getBillId() == castOther.getBillId())
				&& ((this.getRecFee() == castOther.getRecFee()) || (this.getRecFee() != null
						&& castOther.getRecFee() != null && this.getRecFee().equals(castOther.getRecFee())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this.getRecordTime() != null
						&& castOther.getRecordTime() != null && this.getRecordTime().equals(castOther.getRecordTime())))
				&& ((this.getRecordName() == castOther.getRecordName())
						|| (this.getRecordName() != null && castOther.getRecordName() != null
								&& this.getRecordName().equals(castOther.getRecordName())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getRecDate() == null ? 0 : this.getRecDate().hashCode());
		result = 37 * result + this.getFeeId();
		result = 37 * result + this.getBillId();
		result = 37 * result + (getRecFee() == null ? 0 : this.getRecFee().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		return result;
	}

}
