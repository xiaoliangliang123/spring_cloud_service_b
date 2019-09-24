package com.serviceb.serviceb.controller;


import com.serviceb.serviceb.model.DataModel;
import com.serviceb.serviceb.model.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2019/9/24 16:42
 * @Description :
 */
@Controller
@RequestMapping("/main")
public class IndexController {

    @RequestMapping(value = "/mainList",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult mainList(){

        List<DataModel> dataModels = new ArrayList<DataModel>(5);
        DataModel dataModel1 = new DataModel("1","data1");
        DataModel dataModel2 = new DataModel("2","data2");
        DataModel dataModel3 = new DataModel("3","data3");

        dataModels.add(dataModel1);
        dataModels.add(dataModel2);
        dataModels.add(dataModel3);

        return new JsonResult(dataModels);
    }
}
