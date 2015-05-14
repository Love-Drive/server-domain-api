package com.coiol.platform.model;


public class BaseLoginLog {

    private String id; //主键
    private String username; //用户名
    private String password; //密码
    private String createTime; //时间
    private String ip; //IP
    private String userAgent; //设备
    private Integer status; //状态
    private String msg; //消息
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>主键<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return id
	 */
		
	public String getId(){
	   return id;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>主键<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param id
	 */
	public void setId(String id){
	   this.id=id;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>用户名<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return username
	 */
		
	public String getUsername(){
	   return username;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>用户名<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param username
	 */
	public void setUsername(String username){
	   this.username=username;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>密码<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return password
	 */
		
	public String getPassword(){
	   return password;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>密码<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param password
	 */
	public void setPassword(String password){
	   this.password=password;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>创建时间<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return createTime
	 */
	public String getCreateTime(){
	   return createTime;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>创建时间<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param createTime
	 */
	public void setCreateTime(String createTime){
	   this.createTime=createTime;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>IP<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return ip
	 */
		
	public String getIp(){
	   return ip;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>IP<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param ip
	 */
	public void setIp(String ip){
	   this.ip=ip;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>设备<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return userAgent
	 */
		
	public String getUserAgent(){
	   return userAgent;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>设备<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param userAgent
	 */
	public void setUserAgent(String userAgent){
	   this.userAgent=userAgent;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>状态<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return status
	 */
		
	public Integer getStatus(){
	   return status;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>状态<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param status
	 */
	public void setStatus(Integer status){
	   this.status=status;
	}
	
	/**
	 * 
	 * <br>
	 * <b>功能：</b>消息<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @return msg
	 */
		
	public String getMsg(){
	   return msg;
	}
	/**
	 * 
	 * <br>
	 * <b>功能：</b>消息<br>
	 * <b>作者：</b>EingXin<br>
	 * <b>日期：</b> 2014-10-17 <br>
	 * @param msg
	 */
	public void setMsg(String msg){
	   this.msg=msg;
	}
    

	
   

}