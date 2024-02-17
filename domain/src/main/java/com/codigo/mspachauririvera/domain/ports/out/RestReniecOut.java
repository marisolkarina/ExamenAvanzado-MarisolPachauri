package com.codigo.mspachauririvera.domain.ports.out;

import com.codigo.mspachauririvera.domain.aggregates.response.ResponseReniec;

public interface RestReniecOut {
    ResponseReniec getInfoReniec(String numDoc);
}
