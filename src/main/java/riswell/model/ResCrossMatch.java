package riswell.model;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * ResCrossMatch generated by hbm2java
 */
public class ResCrossMatch implements java.io.Serializable
{

	private int id;
	private CheckBill checkBill;
	private String bloodNo;
	private String bloodType;
	private String bloodRh;
	private String result1;
	private String result2;
	private String result3;
	private String result4;
	private String result5;
	private String result6;
	private String result7;
	private String remark;
	private String recordName;
	private Date recordTime;
	private String phenotype;
	private Integer seqNo;
	private Character crossItem;

	public ResCrossMatch()
	{
	}

	public ResCrossMatch(int id, CheckBill checkBill)
	{
		this.id = id;
		this.checkBill = checkBill;
	}

	public ResCrossMatch(int id, CheckBill checkBill, String bloodNo, String bloodType, String bloodRh, String result1,
			String result2, String result3, String result4, String result5, String result6, String result7,
			String remark, String recordName, Date recordTime, String phenotype, Integer seqNo, Character crossItem)
	{
		this.id = id;
		this.checkBill = checkBill;
		this.bloodNo = bloodNo;
		this.bloodType = bloodType;
		this.bloodRh = bloodRh;
		this.result1 = result1;
		this.result2 = result2;
		this.result3 = result3;
		this.result4 = result4;
		this.result5 = result5;
		this.result6 = result6;
		this.result7 = result7;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.phenotype = phenotype;
		this.seqNo = seqNo;
		this.crossItem = crossItem;
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

	public String getBloodType()
	{
		return this.bloodType;
	}

	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}

	public String getBloodRh()
	{
		return this.bloodRh;
	}

	public void setBloodRh(String bloodRh)
	{
		this.bloodRh = bloodRh;
	}

	public String getResult1()
	{
		return this.result1;
	}

	public void setResult1(String result1)
	{
		this.result1 = result1;
	}

	public String getResult2()
	{
		return this.result2;
	}

	public void setResult2(String result2)
	{
		this.result2 = result2;
	}

	public String getResult3()
	{
		return this.result3;
	}

	public void setResult3(String result3)
	{
		this.result3 = result3;
	}

	public String getResult4()
	{
		return this.result4;
	}

	public void setResult4(String result4)
	{
		this.result4 = result4;
	}

	public String getResult5()
	{
		return this.result5;
	}

	public void setResult5(String result5)
	{
		this.result5 = result5;
	}

	public String getResult6()
	{
		return this.result6;
	}

	public void setResult6(String result6)
	{
		this.result6 = result6;
	}

	public String getResult7()
	{
		return this.result7;
	}

	public void setResult7(String result7)
	{
		this.result7 = result7;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getRecordName()
	{
		return this.recordName;
	}

	public void setRecordName(String recordName)
	{
		this.recordName = recordName;
	}

	public Date getRecordTime()
	{
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime)
	{
		this.recordTime = recordTime;
	}

	public String getPhenotype()
	{
		return this.phenotype;
	}

	public void setPhenotype(String phenotype)
	{
		this.phenotype = phenotype;
	}

	public Integer getSeqNo()
	{
		return this.seqNo;
	}

	public void setSeqNo(Integer seqNo)
	{
		this.seqNo = seqNo;
	}

	public Character getCrossItem()
	{
		return this.crossItem;
	}

	public void setCrossItem(Character crossItem)
	{
		this.crossItem = crossItem;
	}

}
