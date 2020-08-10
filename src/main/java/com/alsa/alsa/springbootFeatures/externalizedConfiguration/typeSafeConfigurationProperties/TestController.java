package com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties;

import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.constructorBinding.AcmeProperties2;
import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.javaBeanPropertiesBind.AcmeProperties;
import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.propertiesConversion.AppSystemProperties;
import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.relaxedBinding.OwnerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:15:43
 */
@RestController
@RequestMapping("/PropertiesBind")
public class TestController {

    @Autowired
    private AcmeProperties acmeProperties;

    @Autowired
    private AcmeProperties2 acmeProperties2;

    @Autowired
    private OwnerProperties ownerProperties;

    @Autowired
    private AppSystemProperties appSystemProperties;

    @RequestMapping("/javaBean")
    public Object propertyTest(){
        return "属性值"+acmeProperties;
    }

    @RequestMapping("/custructor")
    public Object propertyTest2(){
        return "属性值"+acmeProperties2;
    }

    @RequestMapping("/relaxed")
    public Object propertyTest3(){
        return "属性值"+ownerProperties;
    }

    @RequestMapping("/relaxedWithMap")
    public Object propertyTest4(){
        Map<String,String> map = ownerProperties.getMap();
        StringBuffer stringBuffer = new StringBuffer("");
        for (Map.Entry<String,String> entry:map.entrySet()){
            stringBuffer.append(entry.getKey()+":"+entry.getValue()+"\n");
        }
        return stringBuffer.toString();
    }

    @RequestMapping("/propertiesConversion/duration")
    public Object propertyTest5() {
        return "sessionTimeOut:"+appSystemProperties.getSessionTimeOut()+" readTimeout:"+appSystemProperties.getReadTimeout()+"name:"+appSystemProperties.getName();
    }

}
