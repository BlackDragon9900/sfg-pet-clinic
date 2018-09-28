package com.springfw.sfgpetclinic.service;

import com.springfw.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
