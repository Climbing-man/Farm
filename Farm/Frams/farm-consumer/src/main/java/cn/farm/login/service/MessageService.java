package cn.farm.login.service;

import cn.farm.login.dto.MessageExecution;
import cn.farm.login.dto.PageHelperResult;
import cn.farm.login.dto.Result;
import cn.farm.login.enums.MessageStateEnum;
import cn.farm.login.exception.LikeException;
import cn.farm.login.mapper.MessagetMapper;
import cn.farm.login.pojo.Message;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessagetMapper messagetMapper;

    public Result<PageHelperResult> foundByName(String keyword, Integer pageNum, Integer pageSize) {
        //声明数据变量
        Result<PageHelperResult> result;//返回信息
        MessageExecution execution;//返回Data
        PageHelperResult<Message> pageHelperResult = new PageHelperResult<>();
        try{
            //查询所有数据
            List<Message> list = messagetMapper.likeSelect(keyword);
            Integer all = list.size();

            //查询数据库
            PageHelper.startPage(pageNum,pageSize);//从第几条数据开始，每页显示多少条数据
            list = messagetMapper.likeSelect(keyword);
            pageHelperResult.setList(list);
            pageHelperResult.setNumber(all);
            if(list.size() == 0){
                throw new LikeException("查询不到任何信息");
            }

            //构造返回变量
            execution = new MessageExecution(MessageStateEnum.SUCCESS);
            result = new Result(execution.getState(),pageHelperResult,execution.getStateInfo());

            return result;
        }catch(LikeException l){
            throw new LikeException("Login inner error:" + l.getMessage());
        }
    }
}
