package com.project.library.service;

import com.project.library.model.CallCard;

import java.util.List;
import java.util.Optional;

public interface CallCardService {
    public List<CallCard> getAll();

    public CallCard get(Long id);

    public List<CallCard> getAllUnreturned();

    public CallCard addNew(CallCard callCard);

    public CallCard save(CallCard callCard);

    Optional<CallCard> findById(Long id);

}
