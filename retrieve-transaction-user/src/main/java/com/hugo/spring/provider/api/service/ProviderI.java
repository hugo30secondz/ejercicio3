package com.hugo.spring.provider.api.service;

import java.util.List;
import java.util.Optional;

import com.hugo.spring.provider.api.entity.Transactions;

public interface ProviderI {

	List<Transactions> obtenerTransacciones();
}
