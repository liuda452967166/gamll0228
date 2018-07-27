package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)//获取mysql自动增长的主键信息
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    //这里添加的是属性值的集合;用于封装从前台页面过来的数据
    //属性值的集合,如果没有表中的字段;但是实际却需要的时候.则需要加@
    @Transient
    private List<BaseAttrValue> attrValueList;

    public List<BaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<BaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }

    public BaseAttrInfo(String id, String attrName, String catalog3Id) {
        this.id = id;
        this.attrName = attrName;
        this.catalog3Id = catalog3Id;
    }

    public BaseAttrInfo() {

    }

    @Override
    public String toString() {
        return "BaseAttrInfo{" +
                "id='" + id + '\'' +
                ", attrName='" + attrName + '\'' +
                ", catalog3Id='" + catalog3Id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }
}
