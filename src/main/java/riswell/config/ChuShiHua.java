package riswell.config;

import java.io.File;

import javax.transaction.Transactional;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import riswell.util.GongJu;

/**
 * @author HSW 实现数据库初始化
 */
@Component
public class ChuShiHua implements ApplicationListener<ApplicationReadyEvent>
{

	

	@Override
	@Transactional
	public void onApplicationEvent(ApplicationReadyEvent event)
	{
		

		/*********************************************************************************
		 * 
		 * 文件夹初始化
		 * 
		 *********************************************************************************/
		File file = null;

		file = new File(GongJu.getXiangMuLuJing() + "临时文件");
		if (!file.exists() || !file.isDirectory())
		{
			file.mkdir();
		}
		
		file = new File(GongJu.getXiangMuLuJing() + "异常记录");
		if (!file.exists() || !file.isDirectory())
		{
			file.mkdir();
		}
		
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("文件夹初始化完成！");
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("");
		System.err.println("");
		
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("项目路径：");
		System.err.println("		"+GongJu.getXiangMuLuJing());
		System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.err.println("");
		System.err.println("");
		
		

	}

}
