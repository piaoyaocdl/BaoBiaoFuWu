package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.sql.Clob;
import java.util.Date;

/**
 * CBaseCode generated by hbm2java
 */
public class CBaseCode implements java.io.Serializable
{

	private int id;
	private Clob categoryCode;
	private String categoryName;
	private String code;
	private String name;
	private Character useId;
	private Integer seqNo;
	private String remark;
	private String recordName;
	private Date recordTime;
	private String fld1;
	private String fld2;

	public CBaseCode()
	{
	}

	public CBaseCode(int id)
	{
		this.id = id;
	}

	public CBaseCode(int id, Clob categoryCode, String categoryName, String code, String name, Character useId,
			Integer seqNo, String remark, String recordName, Date recordTime, String fld1, String fld2)
	{
		this.id = id;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.code = code;
		this.name = name;
		this.useId = useId;
		this.seqNo = seqNo;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
		this.fld1 = fld1;
		this.fld2 = fld2;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Clob getCategoryCode()
	{
		return this.categoryCode;
	}

	public void setCategoryCode(Clob categoryCode)
	{
		this.categoryCode = categoryCode;
	}

	public String getCategoryName()
	{
		return this.categoryName;
	}

	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Character getUseId()
	{
		return this.useId;
	}

	public void setUseId(Character useId)
	{
		this.useId = useId;
	}

	public Integer getSeqNo()
	{
		return this.seqNo;
	}

	public void setSeqNo(Integer seqNo)
	{
		this.seqNo = seqNo;
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

	public String getFld1()
	{
		return this.fld1;
	}

	public void setFld1(String fld1)
	{
		this.fld1 = fld1;
	}

	public String getFld2()
	{
		return this.fld2;
	}

	public void setFld2(String fld2)
	{
		this.fld2 = fld2;
	}

}