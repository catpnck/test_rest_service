package ru.pnck.test_rest_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.pnck.test_rest_service.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService {
    @Override
    public Response modify(Response response) {

        response.setErrorMessage("Что-то сломалось");
        return response;
    }
}
