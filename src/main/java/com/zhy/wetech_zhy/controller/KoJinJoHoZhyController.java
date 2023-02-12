package com.zhy.wetech_zhy.controller;


import com.zhy.wetech_zhy.entity.KoJinJoHoZhy;
import com.zhy.wetech_zhy.service.IKoJinJoHoZhyService;
import com.zhy.wetech_zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZHY
 * @since 2023-02-12
 */
@RestController
@RequestMapping("/ko-jin-jo-ho-zhy")
public class KoJinJoHoZhyController {
    @Autowired
    public IKoJinJoHoZhyService iKoJinJoHoZhyService;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @CrossOrigin
    public JsonResult save(@RequestBody KoJinJoHoZhy koJinJoHoZhy){
        JsonResult<Void> result = new JsonResult<>();
        try {
            iKoJinJoHoZhyService.save(koJinJoHoZhy);
//            如果成功将状态设置为200
            result.setState(200);
        } catch (Exception e){
//            如果失败, 将状态设置为4000
            result.setState(4000);
//              失败情况写入错误信息
            result.setMessage("异常发生");
        }
        return result;
    }
}

