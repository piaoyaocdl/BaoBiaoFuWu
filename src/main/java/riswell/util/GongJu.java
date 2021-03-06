package riswell.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class GongJu
{

	
	/**
	 * Spring MVC 的重定向
	 */
	public static final String 重定向 = "redirect:";

	/**
	 * 把数组转换为HashSet
	 * 
	 * @param shuzu
	 *            需要转换的数组
	 * @return 转化后的 Set
	 */
	public static <E> Set<E> shuzu2set(E[] shuzu)
	{
		Set<E> re = new HashSet<>();

		for (int i = 0; i < shuzu.length; i++)
		{
			re.add(shuzu[i]);
		}
		return re;
	}

	/**
	 * List 转换为 Set
	 * 
	 * @param list
	 * @return
	 */
	public static <E> Set<E> list2set(List<E> list)
	{
		Set<E> re = new HashSet<>();
		re.addAll(list);
		return re;
	}

	/**
	 * 获得项目部署的路径
	 * 
	 * @return
	 */
	public static String getXiangMuLuJing()
	{
		String ls = GongJu.class.getClassLoader().getResource("").getPath();
		String re = null;
		if (ls.indexOf(".jar") >= 0)
		{
			re = ls.substring(6, ls.indexOf(".jar") - 7);
		}

		if (ls.indexOf("target") >= 0)
		{
			re = ls.substring(1, ls.indexOf("target"));
		}
		return re;
	}

	/**
	 * 下载文件,只能用于controller 调用
	 * 
	 * @param wenjian
	 *            要下载的文件
	 * @param baocunwei
	 *            要保存为
	 *
	 */
	public static ResponseEntity<byte[]> xiazai(String wenjian, String wenjianjia, String baocunwei) throws IOException
	{
		String path = GongJu.getXiangMuLuJing() + wenjianjia + "/" + wenjian;
		File file = new File(path);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment", new String(baocunwei.getBytes(), "ISO8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
	}

	public static ResponseEntity<byte[]> xiazai(String wenjian, String baocunwei) throws IOException
	{
		return GongJu.xiazai(wenjian, "上传文件", baocunwei);
	}

	/**
	 * 下载模版
	 * 
	 * @param mobanming
	 * @return
	 */
	public static URL getReportTemplate(String mobanming)
	{
		return ClassLoader.getSystemResource("ReportTemplate/" + mobanming);
	}
}
