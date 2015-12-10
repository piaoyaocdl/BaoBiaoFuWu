package riswell.modular.sysm.ctrl;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import riswell.util.GongJu;

/**
 * 系统的简单 Controller
 * 
 * @author HSW
 *
 */
@Controller
public class XiTongJianDan
{


	/**
	 * 系统所有级别的下载文件
	 * 
	 * @param json
	 *            WenJian类的JSON格式化
	 * @return
	 */
	@RequestMapping("/xiazaiwenjian")
	@ResponseBody
	public ResponseEntity<byte[]> xiazaiwenjian(String json)
	{
		
		ResponseEntity<byte[]> ls = null;
		try
		{
			ls = GongJu.xiazai("", "");
		} catch (IOException e)
		{
		}
		return ls;
	}
}
