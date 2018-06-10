package com.jokey.study.file;

import com.jokey.study.entity.GeneratorParam;
import com.jokey.study.utils.CodeGenerateUtils;

import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :JokeyFeng
 * Date: 22:37 2018/6/9.
 * Contact :976024396@qq.com
 * Description:service实现类生成器
 */

public class ServiceImplGenerator {

    private GeneratorParam generatorParam;

    public ServiceImplGenerator(GeneratorParam generatorParam) {
        this.generatorParam = generatorParam;
    }

    public void generateServiceImplFile(ResultSet resultSet) throws Exception {
        final String suffix = "ServiceImpl.java";
        final String path = generatorParam.getPath()
                + CodeGenerateUtils.replaceUnderLineAndUpperCase(generatorParam.getTableName())
                + suffix;
        final String templateName = "serviceImpl.ftl";
        File mapperFile = new File(path);
        Map<String, Object> dataMap = new HashMap();
        CodeGenerateUtils.generateFileByTemplate(templateName, mapperFile, dataMap, generatorParam);
    }

}