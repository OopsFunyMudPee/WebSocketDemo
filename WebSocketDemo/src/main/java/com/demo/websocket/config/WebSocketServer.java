package com.demo.websocket.config;

import org.springframework.stereotype.Component;

import javax.websocket.server.ServerEndpoint;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/4/26
 * @desc WebSocketServer: WebSocketServer
 */
@Component
@ServerEndpoint("/webSocket/{ip}")
public class WebSocketServer {

}
