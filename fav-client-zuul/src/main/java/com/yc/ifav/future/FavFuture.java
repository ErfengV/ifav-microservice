package com.yc.ifav.future;

import com.yc.ifav.service.FavRestService;
import com.yc.ifav.entity.Favs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class FavFuture {
    @Autowired
    private FavRestService favRestService;

    @Async
    public CompletableFuture<String> findAll() {
        return CompletableFuture.supplyAsync(() -> {
            //return tagService.list();
            return favRestService.findAll();
        });
    }

    @Async
    public CompletableFuture<String> create(Favs fav) {
        return CompletableFuture.supplyAsync(() -> {
            return favRestService.create(fav);
        });
    }


    @Async
    public CompletableFuture<String> delete(Integer id) {
        return CompletableFuture.supplyAsync(() -> {
            return favRestService.delete(id);
        });
    }
}
