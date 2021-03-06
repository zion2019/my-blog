package com.huaxing.blog.biz.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.huaxing.framework.datasource.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 博文内容
 * 
 * @author zion
 * @email zhou.hx_sr@neusiri.com
 * @date 2021-05-13 19:41:17
 */
@Data
@TableName("blog_content")
public class BlogContentEntity  extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 博文ID
	 */
	@TableField(value = "blog_id")
	private Long blogId;
	/**
	 * 博文内容
	 */
	@TableField(value = "blog_content")
	private String blogContent;


}
