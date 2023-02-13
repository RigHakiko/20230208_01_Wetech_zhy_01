//package com.zhy.wetech_zhy.move_for_test_mybatisplus.entity;
//
//import com.baomidou.mybatisplus.annotation.TableName;
//import com.baomidou.mybatisplus.annotation.IdType;
//import java.time.LocalDate;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.annotation.TableField;
//import java.io.Serializable;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
///**
// * <p>
// *
// * </p>
// *
// * @author ZHY
// * @since 2023-02-09
// */
//@Data
//@EqualsAndHashCode(callSuper = false)
//@TableName("KoJinJoHoZhy")
//public class KoJinJoHoZhy implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    /**
//     * Id
//     */
//    @TableId(value = "Id", type = IdType.AUTO)
//    private Integer Id;
//
//    /**
//     * 姓（漢字）
//     */
//    @TableField("CP_NameSei")
//    private String cpNameSei;
//
//    /**
//     * 名（漢字）
//     */
//    @TableField("CP_NameMei")
//    private String cpNameMei;
//
//    /**
//     * セイ
//     */
//    @TableField("CP_NameSeiKana")
//    private String cpNameseikana;
//
//    /**
//     * メイ
//     */
//    @TableField("CP_NameMeiKana")
//    private String cpNamemeikana;
//
//    /**
//     * 姓（ローマ字）
//     */
//    @TableField("CU_AlphLastname")
//    private String cuAlphlastname;
//
//    /**
//     * 名（ローマ字）
//     */
//    @TableField("CU_AlphFirstname")
//    private String cuAlphfirstname;
//
//    /**
//     * 国籍
//     */
//    @TableField("CP_Country")
//    private String cpCountry;
//
//    /**
//     * 生年月日
//     */
//    @TableField("CP_BirthDate")
//    private LocalDate cpBirthdate;
//
//    /**
//     * 性別
//     */
//    @TableField("CP_Sex")
//    private String cpSex;
//
//    /**
//     * 電話番号
//     */
//    @TableField("CP_Denwa")
//    private String cpDenwa;
//
//    /**
//     * 携帯電話
//     */
//    @TableField("CP_Phone")
//    private String cpPhone;
//
//    /**
//     * 職業
//     */
//    @TableField("CP_ShokugyoCode")
//    private String cpShokugyocode;
//
//    /**
//     * 勤務先
//     */
//    @TableField("CP_KinmusakiName")
//    private String cpKinmusakiname;
//
//
//}
