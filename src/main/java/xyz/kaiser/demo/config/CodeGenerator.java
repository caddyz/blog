package xyz.kaiser.demo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * author:KarserZ
 * datetime:2018-12-11
 */
public class CodeGenerator {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/blog?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&allowMultiQueries=true";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "123456";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String AUTHOR = "Kaiser";
    //生成的文件输出到哪个目录
    public static final String OUTPUT_FILE = "F:\\blog\\src\\main\\java";
    //包名，会按照com/example/demo这种形式生成类
    public static final String PACKAGE = "xyz.kaiser.demo";

    /*
    TODO 更多配置请参考http://mp.baomidou.com/#/generate-code
    */
    public void generateByTables(boolean serviceNameStartWithI, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(DB_URL)
                .setUsername(USER_NAME)
                .setPassword(PASSWORD)
                .setDriverName(DRIVER);
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true) //全局大写命名
                .setEntityLombokModel(false) //是否为lombok模型
                .setControllerMappingHyphenStyle(true)
                .setRestControllerStyle(true)
                .setTablePrefix("t_")//去除表前缀
                .setNaming(NamingStrategy.underline_to_camel)//表名生成策略
                .setColumnNaming(NamingStrategy.underline_to_camel)//字段生成策略
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor(AUTHOR)
                .setOutputDir(OUTPUT_FILE) //设置文件路径
                .setFileOverride(true) //是否重写文件
                .setOpen(false); //是否打开文件
        if (!serviceNameStartWithI) {
            config.setServiceName("I%sService");
        }
        new AutoGenerator().setTemplateEngine(new FreemarkerTemplateEngine())
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(PACKAGE)
                                .setController("controller")
                                .setEntity("pojo")
                ).execute();
    }

}
