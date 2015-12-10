package deefw;
// Generated 2015-12-10 14:28:51 by Hibernate Tools 4.3.1.Final

import java.sql.Clob;
import java.util.Date;

/**
 * HlaSbtId generated by hbm2java
 */
public class HlaSbtId implements java.io.Serializable
{

	private int id;
	private String sampleNo;
	private String point;
	private String allelePairs1;
	private String allelePairs2;
	private String allelePairs;
	private Clob useFlag;
	private String sbtImgt;
	private String ssopFlag;
	private Date recordTime;
	private String recordName;
	private String ashiStatus;
	private String cmdpStatus;
	private String localStatus;
	private String alleleResult;
	private String cwdAllele1;
	private String cwdAllele2;
	private String ashiStatus2;
	private String cmdpStatus2;
	private String localStatus2;
	private String ashiResult;
	private String cmdpResult;
	private String localResult;
	private String eitherResult;
	private String addResult;
	private String remainderResult;
	private String suggestResult;
	private String reportResult;
	private String ssResult;
	private String fileName;
	private String remark;
	private String caozuozhe;
	private Date caozuoriqi;
	private String shenhezhe;
	private Date shenheriqi;
	private String querenzhe;
	private Date querenriqi;

	public HlaSbtId()
	{
	}

	public HlaSbtId(int id)
	{
		this.id = id;
	}

	public HlaSbtId(int id, String sampleNo, String point, String allelePairs1, String allelePairs2, String allelePairs,
			Clob useFlag, String sbtImgt, String ssopFlag, Date recordTime, String recordName, String ashiStatus,
			String cmdpStatus, String localStatus, String alleleResult, String cwdAllele1, String cwdAllele2,
			String ashiStatus2, String cmdpStatus2, String localStatus2, String ashiResult, String cmdpResult,
			String localResult, String eitherResult, String addResult, String remainderResult, String suggestResult,
			String reportResult, String ssResult, String fileName, String remark, String caozuozhe, Date caozuoriqi,
			String shenhezhe, Date shenheriqi, String querenzhe, Date querenriqi)
	{
		this.id = id;
		this.sampleNo = sampleNo;
		this.point = point;
		this.allelePairs1 = allelePairs1;
		this.allelePairs2 = allelePairs2;
		this.allelePairs = allelePairs;
		this.useFlag = useFlag;
		this.sbtImgt = sbtImgt;
		this.ssopFlag = ssopFlag;
		this.recordTime = recordTime;
		this.recordName = recordName;
		this.ashiStatus = ashiStatus;
		this.cmdpStatus = cmdpStatus;
		this.localStatus = localStatus;
		this.alleleResult = alleleResult;
		this.cwdAllele1 = cwdAllele1;
		this.cwdAllele2 = cwdAllele2;
		this.ashiStatus2 = ashiStatus2;
		this.cmdpStatus2 = cmdpStatus2;
		this.localStatus2 = localStatus2;
		this.ashiResult = ashiResult;
		this.cmdpResult = cmdpResult;
		this.localResult = localResult;
		this.eitherResult = eitherResult;
		this.addResult = addResult;
		this.remainderResult = remainderResult;
		this.suggestResult = suggestResult;
		this.reportResult = reportResult;
		this.ssResult = ssResult;
		this.fileName = fileName;
		this.remark = remark;
		this.caozuozhe = caozuozhe;
		this.caozuoriqi = caozuoriqi;
		this.shenhezhe = shenhezhe;
		this.shenheriqi = shenheriqi;
		this.querenzhe = querenzhe;
		this.querenriqi = querenriqi;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSampleNo()
	{
		return this.sampleNo;
	}

	public void setSampleNo(String sampleNo)
	{
		this.sampleNo = sampleNo;
	}

	public String getPoint()
	{
		return this.point;
	}

	public void setPoint(String point)
	{
		this.point = point;
	}

	public String getAllelePairs1()
	{
		return this.allelePairs1;
	}

	public void setAllelePairs1(String allelePairs1)
	{
		this.allelePairs1 = allelePairs1;
	}

	public String getAllelePairs2()
	{
		return this.allelePairs2;
	}

	public void setAllelePairs2(String allelePairs2)
	{
		this.allelePairs2 = allelePairs2;
	}

	public String getAllelePairs()
	{
		return this.allelePairs;
	}

	public void setAllelePairs(String allelePairs)
	{
		this.allelePairs = allelePairs;
	}

	public Clob getUseFlag()
	{
		return this.useFlag;
	}

	public void setUseFlag(Clob useFlag)
	{
		this.useFlag = useFlag;
	}

	public String getSbtImgt()
	{
		return this.sbtImgt;
	}

	public void setSbtImgt(String sbtImgt)
	{
		this.sbtImgt = sbtImgt;
	}

	public String getSsopFlag()
	{
		return this.ssopFlag;
	}

	public void setSsopFlag(String ssopFlag)
	{
		this.ssopFlag = ssopFlag;
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

	public String getAshiStatus()
	{
		return this.ashiStatus;
	}

	public void setAshiStatus(String ashiStatus)
	{
		this.ashiStatus = ashiStatus;
	}

	public String getCmdpStatus()
	{
		return this.cmdpStatus;
	}

	public void setCmdpStatus(String cmdpStatus)
	{
		this.cmdpStatus = cmdpStatus;
	}

	public String getLocalStatus()
	{
		return this.localStatus;
	}

	public void setLocalStatus(String localStatus)
	{
		this.localStatus = localStatus;
	}

	public String getAlleleResult()
	{
		return this.alleleResult;
	}

	public void setAlleleResult(String alleleResult)
	{
		this.alleleResult = alleleResult;
	}

	public String getCwdAllele1()
	{
		return this.cwdAllele1;
	}

	public void setCwdAllele1(String cwdAllele1)
	{
		this.cwdAllele1 = cwdAllele1;
	}

	public String getCwdAllele2()
	{
		return this.cwdAllele2;
	}

	public void setCwdAllele2(String cwdAllele2)
	{
		this.cwdAllele2 = cwdAllele2;
	}

	public String getAshiStatus2()
	{
		return this.ashiStatus2;
	}

	public void setAshiStatus2(String ashiStatus2)
	{
		this.ashiStatus2 = ashiStatus2;
	}

	public String getCmdpStatus2()
	{
		return this.cmdpStatus2;
	}

	public void setCmdpStatus2(String cmdpStatus2)
	{
		this.cmdpStatus2 = cmdpStatus2;
	}

	public String getLocalStatus2()
	{
		return this.localStatus2;
	}

	public void setLocalStatus2(String localStatus2)
	{
		this.localStatus2 = localStatus2;
	}

	public String getAshiResult()
	{
		return this.ashiResult;
	}

	public void setAshiResult(String ashiResult)
	{
		this.ashiResult = ashiResult;
	}

	public String getCmdpResult()
	{
		return this.cmdpResult;
	}

	public void setCmdpResult(String cmdpResult)
	{
		this.cmdpResult = cmdpResult;
	}

	public String getLocalResult()
	{
		return this.localResult;
	}

	public void setLocalResult(String localResult)
	{
		this.localResult = localResult;
	}

	public String getEitherResult()
	{
		return this.eitherResult;
	}

	public void setEitherResult(String eitherResult)
	{
		this.eitherResult = eitherResult;
	}

	public String getAddResult()
	{
		return this.addResult;
	}

	public void setAddResult(String addResult)
	{
		this.addResult = addResult;
	}

	public String getRemainderResult()
	{
		return this.remainderResult;
	}

	public void setRemainderResult(String remainderResult)
	{
		this.remainderResult = remainderResult;
	}

	public String getSuggestResult()
	{
		return this.suggestResult;
	}

	public void setSuggestResult(String suggestResult)
	{
		this.suggestResult = suggestResult;
	}

	public String getReportResult()
	{
		return this.reportResult;
	}

	public void setReportResult(String reportResult)
	{
		this.reportResult = reportResult;
	}

	public String getSsResult()
	{
		return this.ssResult;
	}

	public void setSsResult(String ssResult)
	{
		this.ssResult = ssResult;
	}

	public String getFileName()
	{
		return this.fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getCaozuozhe()
	{
		return this.caozuozhe;
	}

	public void setCaozuozhe(String caozuozhe)
	{
		this.caozuozhe = caozuozhe;
	}

	public Date getCaozuoriqi()
	{
		return this.caozuoriqi;
	}

	public void setCaozuoriqi(Date caozuoriqi)
	{
		this.caozuoriqi = caozuoriqi;
	}

	public String getShenhezhe()
	{
		return this.shenhezhe;
	}

	public void setShenhezhe(String shenhezhe)
	{
		this.shenhezhe = shenhezhe;
	}

	public Date getShenheriqi()
	{
		return this.shenheriqi;
	}

	public void setShenheriqi(Date shenheriqi)
	{
		this.shenheriqi = shenheriqi;
	}

	public String getQuerenzhe()
	{
		return this.querenzhe;
	}

	public void setQuerenzhe(String querenzhe)
	{
		this.querenzhe = querenzhe;
	}

	public Date getQuerenriqi()
	{
		return this.querenriqi;
	}

	public void setQuerenriqi(Date querenriqi)
	{
		this.querenriqi = querenriqi;
	}

	public boolean equals(Object other)
	{
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HlaSbtId))
			return false;
		HlaSbtId castOther = (HlaSbtId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSampleNo() == castOther.getSampleNo()) || (this.getSampleNo() != null
						&& castOther.getSampleNo() != null && this.getSampleNo().equals(castOther.getSampleNo())))
				&& ((this.getPoint() == castOther.getPoint()) || (this.getPoint() != null
						&& castOther.getPoint() != null && this.getPoint().equals(castOther.getPoint())))
				&& ((this.getAllelePairs1() == castOther.getAllelePairs1())
						|| (this.getAllelePairs1() != null && castOther.getAllelePairs1() != null
								&& this.getAllelePairs1().equals(castOther.getAllelePairs1())))
				&& ((this.getAllelePairs2() == castOther.getAllelePairs2())
						|| (this.getAllelePairs2() != null && castOther.getAllelePairs2() != null
								&& this.getAllelePairs2().equals(castOther.getAllelePairs2())))
				&& ((this.getAllelePairs() == castOther.getAllelePairs())
						|| (this.getAllelePairs() != null && castOther.getAllelePairs() != null
								&& this.getAllelePairs().equals(castOther.getAllelePairs())))
				&& ((this.getUseFlag() == castOther.getUseFlag()) || (this.getUseFlag() != null
						&& castOther.getUseFlag() != null && this.getUseFlag().equals(castOther.getUseFlag())))
				&& ((this.getSbtImgt() == castOther.getSbtImgt()) || (this.getSbtImgt() != null
						&& castOther.getSbtImgt() != null && this.getSbtImgt().equals(castOther.getSbtImgt())))
				&& ((this.getSsopFlag() == castOther.getSsopFlag()) || (this.getSsopFlag() != null
						&& castOther.getSsopFlag() != null && this.getSsopFlag().equals(castOther.getSsopFlag())))
				&& ((this.getRecordTime() == castOther.getRecordTime()) || (this.getRecordTime() != null
						&& castOther.getRecordTime() != null && this.getRecordTime().equals(castOther.getRecordTime())))
				&& ((this.getRecordName() == castOther.getRecordName()) || (this.getRecordName() != null
						&& castOther.getRecordName() != null && this.getRecordName().equals(castOther.getRecordName())))
				&& ((this.getAshiStatus() == castOther.getAshiStatus()) || (this.getAshiStatus() != null
						&& castOther.getAshiStatus() != null && this.getAshiStatus().equals(castOther.getAshiStatus())))
				&& ((this.getCmdpStatus() == castOther.getCmdpStatus()) || (this.getCmdpStatus() != null
						&& castOther.getCmdpStatus() != null && this.getCmdpStatus().equals(castOther.getCmdpStatus())))
				&& ((this.getLocalStatus() == castOther.getLocalStatus())
						|| (this.getLocalStatus() != null && castOther.getLocalStatus() != null
								&& this.getLocalStatus().equals(castOther.getLocalStatus())))
				&& ((this.getAlleleResult() == castOther.getAlleleResult())
						|| (this.getAlleleResult() != null && castOther.getAlleleResult() != null
								&& this.getAlleleResult().equals(castOther.getAlleleResult())))
				&& ((this.getCwdAllele1() == castOther.getCwdAllele1()) || (this.getCwdAllele1() != null
						&& castOther.getCwdAllele1() != null && this.getCwdAllele1().equals(castOther.getCwdAllele1())))
				&& ((this.getCwdAllele2() == castOther.getCwdAllele2()) || (this.getCwdAllele2() != null
						&& castOther.getCwdAllele2() != null && this.getCwdAllele2().equals(castOther.getCwdAllele2())))
				&& ((this.getAshiStatus2() == castOther.getAshiStatus2())
						|| (this.getAshiStatus2() != null && castOther.getAshiStatus2() != null
								&& this.getAshiStatus2().equals(castOther.getAshiStatus2())))
				&& ((this.getCmdpStatus2() == castOther.getCmdpStatus2())
						|| (this.getCmdpStatus2() != null && castOther.getCmdpStatus2() != null
								&& this.getCmdpStatus2().equals(castOther.getCmdpStatus2())))
				&& ((this.getLocalStatus2() == castOther.getLocalStatus2())
						|| (this.getLocalStatus2() != null && castOther.getLocalStatus2() != null
								&& this.getLocalStatus2().equals(castOther.getLocalStatus2())))
				&& ((this.getAshiResult() == castOther.getAshiResult()) || (this.getAshiResult() != null
						&& castOther.getAshiResult() != null && this.getAshiResult().equals(castOther.getAshiResult())))
				&& ((this.getCmdpResult() == castOther.getCmdpResult()) || (this.getCmdpResult() != null
						&& castOther.getCmdpResult() != null && this.getCmdpResult().equals(castOther.getCmdpResult())))
				&& ((this.getLocalResult() == castOther.getLocalResult())
						|| (this.getLocalResult() != null && castOther.getLocalResult() != null
								&& this.getLocalResult().equals(castOther.getLocalResult())))
				&& ((this.getEitherResult() == castOther.getEitherResult())
						|| (this.getEitherResult() != null && castOther.getEitherResult() != null
								&& this.getEitherResult().equals(castOther.getEitherResult())))
				&& ((this.getAddResult() == castOther.getAddResult()) || (this.getAddResult() != null
						&& castOther.getAddResult() != null && this.getAddResult().equals(castOther.getAddResult())))
				&& ((this.getRemainderResult() == castOther.getRemainderResult())
						|| (this.getRemainderResult() != null && castOther.getRemainderResult() != null
								&& this.getRemainderResult().equals(castOther.getRemainderResult())))
				&& ((this.getSuggestResult() == castOther.getSuggestResult())
						|| (this.getSuggestResult() != null && castOther.getSuggestResult() != null
								&& this.getSuggestResult().equals(castOther.getSuggestResult())))
				&& ((this.getReportResult() == castOther.getReportResult())
						|| (this.getReportResult() != null && castOther.getReportResult() != null
								&& this.getReportResult().equals(castOther.getReportResult())))
				&& ((this.getSsResult() == castOther.getSsResult()) || (this.getSsResult() != null
						&& castOther.getSsResult() != null && this.getSsResult().equals(castOther.getSsResult())))
				&& ((this.getFileName() == castOther.getFileName()) || (this.getFileName() != null
						&& castOther.getFileName() != null && this.getFileName().equals(castOther.getFileName())))
				&& ((this.getRemark() == castOther.getRemark()) || (this.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark().equals(castOther.getRemark())))
				&& ((this.getCaozuozhe() == castOther.getCaozuozhe()) || (this.getCaozuozhe() != null
						&& castOther.getCaozuozhe() != null && this.getCaozuozhe().equals(castOther.getCaozuozhe())))
				&& ((this.getCaozuoriqi() == castOther.getCaozuoriqi()) || (this.getCaozuoriqi() != null
						&& castOther.getCaozuoriqi() != null && this.getCaozuoriqi().equals(castOther.getCaozuoriqi())))
				&& ((this.getShenhezhe() == castOther.getShenhezhe()) || (this.getShenhezhe() != null
						&& castOther.getShenhezhe() != null && this.getShenhezhe().equals(castOther.getShenhezhe())))
				&& ((this.getShenheriqi() == castOther.getShenheriqi()) || (this.getShenheriqi() != null
						&& castOther.getShenheriqi() != null && this.getShenheriqi().equals(castOther.getShenheriqi())))
				&& ((this.getQuerenzhe() == castOther.getQuerenzhe()) || (this.getQuerenzhe() != null
						&& castOther.getQuerenzhe() != null && this.getQuerenzhe().equals(castOther.getQuerenzhe())))
				&& ((this.getQuerenriqi() == castOther.getQuerenriqi())
						|| (this.getQuerenriqi() != null && castOther.getQuerenriqi() != null
								&& this.getQuerenriqi().equals(castOther.getQuerenriqi())));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getSampleNo() == null ? 0 : this.getSampleNo().hashCode());
		result = 37 * result + (getPoint() == null ? 0 : this.getPoint().hashCode());
		result = 37 * result + (getAllelePairs1() == null ? 0 : this.getAllelePairs1().hashCode());
		result = 37 * result + (getAllelePairs2() == null ? 0 : this.getAllelePairs2().hashCode());
		result = 37 * result + (getAllelePairs() == null ? 0 : this.getAllelePairs().hashCode());
		result = 37 * result + (getUseFlag() == null ? 0 : this.getUseFlag().hashCode());
		result = 37 * result + (getSbtImgt() == null ? 0 : this.getSbtImgt().hashCode());
		result = 37 * result + (getSsopFlag() == null ? 0 : this.getSsopFlag().hashCode());
		result = 37 * result + (getRecordTime() == null ? 0 : this.getRecordTime().hashCode());
		result = 37 * result + (getRecordName() == null ? 0 : this.getRecordName().hashCode());
		result = 37 * result + (getAshiStatus() == null ? 0 : this.getAshiStatus().hashCode());
		result = 37 * result + (getCmdpStatus() == null ? 0 : this.getCmdpStatus().hashCode());
		result = 37 * result + (getLocalStatus() == null ? 0 : this.getLocalStatus().hashCode());
		result = 37 * result + (getAlleleResult() == null ? 0 : this.getAlleleResult().hashCode());
		result = 37 * result + (getCwdAllele1() == null ? 0 : this.getCwdAllele1().hashCode());
		result = 37 * result + (getCwdAllele2() == null ? 0 : this.getCwdAllele2().hashCode());
		result = 37 * result + (getAshiStatus2() == null ? 0 : this.getAshiStatus2().hashCode());
		result = 37 * result + (getCmdpStatus2() == null ? 0 : this.getCmdpStatus2().hashCode());
		result = 37 * result + (getLocalStatus2() == null ? 0 : this.getLocalStatus2().hashCode());
		result = 37 * result + (getAshiResult() == null ? 0 : this.getAshiResult().hashCode());
		result = 37 * result + (getCmdpResult() == null ? 0 : this.getCmdpResult().hashCode());
		result = 37 * result + (getLocalResult() == null ? 0 : this.getLocalResult().hashCode());
		result = 37 * result + (getEitherResult() == null ? 0 : this.getEitherResult().hashCode());
		result = 37 * result + (getAddResult() == null ? 0 : this.getAddResult().hashCode());
		result = 37 * result + (getRemainderResult() == null ? 0 : this.getRemainderResult().hashCode());
		result = 37 * result + (getSuggestResult() == null ? 0 : this.getSuggestResult().hashCode());
		result = 37 * result + (getReportResult() == null ? 0 : this.getReportResult().hashCode());
		result = 37 * result + (getSsResult() == null ? 0 : this.getSsResult().hashCode());
		result = 37 * result + (getFileName() == null ? 0 : this.getFileName().hashCode());
		result = 37 * result + (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result + (getCaozuozhe() == null ? 0 : this.getCaozuozhe().hashCode());
		result = 37 * result + (getCaozuoriqi() == null ? 0 : this.getCaozuoriqi().hashCode());
		result = 37 * result + (getShenhezhe() == null ? 0 : this.getShenhezhe().hashCode());
		result = 37 * result + (getShenheriqi() == null ? 0 : this.getShenheriqi().hashCode());
		result = 37 * result + (getQuerenzhe() == null ? 0 : this.getQuerenzhe().hashCode());
		result = 37 * result + (getQuerenriqi() == null ? 0 : this.getQuerenriqi().hashCode());
		return result;
	}

}
