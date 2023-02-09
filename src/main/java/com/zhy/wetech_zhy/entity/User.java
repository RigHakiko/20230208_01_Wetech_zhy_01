package com.zhy.wetech_zhy.entity;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZHY
 * @since 2023-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @TableField("CP_NameSei")
    private String cpNamesei;

    @TableField("CP_Name_Mei")
    private String cpNameMei;

    @TableField("CP_NameMeiKana")
    private String cpNamemeikana;

    @TableField("CU_AlphLastname")
    private String cuAlphlastname;

    @TableField("CU_AlphFirstname")
    private String cuAlphfirstname;

    @TableField("CP_Country")
    private String cpCountry;

    @TableField("CP_BirthDate")
    private LocalDate cpBirthdate;

    @TableField("CP_Sex")
    private String cpSex;

    @TableField("CP_Denwa")
    private String cpDenwa;

    @TableField("CP_Phone")
    private String cpPhone;

    @TableField("CP_ShokugyoCode")
    private String cpShokugyocode;

    @TableField("CP_KinmusakiName")
    private String cpKinmusakiname;


}
