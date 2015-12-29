package deefw;
// Generated 2015-12-29 13:42:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Counseling generated by hbm2java
 */
public class Counseling implements java.io.Serializable
{

	private int id;
	private Date cslDate;
	private String name;
	private String cslIdentity;
	private String acceptMan;
	private String type;
	private Character transId;
	private String content;
	private String upperRst;
	private String result;
	private String remark;
	private String recordName;
	private Date recordTime;

	public Counseling()
	{
	}

	public Counseling(int id, Date cslDate, String name, String content)
	{
		this.id = id;
		this.cslDate = cslDate;
		this.name = name;
		this.content = content;
	}

	public Counseling(int id, Date cslDate, String name, String cslIdentity, String acceptMan, String type,
			Character transId, String content, String upperRst, String result, String remark, String recordName,
			Date recordTime)
	{
		this.id = id;
		this.cslDate = cslDate;
		this.name = name;
		this.cslIdentity = cslIdentity;
		this.acceptMan = acceptMan;
		this.type = type;
		this.transId = transId;
		this.content = content;
		this.upperRst = upperRst;
		this.result = result;
		this.remark = remark;
		this.recordName = recordName;
		this.recordTime = recordTime;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Date getCslDate()
	{
		return this.cslDate;
	}

	public void setCslDate(Date cslDate)
	{
		this.cslDate = cslDate;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCslIdentity()
	{
		return this.cslIdentity;
	}

	public void setCslIdentity(String cslIdentity)
	{
		this.cslIdentity = cslIdentity;
	}

	public String getAcceptMan()
	{
		return this.acceptMan;
	}

	public void setAcceptMan(String acceptMan)
	{
		this.acceptMan = acceptMan;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Character getTransId()
	{
		return this.transId;
	}

	public void setTransId(Character transId)
	{
		this.transId = transId;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getUpperRst()
	{
		return this.upperRst;
	}

	public void setUpperRst(String upperRst)
	{
		this.upperRst = upperRst;
	}

	public String getResult()
	{
		return this.result;
	}

	public void setResult(String result)
	{
		this.result = result;
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

}
