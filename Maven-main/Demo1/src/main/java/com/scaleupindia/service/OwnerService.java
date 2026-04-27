package com.scaleupindia.service;

import java.util.List;

import com.scaleupindia.dto.OwnerDTO;

/**
 * @author sharad1606
 *
 */
public interface OwnerService {
	List<OwnerDTO> findAllOwners();
}