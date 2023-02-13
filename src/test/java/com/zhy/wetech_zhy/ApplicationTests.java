//package com.zhy.wetech_zhy;
//
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
////import com.zhy.wetech_zhy.mapper.UserMapper;
////import com.zhy.wetech_zhy.service.IUserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
////import com.zhy.wetech_zhy.entity.User;
//
//@SpringBootTest
//class ApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//    @Test
//    void generate(){
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("ZHY");
//        gc.setOpen(false);
//        // gc.setSwagger2(true); 实体属性 Swagger2 注解
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/SaiGaiYuShi");
//        // dsc.setSchemaName("public");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("6PTXGtQ5jU7B#mbxEUd");
//        mpg.setDataSource(dsc);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.zhy.wetech_zhy");
//        mpg.setPackageInfo(pc);
//
//
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true);
//        strategy.setRestControllerStyle(true);
//
//        // 写于父类中的公共字段
//
//
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
//        mpg.setStrategy(strategy);
//
//        mpg.execute();
//    }
////
////    @Autowired
////    IUserService iUserService;
////
////    @Autowired
////    UserMapper userMapper;
////    @Test
////    void tmp1(){
////        User user = new User();
////        user.setCpNameMei("1");
////        iUserService.save(user);
////        System.out.println(user);
////    }
////
////    @Test
////    void tmp2(){
////        User user = new User();
////        user.setCpNameMei("2");
////        userMapper.insert(user);
////    }
//}
