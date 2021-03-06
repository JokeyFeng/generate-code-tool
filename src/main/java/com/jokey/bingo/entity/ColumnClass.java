package com.jokey.bingo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author :JokeyFeng
 * Date: 21:47 2018/6/9.
 * Contact :976024396@qq.com
 * Description:
 */
@Data
public class ColumnClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库字段名称
     **/
    private String columnName;
    /**
     * 数据库字段类型
     **/
    private String columnType;
    /**
     * 数据库字段首字母小写且去掉下划线字符串
     **/
    private String changeColumnName;
    /**
     * 数据库字段注释
     **/
    private String columnComment;
}
