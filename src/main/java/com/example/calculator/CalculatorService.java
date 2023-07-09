package com.example.calculator;

import io.grpc.stub.StreamObserver;

public class CalculatorService extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void add(AddRequest request, StreamObserver<AddResponse> responseObserver) {
        int result = request.getOperand1() + request.getOperand2();
        AddResponse response = AddResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void subtract(SubtractRequest request, StreamObserver<SubtractResponse> responseObserver) {
        int result = request.getOperand1() - request.getOperand2();
        SubtractResponse response = SubtractResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void multiply(MultiplyRequest request, StreamObserver<MultiplyResponse> responseObserver) {
        int result = request.getOperand1() * request.getOperand2();
        MultiplyResponse response = MultiplyResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void divide(DivideRequest request, StreamObserver<DivideResponse> responseObserver) {
        float result = (float) request.getOperand1() / request.getOperand2();
        DivideResponse response = DivideResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
