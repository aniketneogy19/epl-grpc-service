package com.example.calculator;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new CalculatorService())
                .build();

        server.start();
        System.out.println("Calculator server started on port " + port);
        server.awaitTermination();
    }
}