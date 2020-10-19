package com.mybatisplus.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: id implements Serializable
 * @author: zxl
 * @create: 2020-10-16 13:58
 **/
@Data
@Accessors(chain = true)
public class BaseInputEntity implements Serializable {

    private static final long serialVersionUID = -6707479883421458981L;
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;

}
