package com.yc.ifav.client;

import com.yc.ifav.config.FeignClientConfig;
import com.yc.ifav.entity.Favs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="BASE-IFAV-ZUUL-GATEWAY",
        configuration = FeignClientConfig.class
)
public interface FavClient {
    @RequestMapping(method = RequestMethod.POST, value = "/yc-api/tag-proxy/fav/findAll",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String findAll();

    @RequestMapping(method = RequestMethod.POST, value = "/yc-api/tag-proxy/fav/add",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String create(@RequestBody Favs fav);

    @RequestMapping(method = RequestMethod.DELETE, value = "/yc-api/tag-proxy/fav/{id}")
    String delete(@RequestParam("id") Integer id);
}
