package com.app.tools;

import java.util.List;

/**
 * 树 json model 数据
 * @author 
 *
 */
public class JsonTreeData {
 
    public String id;       //json id
    public String pid;      //
    public String text;     //json 显示文本
    public String state;    //json 'open','closed'
    public List<JsonTreeData> children;       //
    public boolean checked;
     
    public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public List<JsonTreeData> getChildren() {
        return children;
    }
    public void setChildren(List<JsonTreeData> children) {
        this.children = children;
    }
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
}