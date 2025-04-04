package com.entity.view;

import com.entity.JingyanfenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经验分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 09:30:01
 */
@TableName("jingyanfenxiang")
public class JingyanfenxiangView  extends JingyanfenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingyanfenxiangView(){
	}
 
 	public JingyanfenxiangView(JingyanfenxiangEntity jingyanfenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, jingyanfenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
