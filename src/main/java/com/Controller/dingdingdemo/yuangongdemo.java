package com.Controller.dingdingdemo;

/*
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.DingTalkResponse;
import com.dingtalk.api.request.CorpRoleSimplelistRequest;
import com.menus.CodeEnum;
import com.model.DingTalkRequestDemo;
import com.model.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/11")
public class yuangongdemo {

    @RequestMapping("/12")
    public Response get(@RequestBody DingTalkRequestDemo request) throws  Exception{
//        DingTalkClient client = new DefaultDingTalkClient("https://eco.taobao.com/router/rest");
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com");
        CorpRoleSimplelistRequest req = new CorpRoleSimplelistRequest();
        req.setRoleId(1203141L);
        req.setSize(20L);
        req.setOffset(0L);
        DingTalkResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        return  new Response(CodeEnum.SUCCESS,rsp);

    }

}
*/
