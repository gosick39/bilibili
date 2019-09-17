package org.lanqiao.controller;

import org.lanqiao.entity.VideoCollection;
import org.lanqiao.service.VideoCollectionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class VideoCollectionController {
    @Autowired
    VideoCollectionService videoCollectionService;
    @RequestMapping("/getVideoCollection")
    public List<VideoCollection> getVideoCollection(Integer userId){
        return videoCollectionService.getVideoCollection(userId);
    }
}
