package tech.geek.flu.digital.profile.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import tech.geekflu.proto.digital.profile.DigitalProfileQueryRequest;
import tech.geekflu.proto.digital.profile.DigitalProfileRequest;
import tech.geekflu.proto.digital.profile.DigitalProfileResponse;
import tech.geekflu.proto.digital.profile.DigitalProfileServiceGrpc;


@GrpcService
public class DigitalProfileGrpcServer extends DigitalProfileServiceGrpc.DigitalProfileServiceImplBase {

    @Override
    public void findDigitalProfileById(DigitalProfileRequest request, StreamObserver<DigitalProfileResponse> responseObserver) {
        super.findDigitalProfileById(request, responseObserver);
    }

    @Override
    public void findDigitalProfilesByQuery(DigitalProfileQueryRequest request, StreamObserver<DigitalProfileResponse> responseObserver) {
        super.findDigitalProfilesByQuery(request, responseObserver);
    }
}
