package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * ReactionSetupItem generated by hbm2java
 */
public class ReactionSetupItem implements java.io.Serializable
{

	private int id;
	private ReactionSetup reactionSetup;
	private String classId;
	private String name;
	private BigDecimal vol;
	private String remark;
	private String recordName;
	private Date recordTime;

	public ReactionSetupItem()
	{
	}

	public ReactionSetupItem(int id)
	{
		this.id = id;
	}

	public ReactionSetupItem(int id, ReactionSetup reactionSetup, String classId, String name, BigDecimal vol,
			String remark, String recordName, Date recordTime)
	{
		this.id = id;
		this.reactionSetup = reactionSetup;
		this.classId = classId;
		this.name = name;
		this.vol = vol;
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

	public ReactionSetup getReactionSetup()
	{
		return this.reactionSetup;
	}

	public void setReactionSetup(ReactionSetup reactionSetup)
	{
		this.reactionSetup = reactionSetup;
	}

	public String getClassId()
	{
		return this.classId;
	}

	public void setClassId(String classId)
	{
		this.classId = classId;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getVol()
	{
		return this.vol;
	}

	public void setVol(BigDecimal vol)
	{
		this.vol = vol;
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