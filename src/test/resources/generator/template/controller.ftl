package ${basePackage}.web.controller;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.service.${modelNameUpperCamel}Service;
import ${basePackage}.enums.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import springfox.documentation.annotations.ApiIgnore;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * Created by ${author} on ${date}.
 */
@ApiIgnore
@RestController
@RequestMapping("/${baseRequestMapping}/")
public class ${modelNameUpperCamel}Controller {

    @Autowired
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @ApiIgnore
    @PostMapping("add")
    public Map<String,Object> add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ${modelNameLowerCamel}.setAddTime(simpleDateFormat.format(new Date()));
        ${modelNameLowerCamel}.setModifyTime(simpleDateFormat.format(new Date()));
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("delete")
    public Map<String,Object> delete(@RequestParam Long id) {
	    ${modelNameLowerCamel}Service.deleteById(id);
	    return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("update")
    public Map<String,Object> update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ${modelNameLowerCamel}.setModifyTime(simpleDateFormat.format(new Date()));
	    ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
	    return Result.retrunSucess();
    }

    @ApiIgnore
    @PostMapping("detail")
    public Map<String,Object> detail(@RequestParam Long id) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
        return Result.retrunSucessMsgData(${modelNameLowerCamel});
    }

    @ApiIgnore
    @PostMapping("paging")
    public Map<String,Object> paging(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer limit) {
        Example example=new Example(${modelNameUpperCamel}.class);
        Example.Criteria criteria=example.createCriteria();
        PageHelper.startPage(page, limit);
        PageInfo<${modelNameUpperCamel}> ${modelNameLowerCamel}PageInfo = ${modelNameLowerCamel}Service.queryPageListByWhereExample(" id desc",page,limit,example);
        Map<String,Object> map=Result.retrunSucessMsgData(${modelNameLowerCamel}PageInfo.getList());
        map.put("count",${modelNameLowerCamel}PageInfo.getTotal());
        return map;
    }
}
