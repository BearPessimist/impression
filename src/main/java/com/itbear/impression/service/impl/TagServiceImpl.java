package com.itbear.impression.service.impl;

import com.itbear.impression.entities.pojo.Tag;
import com.itbear.impression.entities.vo.TagVo;
import com.itbear.impression.repositories.TagRepository;
import com.itbear.impression.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author：Bear
 * @site：https://www.yuque.com/bearpess
 * @email：bearpess@gmail.com
 * @created 2021-07-21 20:59:57 星期三
 * <p>
 * features：
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;


    @Override
    public List<TagVo> getAll() {

        var tags = tagRepository.findAll();
        return tags.stream().map(tag -> {
            TagVo tagVo = new TagVo();
            BeanUtils.copyProperties(tag, tagVo);
            return tagVo;
        }).collect(Collectors.toList());
    }
}
