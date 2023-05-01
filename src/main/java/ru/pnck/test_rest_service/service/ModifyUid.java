package ru.pnck.test_rest_service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.pnck.test_rest_service.model.Response;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService {

    @Override
    public Response modify(Response response) {

        response.setUid("New Uid");
        return response;
    }
}
