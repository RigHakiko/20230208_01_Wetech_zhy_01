package com.zhy.wetech_zhy.controller;


import com.zhy.wetech_zhy.entity.KoJinJoHoZhy;
import com.zhy.wetech_zhy.service.KoJinJoHoZhyService;
import com.zhy.wetech_zhy.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 *  フロントエンドコントローラ
 * </p>
 *
 * @author ZHY
 * @since 2023-02-12
 */
@RestController
@RequestMapping("/ko-jin-jo-ho-zhy")
public class KoJinJoHoZhyController {
    @Autowired
    public KoJinJoHoZhyService iKoJinJoHoZhyService;
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @CrossOrigin
    public JsonResult save(@RequestBody KoJinJoHoZhy koJinJoHoZhy){
        JsonResult<Void> result = new JsonResult<>();
        try {
            iKoJinJoHoZhyService.save(koJinJoHoZhy);
//            如果成功，将状态设置为200
            //成功した場合、ステータスを200に設定する
            result.setState(200);
        } catch (Exception e){
//            如果失败, 将状态设置为4000
            //失敗した場合は、ステータスを4000に設定。
            result.setState(4000);
//              失败情况写入错误信息
            //エラーメッセージの書き込み
            result.setMessage("异常发生");
        }
        return result;
    }
}

