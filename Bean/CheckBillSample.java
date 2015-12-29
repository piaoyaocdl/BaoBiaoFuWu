package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * CheckBillSample generated by hbm2java
 */
public class CheckBillSample implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String bloodNo;
	private String bloodName;
	private String bloodKind;
	private String prodNo;
	private String bloodNum;
	private String bloodType;
	private String abD;
	private String rh;
	private Integer nums;
	private String abA;
	private String nabA;
	private String nabB;
	private String nabAo;
	private String nabAom;
	private String abB;
	private String rsAbo;
	private String rsBy;
	private String rsYs;
	private String rsAc1;
	private String rsAc2;
	private String rsAe1;
	private String rsAe2;
	private String rsRh;
	private String rsAd;
	private String remark;
	private Date recordTime;
	private String recordName;
	private Character status;
	private Date reqDate;
	private Character rhId;
	private Character aboId;
	private Character daId;
	private Character reasonRed;
	private Character reasonAb;
	private Character reasonOther;
	private String reasonOtherTxt;
	private Character redId;
	private Character otherId;
	private String otherTxt;
	private String backUnit;
	private String reqName;
	private String billKind;
	private String batchNo;
	private String bloodPici;
	private String rhPici;

	public CheckBillSample()
	{
	}

	public CheckBillSample(int id)
	{
		this.id = id;
	}

	public CheckBillSample(int id, CheckBill checkBill, String bloodNo, String bloodName, String bloodKind,
			String prodNo, String bloodNum, String bloodType, String abD, String rh, Integer nums, String abA,
			String nabA, String nabB, String nabAo, String nabAom, String abB, String rsAbo, String rsBy, String rsYs,
			String rsAc1, String rsAc2, String rsAe1, String rsAe2, String rsRh, String rsAd, String remark,
			Date recordTime, String recordName, Character status, Date reqDate, Character rhId, Character aboId,
			Character daId, Character reasonRed, Character reasonAb, Character reasonOther, String reasonOtherTxt,
			Character redId, Character otherId, String otherTxt, String backUnit, String reqName, String billKind,
			String batchNo, String bloodPici, String rhPici)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.bloodNo = bloodNo;
		this.bloodName = bloodName;
		this.bloodKind = bloodKind;
		this.prodNo = prodNo;
		this.bloodNum = bloodNum;
		this.bloodType = bloodType;
		this.abD = abD;
		this.rh = rh;
		this.nums = nums;
		this.abA = abA;
		this.nabA = nabA;
		this.nabB = nabB;
		this.nabAo = nabAo;
		this.nabAom = nabAom;
		this.abB = abB;
		this.rsAbo = rsAbo;
		this.rsBy = rsBy;
		this.rsYs = rsYs;
		this.rsAc1 = rsAc1;
		this.rsAc2 = rsAc2;
		this.rsAe1 = rsAe1;
		this.rsAe2 = rsAe2;
		this.rsRh = rsRh;
		this.rsAd = rsAd;
		this.remark = remark;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.status = status;
		this.reqDate = reqDate;
		this.rhId = rhId;
		this.aboId = aboId;
		this.daId = daId;
		this.reasonRed = reasonRed;
		this.reasonAb = reasonAb;
		this.reasonOther = reasonOther;
		this.reasonOtherTxt = reasonOtherTxt;
		this.redId = redId;
		this.otherId = otherId;
		this.otherTxt = otherTxt;
		this.backUnit = backUnit;
		this.reqName = reqName;
		this.billKind = billKind;
		this.batchNo = batchNo;
		this.bloodPici = bloodPici;
		this.rhPici = rhPici;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public CheckBill getCheckBill()
	{
		return this.checkBill;
	}

	public void setCheckBill(CheckBill checkBill)
	{
		this.checkBill = checkBill;
	}

	public String getBloodNo()
	{
		return this.bloodNo;
	}

	public void setBloodNo(String bloodNo)
	{
		this.bloodNo = bloodNo;
	}

	public String getBloodName()
	{
		return this.bloodName;
	}

	public void setBloodName(String bloodName)
	{
		this.bloodName = bloodName;
	}

	public String getBloodKind()
	{
		return this.bloodKind;
	}

	public void setBloodKind(String bloodKind)
	{
		this.bloodKind = bloodKind;
	}

	public String getProdNo()
	{
		return this.prodNo;
	}

	public void setProdNo(String prodNo)
	{
		this.prodNo = prodNo;
	}

	public String getBloodNum()
	{
		return this.bloodNum;
	}

	public void setBloodNum(String bloodNum)
	{
		this.bloodNum = bloodNum;
	}

	public String getBloodType()
	{
		return this.bloodType;
	}

	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}

	public String getAbD()
	{
		return this.abD;
	}

	public void setAbD(String abD)
	{
		this.abD = abD;
	}

	public String getRh()
	{
		return this.rh;
	}

	public void setRh(String rh)
	{
		this.rh = rh;
	}

	public Integer getNums()
	{
		return this.nums;
	}

	public void setNums(Integer nums)
	{
		this.nums = nums;
	}

	public String getAbA()
	{
		return this.abA;
	}

	public void setAbA(String abA)
	{
		this.abA = abA;
	}

	public String getNabA()
	{
		return this.nabA;
	}

	public void setNabA(String nabA)
	{
		this.nabA = nabA;
	}

	public String getNabB()
	{
		return this.nabB;
	}

	public void setNabB(String nabB)
	{
		this.nabB = nabB;
	}

	public String getNabAo()
	{
		return this.nabAo;
	}

	public void setNabAo(String nabAo)
	{
		this.nabAo = nabAo;
	}

	public String getNabAom()
	{
		return this.nabAom;
	}

	public void setNabAom(String nabAom)
	{
		this.nabAom = nabAom;
	}

	public String getAbB()
	{
		return this.abB;
	}

	public void setAbB(String abB)
	{
		this.abB = abB;
	}

	public String getRsAbo()
	{
		return this.rsAbo;
	}

	public void setRsAbo(String rsAbo)
	{
		this.rsAbo = rsAbo;
	}

	public String getRsBy()
	{
		return this.rsBy;
	}

	public void setRsBy(String rsBy)
	{
		this.rsBy = rsBy;
	}

	public String getRsYs()
	{
		return this.rsYs;
	}

	public void setRsYs(String rsYs)
	{
		this.rsYs = rsYs;
	}

	public String getRsAc1()
	{
		return this.rsAc1;
	}

	public void setRsAc1(String rsAc1)
	{
		this.rsAc1 = rsAc1;
	}

	public String getRsAc2()
	{
		return this.rsAc2;
	}

	public void setRsAc2(String rsAc2)
	{
		this.rsAc2 = rsAc2;
	}

	public String getRsAe1()
	{
		return this.rsAe1;
	}

	public void setRsAe1(String rsAe1)
	{
		this.rsAe1 = rsAe1;
	}

	public String getRsAe2()
	{
		return this.rsAe2;
	}

	public void setRsAe2(String rsAe2)
	{
		this.rsAe2 = rsAe2;
	}

	public String getRsRh()
	{
		return this.rsRh;
	}

	public void setRsRh(String rsRh)
	{
		this.rsRh = rsRh;
	}

	public String getRsAd()
	{
		return this.rsAd;
	}

	public void setRsAd(String rsAd)
	{
		this.rsAd = rsAd;
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

	public Character getStatus()
	{
		return this.status;
	}

	public void setStatus(Character status)
	{
		this.status = status;
	}

	public Date getReqDate()
	{
		return this.reqDate;
	}

	public void setReqDate(Date reqDate)
	{
		this.reqDate = reqDate;
	}

	public Character getRhId()
	{
		return this.rhId;
	}

	public void setRhId(Character rhId)
	{
		this.rhId = rhId;
	}

	public Character getAboId()
	{
		return this.aboId;
	}

	public void setAboId(Character aboId)
	{
		this.aboId = aboId;
	}

	public Character getDaId()
	{
		return this.daId;
	}

	public void setDaId(Character daId)
	{
		this.daId = daId;
	}

	public Character getReasonRed()
	{
		return this.reasonRed;
	}

	public void setReasonRed(Character reasonRed)
	{
		this.reasonRed = reasonRed;
	}

	public Character getReasonAb()
	{
		return this.reasonAb;
	}

	public void setReasonAb(Character reasonAb)
	{
		this.reasonAb = reasonAb;
	}

	public Character getReasonOther()
	{
		return this.reasonOther;
	}

	public void setReasonOther(Character reasonOther)
	{
		this.reasonOther = reasonOther;
	}

	public String getReasonOtherTxt()
	{
		return this.reasonOtherTxt;
	}

	public void setReasonOtherTxt(String reasonOtherTxt)
	{
		this.reasonOtherTxt = reasonOtherTxt;
	}

	public Character getRedId()
	{
		return this.redId;
	}

	public void setRedId(Character redId)
	{
		this.redId = redId;
	}

	public Character getOtherId()
	{
		return this.otherId;
	}

	public void setOtherId(Character otherId)
	{
		this.otherId = otherId;
	}

	public String getOtherTxt()
	{
		return this.otherTxt;
	}

	public void setOtherTxt(String otherTxt)
	{
		this.otherTxt = otherTxt;
	}

	public String getBackUnit()
	{
		return this.backUnit;
	}

	public void setBackUnit(String backUnit)
	{
		this.backUnit = backUnit;
	}

	public String getReqName()
	{
		return this.reqName;
	}

	public void setReqName(String reqName)
	{
		this.reqName = reqName;
	}

	public String getBillKind()
	{
		return this.billKind;
	}

	public void setBillKind(String billKind)
	{
		this.billKind = billKind;
	}

	public String getBatchNo()
	{
		return this.batchNo;
	}

	public void setBatchNo(String batchNo)
	{
		this.batchNo = batchNo;
	}

	public String getBloodPici()
	{
		return this.bloodPici;
	}

	public void setBloodPici(String bloodPici)
	{
		this.bloodPici = bloodPici;
	}

	public String getRhPici()
	{
		return this.rhPici;
	}

	public void setRhPici(String rhPici)
	{
		this.rhPici = rhPici;
	}

}
