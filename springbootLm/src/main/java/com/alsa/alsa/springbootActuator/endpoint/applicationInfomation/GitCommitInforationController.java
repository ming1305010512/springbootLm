package com.alsa.alsa.springbootActuator.endpoint.applicationInfomation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.GitProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/8/10
 * @Time:19:43
 */
@RestController
@RequestMapping("/git/commit")
public class GitCommitInforationController {

    @Autowired
    private GitProperties gitProperties;

    @RequestMapping("/gitProperties")
    public Object getGitProperties(){
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("git分之："+gitProperties.getBranch());
        stringBuffer.append("git提交id："+gitProperties.getCommitId());
        stringBuffer.append("git提交时间："+gitProperties.getCommitTime());
        return stringBuffer.toString();
    }
}
