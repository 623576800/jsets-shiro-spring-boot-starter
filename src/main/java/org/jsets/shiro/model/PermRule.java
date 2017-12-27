/*
 * Copyright 2017-2018 the original author(https://github.com/wj596)
 * 
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */
package org.jsets.shiro.model;

import java.io.Serializable;
/**
 * 基于权限的过滤规则
 * 
 * @author wangjie (https://github.com/wj596)
 * @date 2016年6月31日
 *
 */
public class PermRule implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String url;// 资源URL
	private String needPerms;// 访问需要的权限列表(多个权限用逗号分开)
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNeedPerms() {
		return needPerms;
	}
	public void setNeedPerms(String needPerms) {
		this.needPerms = needPerms;
	}

}
