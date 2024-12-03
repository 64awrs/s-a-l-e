package com.liz.controller;

import com.liz.entity.Contacts;
import com.liz.entity.Response;
import com.liz.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//注解 annotation
@RestController
@CrossOrigin  //允许跨域访问
@RequestMapping("api/users")
public class UsersController {

    @RequestMapping("all")
    public Response<List<User>> getAllUsers(){
        List<User> users = new ArrayList<User>();

        User u1 = new User();
        u1.setId(1);
        u1.setAccount("账号");
        u1.setName("张三");
        //导入头像
        u1.setAvatar("https://cn.bing.com/images/search?view=detailV2&ccid=IggEulKa&id=EF570752294F283C4467139919AE6DE18539B65B&thid=OIP.IggEulKaQSlG5AIZGd16BQHaDt&mediaurl=https%3a%2f%2fts1.cn.mm.bing.net%2fth%2fid%2fR-C.220804ba529a412946e4021919dd7a05%3frik%3dW7Y5heFtrhmZEw%26riu%3dhttp%253a%252f%252fdata.znds.com%252fattachment%252fforum%252f201609%252f04%252f130847fiv45r1ryinvsl1x.jpg%26ehk%3dWAjH2q3cD0TxapQaJGLKM8JNjZinqwCdV%252bzIlndGm4s%253d%26risl%3d%26pid%3dImgRaw%26r%3d0&exph=1920&expw=3840&q=%e5%9b%be%e7%89%87&simid=608045289902909608&FORM=IRPRST&ck=835FC363F9403F7E4E6166738E18F2B9&selectedIndex=0&itb=0");
        u1.setStatus("激活");

        // 创建联系人列表
        List<Contacts> contacts = new ArrayList<>();
        // 添加QQ联系人
        contacts.add(new Contacts("qq", "12345678"));
        // 添加微信联系人
        contacts.add(new Contacts("wechat", "wechat_name"));
        // 添加手机联系人
        contacts.add(new Contacts("mobile", "13800000000"));
        // 将联系人列表设置给u1
        u1.setContacts(contacts);

        // 设置u1对象的创建时间为当前时间
        u1.setCreated(LocalDateTime.now());
        users.add(u1);

        User u3 = new User();
        u3.setId(3);
        u3.setAccount("账号3");
        u3.setName("王五");
        u3.setAvatar("https://cn.bing.com/images/search?view=detailV2&ccid=dIFgv5Ja&id=61EBDB2C54DA1EC9028B830C825D9CD5273E8601&thid=OIP.dIFgv5Jaess7oclRS7xg2wHaE8&mediaurl=https%3a%2f%2fts1.cn.mm.bing.net%2fth%2fid%2fR-C.748160bf925a7acb3ba1c9514bbc60db%3frik%3dAYY%252bJ9WcXYIMgw%26riu%3dhttp%253a%252f%252fseopic.699pic.com%252fphoto%252f50017%252f0822.jpg_wh1200.jpg%26ehk%3dCMVcdZMU6xxsjVjafO70cFcmJvD62suFC1ytk8UuAUk%253d%26risl%3d%26pid%3dImgRaw%26r%3d0&exph=800&expw=1200&q=%e5%9b%be%e7%89%87&simid=608002344533703829&FORM=IRPRST&ck=94EE30514FB020E057B4249B35B659D8&selectedIndex=19&itb=0");
        u3.setStatus("激活");

        u3.setCreated(LocalDateTime.now());
        users.add(u3);

        User u2 = new User();
        u2.setId(2);
        u2.setAccount("账号2");
        u2.setName("李四");
        u2.setAvatar("https://images.pexels.com/photos/23656764/pexels-photo-23656764.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load");
        u2.setStatus("禁用");
        // 创建联系人列表
        List<Contacts> contacts2 = new ArrayList<>();
        // 添加QQ联系人
        contacts2.add(new Contacts("qq", "12345678"));
        // 添加微信联系人
        contacts2.add(new Contacts("wechat", "wechat_name"));
        // 添加手机联系人
        contacts2.add(new Contacts("mobile", "13800000000"));
        // 将联系人列表设置给u1
        u2.setContacts(contacts2);

        // 设置u2对象的创建时间为当前时间
        u2.setCreated(LocalDateTime.now());
        users.add(u2);

        //封装响应对象
        Response<List<User>> response = new Response<List<User>>(users,58);

        return  response;
    }
}
